package com.springboot.SpringbootProject4.Exception;


public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String message) {
        super(message);
    }
}
