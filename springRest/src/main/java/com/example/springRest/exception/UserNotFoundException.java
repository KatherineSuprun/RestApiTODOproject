package com.example.springRest.exception;

public class UserNotFoundException extends Exception {

    public UserNotFoundException(String message) {
        super (message);
    }
}
