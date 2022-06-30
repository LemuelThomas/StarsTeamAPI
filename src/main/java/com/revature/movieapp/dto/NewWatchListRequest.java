package com.revature.movieapp.dto;

import javax.validation.constraints.NotNull;
import java.util.List;

public class NewWatchListRequest {

    @NotNull
    private int video;
    @NotNull
    private VideoTypeRequest type;
    @NotNull
    private int userId;
    private List<Integer> genre;

    public NewWatchListRequest(int video, VideoTypeRequest type, int userId, List<Integer> genre) {
        this.video = video;
        this.type = type;
        this.userId = userId;
        this.genre = genre;
    }

    public int getVideo() {
        return video;
    }

    public void setVideo(int video) {
        this.video = video;
    }

    public VideoTypeRequest getType() {
        return type;
    }

    public void setType(VideoTypeRequest type) {
        this.type = type;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<Integer> getGenre() {
        return genre;
    }

    public void setGenre(List<Integer> genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "NewWatchListRequest{" +
                "video=" + video +
                ", type=" + type +
                ", userId=" + userId +
                ", genre=" + genre +
                '}';
    }
}
