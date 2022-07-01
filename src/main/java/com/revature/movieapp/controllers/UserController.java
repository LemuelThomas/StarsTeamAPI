package com.revature.movieapp.controllers;


import com.revature.movieapp.dtos.MainAccResponse;
import com.revature.movieapp.dtos.UserResponse;
import com.revature.movieapp.models.Users;
import com.revature.movieapp.services.UserService;
import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

//    @GetMapping(produces = "application/json")
//    public List<UserResponse> getAllUsers(){
//        return userService.fetchAllUsers();
//    }

}
