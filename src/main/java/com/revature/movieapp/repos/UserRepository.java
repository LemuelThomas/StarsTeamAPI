package com.revature.movieapp.repos;

import com.revature.movieapp.models.MainAcc;
import com.revature.movieapp.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users, String> {

    boolean existsByUsername(String username);
    // boolean existsByEmailAddress(String emailAddress);
    // Optional<Users> findUserByEmailAddress(String emailAddress);
    // Optional<Users> findUserByUsernameAndPassword(String username, String password);
//    Optional<MainAcc> findUserAccById(int id);
}
