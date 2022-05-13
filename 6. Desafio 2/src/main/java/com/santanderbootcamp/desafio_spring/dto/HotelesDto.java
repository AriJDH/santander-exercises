package com.santanderbootcamp.desafio_spring.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
//@ScriptAssert(lang = "javascript", script = "_this.disponibleDesde.before(_this.disponibleHasta)")
public class HotelesDto {

    //Se utiliza como punto medio para pasar datos de hoteles y mostrarlos en la pagina
    private String codigoHotel;
    private String nombre;
    private String lugarOciudad;
    private String habitacionTipo;
    private double precioNoche;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate disponibleDesde;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate disponibleHasta;
    private String reservado;

}
