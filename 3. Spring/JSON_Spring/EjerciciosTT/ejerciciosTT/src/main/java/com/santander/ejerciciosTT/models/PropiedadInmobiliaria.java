package com.santander.ejerciciosTT.models;
import java.util.List;

public class PropiedadInmobiliaria {

    private String nombre;
    private String direccion;
    private List<Habitacion> habitacionesDTO;

    public PropiedadInmobiliaria(String nombre, String direccion, List<Habitacion> habitacionesDTO) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.habitacionesDTO = habitacionesDTO;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Habitacion> getHabitaciones() {
        return habitacionesDTO;
    }

    public void setHabitaciones(List<Habitacion> habitacionesDTO) {
        this.habitacionesDTO = habitacionesDTO;
    }

    @Override
    public String toString() {
        return "PropiedadInmobiliariaDTO{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", habitacionesDTO=" + habitacionesDTO +
                '}';
    }
}
