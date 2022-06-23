package com.revature.movieapp;

import com.revature.movieapp.models.MainAcc;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

import java.util.UUID;

@SpringBootApplication
public class MovieApp implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(MovieApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }

    //private final UserRepository userRepo;
}
