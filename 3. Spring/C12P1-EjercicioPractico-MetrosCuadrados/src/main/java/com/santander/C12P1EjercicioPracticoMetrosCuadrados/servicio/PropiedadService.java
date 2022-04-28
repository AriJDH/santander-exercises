package com.santander.C12P1EjercicioPracticoMetrosCuadrados.servicio;

import com.santander.C12P1EjercicioPracticoMetrosCuadrados.dto.HabitacionDto;
import com.santander.C12P1EjercicioPracticoMetrosCuadrados.dto.PropiedadDto;
import com.santander.C12P1EjercicioPracticoMetrosCuadrados.modelos.Habitacion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropiedadService implements IPropiedadService{

    private final Double valor_metro = 800.0;

    @Override
    public Double calcular_propiedad(PropiedadDto propiedadDto) {
        List<HabitacionDto> habitaciones = propiedadDto.getHabitacionesDto();
        double suma = 0.0;
        for (HabitacionDto hab: habitaciones){
            suma = calcular_habitacion(hab);
        }
        return suma;
    }

    @Override
    public Double valor_propiedad(PropiedadDto propiedadDto) {
        Double metros_total = calcular_propiedad(propiedadDto);
        return metros_total * valor_metro;
    }

    @Override
    public HabitacionDto habitacion_mas_grande(PropiedadDto propiedadDto) {
        List<HabitacionDto> habitaciones = propiedadDto.getHabitacionesDto();
        HabitacionDto habitacion = null;
        Double mayor = 0.0;
        Double hab_actual = 0.0;
        for (HabitacionDto hab: habitaciones){
            hab_actual = calcular_habitacion(hab);
            if (hab_actual > mayor ) {
                mayor = hab_actual;
                habitacion = hab;
            }
        }
        return habitacion;
    }

    @Override
    public Double calcular_habitacion(HabitacionDto habitacionDto) {
        Double ancho = habitacionDto.getAncho();
        Double largo = habitacionDto.getLargo();
        return ancho * largo;
    }

}
