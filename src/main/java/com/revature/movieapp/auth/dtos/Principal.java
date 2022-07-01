package com.revature.movieapp.auth.dtos;

import com.revature.movieapp.dtos.MainAccResponse;
import com.revature.movieapp.models.MainAcc;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Principal {

    private int authId;
    private String authEmail;




    public Principal(MainAccResponse user) {
        this.authId = user.getAccount_id();
        this.authEmail = user.getEmail();
    }
//    POTENTIAL PROBLEM WILL ASK WEZLEY LATER
    public Principal(String authEmail, String authId) {
         this.authId = Integer.parseInt(authId);
         this.authEmail = authEmail;
    }

}
