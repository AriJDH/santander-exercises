package com.digitalhouse.obtenerdiploma.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ErrorDTO {
    private String name;
    private String description;

    public ErrorDTO(String mensaje) {
        this.description = "Error "+ name + " " +description;
    }
}
