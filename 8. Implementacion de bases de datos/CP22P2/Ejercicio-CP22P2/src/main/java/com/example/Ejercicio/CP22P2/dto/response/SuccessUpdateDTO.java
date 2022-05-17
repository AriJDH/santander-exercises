package com.example.Ejercicio.CP22P2.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SuccessUpdateDTO {

    private JewerlyResponseDTO jewerlyResponseDTO;

    private Integer code;
}
