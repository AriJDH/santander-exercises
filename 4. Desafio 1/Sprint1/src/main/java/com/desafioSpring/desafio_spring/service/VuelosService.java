package com.desafioSpring.desafio_spring.service;

import com.desafioSpring.desafio_spring.dto.*;
import com.desafioSpring.desafio_spring.dto.request.PayloadVuelosDto;
import com.desafioSpring.desafio_spring.dto.response.ResponsePayloadVuelosDto;
import com.desafioSpring.desafio_spring.excepciones.VuelosException;
import com.desafioSpring.desafio_spring.mapper.VuelosMapper;
import com.desafioSpring.desafio_spring.dto.request.FlightReservationDto;
import com.desafioSpring.desafio_spring.modelos.Vuelos;
import com.desafioSpring.desafio_spring.repo.VuelosDaoJsonImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Service(value = "VuelosService")
public class VuelosService implements IntTurService<FlightReservationDto, VuelosDto>, IntReservas<ResponsePayloadVuelosDto, PayloadVuelosDto> {

    @Autowired
    private VuelosDaoJsonImp vuelosDaoJson;
    @Autowired
    private VuelosMapper vuelosMapper;

    // Devuelve una lista de VuelosDto
    @Override
    public List<VuelosDto> getElementos(){
        List<Vuelos> vuelos = vuelosDaoJson.getElementos();
        List<VuelosDto> vuelosDto = vuelos.stream().map(
                v -> vuelosMapper.toDto(v)).collect(Collectors.toList());
        return vuelosDto;

    }

    // Filtra los vuelos por fecha
    @Override
    public List<VuelosDto> getElementosPorFecha(List<VuelosDto> listaVuelos, String desde, String hasta) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate desdeFecha = LocalDate.parse(desde, formatter);
        LocalDate hastaFecha = LocalDate.parse(hasta, formatter);;

        List<LocalDate> fechas = desdeFecha.datesUntil(hastaFecha.plusDays(1)).collect(Collectors.toList());

        return listaVuelos.stream().filter(v ->
                fechas.stream().anyMatch(f -> v.getFechaIda().isEqual(f))
                        && fechas.stream().anyMatch(f -> v.getFechaVuelta().isEqual(f))
        ).collect(Collectors.toList());
    }

    // Filtra los vuelos por destino
    @Override
    public List<VuelosDto> getElementosPorDestino(List<VuelosDto> listaVuelos, String destino) {

        return listaVuelos.stream().filter(v -> v.getDestino().equalsIgnoreCase(destino)).collect(Collectors.toList());
    }

    //Filtra los vuelos disponibles por fecha y destino
    @Override
    public List<VuelosDto> getElementosDisponiblesPorFechaYDestino(String desde, String hasta, String destino) {

        List<VuelosDto> porFecha = getElementosPorFecha(getElementos(),desde, hasta);
        List<VuelosDto> listaVuelos = getElementosPorDestino(porFecha, destino);
        if (listaVuelos.isEmpty()) throw new VuelosException("No hay vuelos disponibles");
        return listaVuelos;

    }

    //AUXILIAR - CARGA EN EL PAYLOAD EL IMPORTE DE LA COMPRA
    public void calculoYDevolucionDeDatos(ResponsePayloadVuelosDto respuesta){
        List<VuelosDto> vuelosPosibles = getElementosDisponiblesPorFechaYDestino(
                respuesta.getFlightReservationDto().getDateFrom().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), respuesta.getFlightReservationDto().getDateTo().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), //Posibilidad de que no tome bien la fecha, tener en cuenta
                respuesta.getFlightReservationDto().getDestination()
        );

        //Filtrado de vuelo segun el numero de vuelo y el tipo de asiento
        VuelosDto vuelo = vuelosPosibles.stream().filter(v ->
                v.getNroVuelo().equals(respuesta.getFlightReservationDto().getFlightNumber()) &&
                        v.getTipoAsiento().equals(respuesta.getFlightReservationDto().getSeatType())
        ).findFirst().orElse(null);
        if (vuelo == null) throw new VuelosException("El vuelo no existe");

        //calculo del monto a pagar por el vuelo
        respuesta.setInterest(1.55);
        respuesta.setAmount(vuelo.getPrecioPersona() * respuesta.getFlightReservationDto().getSeats());
        respuesta.setTotal(respuesta.getAmount() * respuesta.getInterest());
    }

    //Realiza una reserva
    public ResponsePayloadVuelosDto registrarYMostrarCliente(PayloadVuelosDto cliente) {
        ResponsePayloadVuelosDto reserva = new ResponsePayloadVuelosDto();
        StatusDto statusCode = new StatusDto(200, "El proceso termino satisfactoriamente");
        reserva.setUserName(cliente.getUserName());
        reserva.setFlightReservationDto(vuelosMapper.responseFlightReservation(cliente.getFlightReservation()));
        reserva.setStatusCode(statusCode);
        calculoYDevolucionDeDatos(reserva);
        return reserva;
    }

}
