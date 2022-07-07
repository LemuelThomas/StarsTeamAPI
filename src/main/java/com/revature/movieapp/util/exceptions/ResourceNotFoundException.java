package com.revature.movieapp.util.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException() {
        super("No resource found using the provided search params!");
    }
}
