package com.revature.movieapp.auth;

import com.revature.movieapp.auth.dtos.AuthRequest;
import com.revature.movieapp.auth.dtos.Principal;
import com.revature.movieapp.dtos.MainAccResponse;
import com.revature.movieapp.dtos.UserResponse;
import com.revature.movieapp.services.MainAccService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.Valid;

@Service
@Transactional
public class AuthService {
    private final AuthRepository authRepo;

    @Autowired
    public AuthService(AuthRepository authRepo) {
        this.authRepo = authRepo ;
    }
    public Principal authenticate(@Valid AuthRequest authRequest) {
        return null;
    }

    public Principal authenticateAcctCredentials(@Valid AuthRequest authRequest) {
        return authRepo.findUserByEmailAndPassword(authRequest.getEmail(), authRequest.getPassword())
                .map(MainAccResponse::new)
                .map(Principal::new)
                .orElseThrow(RuntimeException::new);
    }
}
