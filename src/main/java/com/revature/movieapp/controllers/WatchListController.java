package com.revature.movieapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/watchlist")
public class WatchListController {



    @GetMapping("/movies")
    public String test() {
        return "ribbit movies";
    }
}
