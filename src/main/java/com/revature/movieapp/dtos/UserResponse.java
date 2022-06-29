package com.revature.movieapp.dtos;

import com.revature.movieapp.models.Users;
import lombok.*;

@Data
@NoArgsConstructor
public class UserResponse {

    private String username;
    private int acc_id;


    public UserResponse(Users user){
        this.acc_id = user.getUser_id();
        this.username = user.getUsername();
    }
}
