package com.revature.movieapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MovieApp implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(MovieApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }

}
