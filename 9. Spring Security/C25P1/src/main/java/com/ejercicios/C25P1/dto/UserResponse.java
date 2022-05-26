package com.ejercicios.C25P1.dto;

public class UserResponse {
    private String token;

    public UserResponse(String token) {
        this.token = token;
    }

    public UserResponse() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
