package com.example.springRest.exception;

public class UserAlreadyExistException extends Exception {

    public UserAlreadyExistException(String message) {
    super(message);
    }
}
