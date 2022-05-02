package com.inmobiliaria.calcularMetrosCuadrados.services;

import com.inmobiliaria.calcularMetrosCuadrados.datos.HabitacionDTO;
import com.inmobiliaria.calcularMetrosCuadrados.datos.PropiedadDTO;
import com.inmobiliaria.calcularMetrosCuadrados.datos.ResponsePropiedadDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropiedadService {
    public ResponsePropiedadDTO obtenerDatos(PropiedadDTO propiedad) {
        return construirResponse(propiedad);
    }

    private double calcularMetrosCuadradosPropiedad(PropiedadDTO propiedad) {
        double total = 0;
        for (int i = 0; i < propiedad.getHabitaciones().size(); i++) {
            total+=propiedad.getHabitaciones().get(i).getAncho()*propiedad.getHabitaciones().get(i).getLargo();
        }
        return total/2;
    }

    private List<HabitacionDTO> calcularMetrosCuadradosDeHabitacion(PropiedadDTO propiedad){
        HabitacionDTO habitacionAux=null;

        for (int i = 0; i < propiedad.getHabitaciones().size(); i++) {
            habitacionAux = propiedad.getHabitaciones().get(i);
            habitacionAux.setMetrosCuadrados((habitacionAux.getAncho()*habitacionAux.getLargo())/2);
        }
        return propiedad.getHabitaciones();
    }
    private HabitacionDTO calcularHabitacionMasGrande(PropiedadDTO propiedad) {
        HabitacionDTO habitacionMayor = propiedad.getHabitaciones().get(0);
        for (int i = 1; i < propiedad.getHabitaciones().size(); i++) {
            int valor = propiedad.getHabitaciones().get(1).getAncho() * propiedad.getHabitaciones().get(1).getLargo();
            if (habitacionMayor.getLargo() * habitacionMayor.getAncho() < valor) {
                habitacionMayor = propiedad.getHabitaciones().get(i);
            }
        }
        return habitacionMayor;
    }

    private ResponsePropiedadDTO construirResponse(PropiedadDTO propiedad) {
        ResponsePropiedadDTO response = new ResponsePropiedadDTO();
        double metrosCuadrados = calcularMetrosCuadradosPropiedad(propiedad);
        double precio = metrosCuadrados * 800;
        response.setTotalMetrosCuadrados(metrosCuadrados);
        response.setPrecioTotal(precio);
        response.setHabitacionMasGrande(calcularHabitacionMasGrande(propiedad));
        response.setHabitaciones(calcularMetrosCuadradosDeHabitacion(propiedad));
        return response;
    }


}
