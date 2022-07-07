package com.revature.movieapp.auth;

import com.revature.movieapp.models.MainAcc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface AuthRepository extends JpaRepository<MainAcc, String> {
    Optional<MainAcc> findUserByEmailAndPassword(String email, String password);
}

