package com.bootcamp._desafio_spring.model;

import com.bootcamp._desafio_spring.dto.MetodoPagoDto;
import com.bootcamp._desafio_spring.dto.PersonaDto;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Ticket {
    private String codigoVuelo;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate desde;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate hasta;
    private List<PersonaDto> personas;
    private MetodoPagoDto metodoPago;


    public int cantidadPasajeros(){
        return personas.size();
    }
}
