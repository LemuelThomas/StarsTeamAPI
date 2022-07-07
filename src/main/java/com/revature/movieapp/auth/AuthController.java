package com.revature.movieapp.auth;

import com.revature.movieapp.auth.dtos.AuthRequest;
import com.revature.movieapp.auth.dtos.Principal;
import com.revature.movieapp.dtos.MainAccResponse;
import com.revature.movieapp.services.MainAccService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;
    private final TokenService tokenService;

    @Autowired
    public  AuthController(AuthService authService, TokenService tokenService) {

        this.authService = authService;
        this.tokenService = tokenService;
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public Principal authenticate(@RequestBody AuthRequest authRequest, HttpServletResponse resp) {
        Principal payload =  authService.authenticateAcctCredentials(authRequest);
        String token = tokenService.generateToken(payload);
        resp.setHeader("Authorization", token);
        return payload;
    }
}