package com.revature.movieapp.controllers;

import com.revature.movieapp.dto.GenreRequest;
import com.revature.movieapp.dto.NewWatchListRequest;
import com.revature.movieapp.dto.VideoTypeRequest;
import com.revature.movieapp.dto.WatchListResponse;
import com.revature.movieapp.services.WatchListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/watchlist")
public class WatchListController {

    private final WatchListService watchListService;

    @Autowired
    public WatchListController(WatchListService watchListService) {
        this.watchListService = watchListService;
    }

    //testing endpoint
    @GetMapping(value = "/movies", produces = "application/json")
    public WatchListResponse test() {
        VideoTypeRequest VTR = new VideoTypeRequest(1,"Movie");
        List<Integer> genreList = new ArrayList<>();
        genreList.add(28);
        genreList.add(12);
        genreList.add(10751);
        genreList.add(35);
        //GenreRequest GR = new GenreRequest(genreList);
        NewWatchListRequest NWLR = new NewWatchListRequest(675353,VTR,1, genreList);
        return watchListService.createNewMovieWatchList(NWLR);
    }

    @GetMapping(value = "/movies/{userId}", produces = "application/json")
    public List<WatchListResponse> getWatchListByUser(@PathVariable int userId) {
        return watchListService.getMovieWatchList(userId);
    }

    @PostMapping(value = "/movies", consumes = "application/json", produces = "application/json")
    public WatchListResponse addWatchList(@RequestBody NewWatchListRequest NWLR) {
        /*
        //example json
        {
            "video": 675353,
            "userId": 1,
            "type": {
              "id": 1,
              "name": "Movie"
            },
            "genre": [28, 12, 10751, 35]
        }
        */
        return watchListService.createNewMovieWatchList(NWLR);
    }

}
