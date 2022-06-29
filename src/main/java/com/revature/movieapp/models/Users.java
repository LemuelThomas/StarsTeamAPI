package com.revature.movieapp.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "account_user")
public class Users {
    @Column(nullable = false)
    private String username;

    @Id
    private int user_id;

    @ManyToOne
    @JoinColumn(name = "account_id",nullable = false)
    private MainAcc userAcc;

    public Users() {
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public MainAcc getUserAcc() {
        return userAcc;
    }

    public void setUserAcc(MainAcc userAcc) {
        this.userAcc = userAcc;
    }

    @Override
    public String toString() {
        return "Users{" +
                "username='" + username + '\'' +
                ", user_id=" + user_id +
                ", userAcc=" + userAcc +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return user_id == users.user_id && Objects.equals(username, users.username) && Objects.equals(userAcc, users.userAcc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, user_id, userAcc);
    }
}
