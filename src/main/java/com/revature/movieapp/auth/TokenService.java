package com.revature.movieapp.auth;

import com.revature.movieapp.auth.dtos.Principal;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TokenService {

    private final JwtConfig jwtConfig;

    public TokenService(JwtConfig jwtConfig) {
        this.jwtConfig = jwtConfig;
    }


    public String generateToken(Principal subject) {
        long now = System.currentTimeMillis();

        JwtBuilder tokenBuilder = Jwts.builder()
                .setId(String.valueOf(subject.getAuthId()))
                .setIssuer("MovieApp")
                .claim("email", subject.getAuthEmail())
                .setIssuedAt(new Date(now))
                .setExpiration(new Date(now + jwtConfig.getExpiration()))
                .signWith(jwtConfig.getSigAlg(), jwtConfig.getSignInKey());

        return tokenBuilder.compact();
    }

    public Principal extractTokenDetails(String token) {
        if (token == null || token.isEmpty()) {
            throw new RuntimeException();
        }

        try {
            Claims claims = Jwts.parser()
                    .setSigningKey(jwtConfig.getSignInKey())
                    .parseClaimsJws(token)
                    .getBody();

            return  new Principal(claims.getId(), claims.get("email", String.class));

        }  catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }
}
