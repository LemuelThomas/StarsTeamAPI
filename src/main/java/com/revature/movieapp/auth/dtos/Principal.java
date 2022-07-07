package com.revature.movieapp.auth.dtos;

import com.revature.movieapp.dtos.MainAccResponse;
import com.revature.movieapp.dtos.UserResponse;
import com.revature.movieapp.models.MainAcc;
import com.revature.movieapp.models.Users;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
public class Principal {

    private int authId;

    private String authFirstName;
    private String authLastName;
    private String authEmail;
    private String authPassword;
    private Date authAge;
    private int authSubscription;
    private List<String> authAccUsers;



    public Principal(MainAccResponse user) {
        this.authId = user.getAccount_id();
        this.authFirstName = user.getFirstName();
        this.authLastName = user.getLastName();
        this.authEmail = user.getEmail();
        this.authPassword = user.getPassword();
        this.authAge = user.getAge();
        this.authSubscription = user.getSub_id();
        this.authAccUsers = user.getAccUsers();
    }
//    POTENTIAL PROBLEM WILL ASK WEZLEY LATER
    public Principal(String authEmail, String authId) {
         this.authId = Integer.parseInt(authId);
         this.authEmail = authEmail;
    }

}
