package com.revature.movieapp.dto;

import com.revature.movieapp.models.Genre;
import com.revature.movieapp.models.Users;
import com.revature.movieapp.models.VideoType;
import com.revature.movieapp.models.WatchList;

import java.util.List;
import java.util.stream.Collectors;

public class WatchListResponse {
    private int id;
    private int video;
    private int user;
    private String type;
    private List<String> genres;

    public WatchListResponse(WatchList watchList) {
        this.id = watchList.getId();
        this.video = watchList.getVideoId();
        this.user = watchList.getUserId();
        this.type = watchList.getType().getName();
        this.genres = watchList.getGenre().stream().map(Genre::getName).collect(Collectors.toList());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVideo() {
        return video;
    }

    public void setVideo(int video) {
        this.video = video;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    @Override
    public String toString() {
        return "WatchListResponse{" +
                "id=" + id +
                ", video=" + video +
                ", user=" + user +
                ", type='" + type + '\'' +
                ", genres=" + genres +
                '}';
    }
}
