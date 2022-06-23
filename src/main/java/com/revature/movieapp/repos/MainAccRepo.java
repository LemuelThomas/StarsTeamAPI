package com.revature.movieapp.repos;

import com.revature.movieapp.models.MainAcc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainAccRepo extends JpaRepository<MainAcc, String> {
    MainAcc findUserByEmailAddress(String emailAddress);
    MainAcc findUserByUsernameAndPassword(String username, String password);
}
