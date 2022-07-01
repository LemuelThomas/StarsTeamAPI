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

    private final MainAccService accService;
    private final TokenService tokenService;

    @Autowired
    public  AuthController(MainAccService accService, TokenService tokenService) {

        this.accService = accService;
        this.tokenService = tokenService;
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public Principal authenticate(@RequestBody AuthRequest authRequest, HttpServletResponse resp) {
        MainAccResponse authUser =  accService.authenticateAcctCredentials(authRequest);
        Principal payload = new Principal(authUser);
        String token = tokenService.generateToken(payload);
        resp.setHeader("Authorization", token);
        return payload;
    }
}