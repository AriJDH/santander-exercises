package com.bootcamp._desafio_spring.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Data
public class TicketDtoBase {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate desde;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate hasta;
    private String origen;
    private String destino;
    private String codigoVuelo;
    private int asientos;
    private String tipoAsiento;
    private List<PersonaDto> personas;

}
