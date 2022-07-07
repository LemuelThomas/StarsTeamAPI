package com.revature.movieapp.dtos;

import com.revature.movieapp.models.MainAcc;
import com.revature.movieapp.models.Users;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
public class MainAccResponse {

    private List<String> accUsers;
    private int account_id;
    private int sub_id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Date age;

    public MainAccResponse(MainAcc mainAcc){
        this.accUsers = mainAcc.getAccUsers().stream().map(Users::getUsername).collect(Collectors.toList());
        this.account_id = mainAcc.getId();
        this.sub_id = mainAcc.getSub_id();
        this.lastName = mainAcc.getFirstName();
        this.firstName = mainAcc.getLastName();
        this.email = mainAcc.getEmail();
        this.password = mainAcc.getPassword();
        this.age = mainAcc.getAge();
    }
}
