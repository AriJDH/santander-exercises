package com.santander.bootcamp.M9C22P2.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class SuccessDTO {

    private int statusCode;

    private String message;

}
