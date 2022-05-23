package com.santander.sorteo.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SuccessDTO {
    private Integer status;
    private String descripcion;
}
