package com.revature.movieapp.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Entity
@Table(name = "stars_account")
public class MainAcc  {
    @Column(name = "subscription_id", nullable = false)
    private int sub_id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = true)
    private String lastName;
    @Column(nullable = false, unique = true)
    private String email;
//    @Column(nullable = false, unique = true)
//    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false, columnDefinition = "DATE")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date age;
    @Id
    @Column(name = "account_id",nullable = false)
    private int id;

    @OneToMany(mappedBy = "userAcc")
    private List<Users> accUsers;

    public MainAcc() {
    }

    public MainAcc(int sub_id, String firstName, String lastName, String email, String username, String password, Date age, int id) {
        this.sub_id = sub_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

        this.password = password;
        this.age = age;
        this.id = id;
    }

    public int getSub_id() {
        return sub_id;
    }

    public void setSub_id(int sub_id) {
        this.sub_id = sub_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getAge() {
        return age;
    }

    public void setAge(Date age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Users> getAccUsers() {
        return accUsers;
    }

    public void setAccUsers(List<Users> accUsers) {
        this.accUsers = accUsers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MainAcc mainAcc = (MainAcc) o;
        return sub_id == mainAcc.sub_id && age == mainAcc.age && id == mainAcc.id && Objects.equals(firstName, mainAcc.firstName) && Objects.equals(lastName, mainAcc.lastName) && Objects.equals(email, mainAcc.email) && Objects.equals(password, mainAcc.password) && Objects.equals(accUsers, mainAcc.accUsers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sub_id, firstName, lastName, email, password, age, id, accUsers);
    }

    @Override
    public String toString() {
        return "MainAcc{" +
                "sub_id=" + sub_id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
//                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", accUsers=" + accUsers.stream().map(Users::getUser_id).collect(Collectors.toList()) +
        '}';
    }
}
