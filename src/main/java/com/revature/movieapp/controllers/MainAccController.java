package com.revature.movieapp.controllers;


import com.revature.movieapp.dtos.MainAccResponse;
import com.revature.movieapp.dtos.UserResponse;
import com.revature.movieapp.services.MainAccService;
import com.revature.movieapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainAccController {

    private final MainAccService mainAccService;
    private final UserService userService;

    @Autowired
    public MainAccController(MainAccService mainAccService, UserService userService){
        this.mainAccService = mainAccService;
        this.userService = userService;
    }

//    @GetMapping(produces = "application/json")
//    public List<MainAccResponse> getAllUsers(){
//        return mainAccService.fetchAllUsers();
//    }
    @GetMapping("/{account_id}")
    public MainAccResponse getAccById(@PathVariable int account_id){
        return mainAccService.fetchAccById((account_id));
    }
    @GetMapping("/{acc_id}/Users")
    public UserResponse fetchUsersFromMainAcc(@PathVariable int acc_id){
        return userService.fetchUsersFromMainAcc((acc_id));
    }
}


