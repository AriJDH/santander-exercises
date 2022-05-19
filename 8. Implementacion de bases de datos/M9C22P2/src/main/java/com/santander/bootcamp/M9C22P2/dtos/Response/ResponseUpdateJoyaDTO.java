package com.santander.bootcamp.M9C22P2.dtos.Response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ResponseUpdateJoyaDTO {

    private int statusCode;

    private ResponseJoyaDTO joya;

}
