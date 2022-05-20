package com.santander.moviesapp.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class ExceptionDTO implements Serializable {
    private String error_exception;
    private List<String> error_messages;

    public ExceptionDTO() {
        this.error_messages = new ArrayList<>();
    }

    public void setError_message(String error_message) {
        this.error_messages.add(error_message);
    }
}
