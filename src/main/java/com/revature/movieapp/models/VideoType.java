package com.revature.movieapp.models;

import javax.persistence.*;

@Entity
@Table(name = "video_type")
public class VideoType {
    @Id
    @Column(name = "type_id")
    private int id;
    @Column(name = "type_name")
    private String name;

    public VideoType() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
