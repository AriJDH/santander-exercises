package com.bootcamp.calculadoraMetrosCuadrados.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class PropiedadInmobiliaria {

    String nombre, direccion;
    List<Habitacion> habitaciones;

}
