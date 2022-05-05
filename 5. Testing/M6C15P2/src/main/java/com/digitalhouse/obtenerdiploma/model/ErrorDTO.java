package com.digitalhouse.obtenerdiploma.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ErrorDTO {

    private int status;
    private String message;
    private String description;

}
