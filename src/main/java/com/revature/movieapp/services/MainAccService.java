package com.revature.movieapp.services;

import com.revature.movieapp.auth.dtos.AuthRequest;
import com.revature.movieapp.dtos.MainAccResponse;
import com.revature.movieapp.dtos.UserResponse;
import com.revature.movieapp.repos.MainAccRepository;
import com.revature.movieapp.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MainAccService {

    private final MainAccRepository mainAccRepo;

    @Autowired
    public MainAccService(MainAccRepository mainAccRepo){
        this.mainAccRepo = mainAccRepo;
    }

//    public List<MainAccResponse> fetchAllUsers(){
//        return mainAccRepo.findAll()
//                .stream()
//                .map(MainAccResponse::new)
//                .collect(Collectors.toList());
//    }

//    public Optional<MainAccResponse> fetchAccById(int id){
//       return mainAccRepo.findById(id).map(MainAccResponse::new);
//
//    }
    public MainAccResponse fetchAccById(int id){
        return mainAccRepo.findById(id)
                .map(MainAccResponse::new)
                .orElseThrow(() -> new RuntimeException("no account found with id"));
    }

    public MainAccResponse authenticateAcctCredentials(AuthRequest authRequest) {
        return mainAccRepo.findUserByEmailAndPassword(authRequest.getEmail(), authRequest.getPassword())
                .map(MainAccResponse::new)
                .orElseThrow(RuntimeException::new);
    }

}
