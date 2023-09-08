package com.alireza.school.exceptions.school;

public class SchoolNotFoundException extends RuntimeException {
    public SchoolNotFoundException(String message) {
        super(message);
    }
}
