package com.ejercicios.CP11P2Individual.modelo;

import com.ejercicios.CP11P2Individual.servicios.EntidadServicio;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Entidad extends EntidadServicio {
    private int diaNac;
    private int mesNac;
    private int anoNac;
}
