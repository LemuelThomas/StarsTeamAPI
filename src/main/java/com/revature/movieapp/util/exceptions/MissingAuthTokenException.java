package com.revature.movieapp.util.exceptions;

public class MissingAuthTokenException extends RuntimeException{
    public MissingAuthTokenException() {
        super("There was no authorization token found on the request");
    }
}
