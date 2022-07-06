package com.revature.movieapp.auth;

import com.revature.movieapp.auth.dtos.AuthRequest;
import com.revature.movieapp.auth.dtos.Principal;
import com.revature.movieapp.services.MainAccService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.Valid;

@Service
@Transactional
public class AuthService {
    private final MainAccService accService;

    @Autowired
    public AuthService(MainAccService accService) {
        this.accService = accService;
    }
    public Principal authenticate(@Valid AuthRequest authRequest) {
        return null;
    }
}
