package com.revature.movieapp.repos;

import com.revature.movieapp.models.MainAcc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Optional;

@Repository
public interface MainAccRepository extends JpaRepository<MainAcc, String> {
//        boolean existsByUsername(String username);
//        MainAcc findUserByEmailAddress(String email);
//        MainAcc findUserByEmailAndPassword(String email, String password);
    Optional<MainAcc> findMainAccById(int id);

}
