package com.bootcamp._desafio_spring.model;

import org.json.simple.JSONObject;

import java.time.format.DateTimeFormatter;

public class FabricaObjetoJson {

    private final DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public JSONObject crearJsonVuelo(Vuelo vuelo) {
        JSONObject vueloJSON =  new JSONObject();

        vueloJSON.put("nroVuelo", vuelo.getNroVuelo());
        vueloJSON.put("origen", vuelo.getOrigen());
        vueloJSON.put("destino", vuelo.getDestino());
        vueloJSON.put("tipoAsiento", vuelo.getTipoAsiento());
        vueloJSON.put("precioPersona", vuelo.getPrecioPersona());

        String sFechaIda = vuelo.getFechaIda().format(formatters);
        String sFechaVuelta = vuelo.getFechaVuelta().format(formatters);

        vueloJSON.put("fechaIda", sFechaIda);
        vueloJSON.put("fechaVuelta", sFechaVuelta);

        return vueloJSON;
    }

    public JSONObject crearJsonHotel(Hotel hotel) {

        JSONObject hotelJSON =  new JSONObject();

        hotelJSON.put("codigoHotel", hotel.getCodigoHotel());
        hotelJSON.put("nombre", hotel.getNombre());
        hotelJSON.put("lugarOCiudad", hotel.getLugarOCiudad());
        hotelJSON.put("habitacionTipo", hotel.getHabitacionTipo());
        hotelJSON.put("precioNoche", hotel.getPrecioNoche());
        hotelJSON.put("reservado", hotel.getReservado());

        String sFechaIda = hotel.getDisponibleDesde().format(formatters);
        String sFechaVuelta = hotel.getDisponibleHasta().format(formatters);

        hotelJSON.put("disponibleDesde", sFechaIda);
        hotelJSON.put("disponibleHasta", sFechaVuelta);

        return hotelJSON;
    }
}
