package com.revature.movieapp.services;

import com.revature.movieapp.dtos.UserResponse;
import com.revature.movieapp.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService{
    private final UserRepository userRepo;

    @Autowired
    public UserService(UserRepository userRepo){
        this.userRepo = userRepo;
    }

    public List<UserResponse> fetchAllUsers(){
        return userRepo.findAll()
                    .stream()
                    .map(UserResponse::new)
                    .collect(Collectors.toList());
    }
}