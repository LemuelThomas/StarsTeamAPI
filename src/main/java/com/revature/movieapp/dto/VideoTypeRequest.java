package com.revature.movieapp.dto;

import javax.validation.constraints.NotNull;

public class VideoTypeRequest {

    @NotNull
    private int id;
    private String name;

    public VideoTypeRequest(int id,String name) {
        this.id = id;
        this.name = name;
    }

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
