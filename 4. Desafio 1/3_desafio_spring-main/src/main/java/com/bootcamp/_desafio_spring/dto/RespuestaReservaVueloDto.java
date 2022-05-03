package com.bootcamp._desafio_spring.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class RespuestaReservaVueloDto {

    private String nombreUsuario;
    private Double monto;
    private Double intereses;
    private Double total;

    @JsonProperty("ticket")
    private TicketDtoBase ticketDto;
    @JsonProperty("codigoRespuesta")
    private RespuestaDto respuestaDto;

}
