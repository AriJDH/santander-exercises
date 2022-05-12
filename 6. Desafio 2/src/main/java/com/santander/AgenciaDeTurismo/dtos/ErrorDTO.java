package com.santander.AgenciaDeTurismo.dtos;

public class ErrorDTO extends ResponseStatusDTO {
    private String description;

    public ErrorDTO(int code, String message, String description) {
        super(code, message);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
