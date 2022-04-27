package com.bootcamp.calculadoraMetrosCuadrados.services;

import com.bootcamp.calculadoraMetrosCuadrados.dao.DAO;
import com.bootcamp.calculadoraMetrosCuadrados.dao.DaoImplementsPropiedadHashMap;
import com.bootcamp.calculadoraMetrosCuadrados.models.Habitacion;
import com.bootcamp.calculadoraMetrosCuadrados.models.PropiedadInmobiliaria;

import java.util.List;

public class PropiedadService {

    DAO dao = new DaoImplementsPropiedadHashMap();

    public double calcularMetrosCuadrados(String nombrePropiedad){
        double metrosCuadrados = 0;
        PropiedadInmobiliaria propiedad = dao.getElement(nombrePropiedad);

        for (Habitacion habitacion: propiedad.getHabitaciones()) {
            metrosCuadrados = metrosCuadrados + (habitacion.getAncho() * habitacion.getLargo());
        }
        return metrosCuadrados;
    }

    public void addPropiedad(PropiedadInmobiliaria propiedad) {
        dao.addElement(propiedad);
    }

    public List<PropiedadInmobiliaria> getPropiedades() {
        return dao.getElements();
    }

    public PropiedadInmobiliaria getPropiedadByNombre(String nombrePropiedad){
        return dao.getElement(nombrePropiedad);
    }

    public double calcularValorPropiedad(String nombrePropiedad) {
        return calcularMetrosCuadrados(nombrePropiedad) * 800;
    }

    public Habitacion getHabitacionMasGrande(String nombrePropiedad) {
        Habitacion habitacionMasGrande = new Habitacion("Default", 0, 0);
        PropiedadInmobiliaria propiedad = dao.getElement(nombrePropiedad);

        for (Habitacion habitacion: propiedad.getHabitaciones()) {
            if((habitacionMasGrande.getLargo() * habitacionMasGrande.getAncho()) < (habitacion.getAncho() * habitacion.getLargo())){
                habitacionMasGrande = habitacion;
            }
        }

        return habitacionMasGrande;
    }

    public String[][] getMetrosCuadradosHabitaciones(String nombrePropiedad) {


        PropiedadInmobiliaria propiedad = dao.getElement(nombrePropiedad);
        String habitaciones[][] = new String[propiedad.getHabitaciones().size()][2];
        int contadorHabitaciones = 0;

        for (Habitacion habitacion: propiedad.getHabitaciones()) {

            habitaciones[contadorHabitaciones][0] = habitacion.getNombre();
            habitaciones[contadorHabitaciones][1] = String.valueOf(habitacion.getAncho() * habitacion.getLargo());

            contadorHabitaciones = contadorHabitaciones + 1;
        }


        return habitaciones;
    }
}
