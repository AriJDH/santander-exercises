package com.santander.C12P1EjercicioPracticoMetrosCuadrados.servicio;

import com.santander.C12P1EjercicioPracticoMetrosCuadrados.dto.HabitacionDto;
import com.santander.C12P1EjercicioPracticoMetrosCuadrados.dto.PropiedadDto;
import com.santander.C12P1EjercicioPracticoMetrosCuadrados.modelos.Habitacion;


public interface IPropiedadService {

    //Recibe una propiedad y calcula el total de metros cuadrado de todas las habitaciones
    public Double calcular_propiedad(PropiedadDto propiedadDto);

    //Recibe una propiedad y valua el total de toda la propieda
    public Double valor_propiedad(PropiedadDto propiedadDto);

    //Recibe una propiedad y devuelve los datos de la habitacion más grande
    public HabitacionDto habitacion_mas_grande(PropiedadDto propiedadDto);

    //Recibe una habitacion y calcula sus metros cuadrados
    public Double calcular_habitacion(HabitacionDto habitacionDto);
}
