package com.revature.movieapp.util.exceptions;

public class TokenParseException extends AuthenticationException{
    public TokenParseException(Throwable cause) {
        super("The provided token could not be parsed", cause);
    }

    public TokenParseException(String message, Throwable cause) {
        super(message, cause);
    }
}
