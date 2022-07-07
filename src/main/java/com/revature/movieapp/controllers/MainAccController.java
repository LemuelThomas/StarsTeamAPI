package com.revature.movieapp.controllers;


import com.revature.movieapp.dtos.MainAccResponse;
import com.revature.movieapp.services.MainAccService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/main")
public class MainAccController {

    private final MainAccService mainAccService;

    @Autowired
    public MainAccController(MainAccService mainAccService){
        this.mainAccService = mainAccService;
    }

//    @GetMapping(produces = "application/json")
//    public List<MainAccResponse> getAllUsers(){
//        return mainAccService.fetchAllUsers();
//    }
    @GetMapping("/{account_id}")
    public MainAccResponse getAccById(@PathVariable int account_id){
        return mainAccService.fetchAccById((account_id));
    }
}


