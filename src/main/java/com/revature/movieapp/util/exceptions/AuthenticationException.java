package com.revature.movieapp.util.exceptions;

public class AuthenticationException  extends RuntimeException{
    public AuthenticationException() {
        super("No user record found using the provided credentials!");
    }

    public AuthenticationException(String message) {
        super(message);
    }

    public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }
}
