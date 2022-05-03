package com.bootcamp._desafio_spring.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

//TODO: hacer clase padre de Respuesta y Request
public class RespuestaReservaDto {
    private String nombreUsuario;
    private Double monto;
    private Double intereses;
    private Double total;

    @JsonProperty("booking")
    private BookingDtoBase bookingDto;
    @JsonProperty("codigoRespuesta")
    private RespuestaDto respuestaDto;
}
