package com.revature.movieapp.services;

import com.revature.movieapp.auth.dtos.AuthRequest;
import com.revature.movieapp.dtos.MainAccResponse;
import com.revature.movieapp.repos.MainAccRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
    public Optional<MainAccResponse> fetchAccById(int id){
        return mainAccRepo.findMainAccById(id).map(MainAccResponse::new);
    }

    public MainAccResponse authenticateAcctCredentials(AuthRequest authRequest) {
        return mainAccRepo.findUserByEmailAndPassword(authRequest.getEmail(), authRequest.getPassword())
                .map(MainAccResponse::new)
                .orElseThrow(RuntimeException::new);
    }
}
