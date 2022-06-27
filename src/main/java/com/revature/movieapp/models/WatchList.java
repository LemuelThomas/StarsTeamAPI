package com.revature.movieapp.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "watch_list")
public class WatchList {

    @Id
    @Column(name = "watch_list_id")
    private int id;

    @Column(name = "video_id")
    private int videoId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users userId;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private VideoType type;

    @ManyToMany
    @JoinTable(
          name = "watch_list_genre",
            joinColumns = @JoinColumn(name = "watch_list_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id")
    )
    private List<Genre> genre;

    public WatchList() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }

    public VideoType getType() {
        return type;
    }

    public void setType(VideoType type) {
        this.type = type;
    }

    public List<Genre> getGenre() {
        return genre;
    }

    public void setGenre(List<Genre> genre) {
        this.genre = genre;
    }
}
