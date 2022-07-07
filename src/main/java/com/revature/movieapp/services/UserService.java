package com.revature.movieapp.services;

import com.revature.movieapp.dtos.UserResponse;
import com.revature.movieapp.repos.MainAccRepository;
import com.revature.movieapp.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService{
    private final UserRepository userRepo;
    private final MainAccRepository mainAccRepo;

    @Autowired
    public UserService(UserRepository userRepo, MainAccRepository mainAccRepo){
        this.userRepo = userRepo;
        this.mainAccRepo = mainAccRepo;
    }

    public UserResponse fetchUsersFromMainAcc(int id){
        return mainAccRepo.findById(id)
                .map(UserResponse::new)
                .orElseThrow(() -> new RuntimeException("no account found with id"));
    }

}