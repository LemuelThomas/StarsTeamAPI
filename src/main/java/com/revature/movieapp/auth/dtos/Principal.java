package com.revature.movieapp.auth.dtos;

import com.revature.movieapp.dtos.MainAccResponse;
import com.revature.movieapp.models.MainAcc;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

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




    public Principal(MainAccResponse user) {
        this.authId = user.getAccount_id();
        this.authFirstName = user.getFirstName();
        this.authLastName = user.getLastName();
        this.authEmail = user.getEmail();
        this.authPassword = user.getPassword();
        this.authAge = user.getAge();
        this.authSubscription = user.getSub_id();

    }
//    POTENTIAL PROBLEM WILL ASK WEZLEY LATER
    public Principal(String authEmail, String authId) {
         this.authId = Integer.parseInt(authId);
         this.authEmail = authEmail;
    }

}
