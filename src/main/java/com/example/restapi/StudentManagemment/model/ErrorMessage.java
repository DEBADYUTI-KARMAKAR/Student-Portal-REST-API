package com.example.restapi.StudentManagemment.model;

import org.springframework.http.HttpStatus;

public class ErrorMessage {

    private HttpStatus ststus;
    private String message;

    public HttpStatus getStstus() {
        return ststus;
    }

    public void setStstus(HttpStatus ststus) {
        this.ststus = ststus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ErrorMessage() {
    }

    public ErrorMessage(HttpStatus ststus, String message) {
        this.ststus = ststus;
        this.message = message;
    }
}
