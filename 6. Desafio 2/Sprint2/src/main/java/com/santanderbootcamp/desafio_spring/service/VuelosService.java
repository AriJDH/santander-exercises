package com.santanderbootcamp.desafio_spring.service;

import com.santanderbootcamp.desafio_spring.dto.StatusDto;
import com.santanderbootcamp.desafio_spring.dto.VuelosDto;
import com.santanderbootcamp.desafio_spring.dto.request.PayloadVuelosDto;
import com.santanderbootcamp.desafio_spring.dto.response.ResponsePayloadVuelosDto;
import com.santanderbootcamp.desafio_spring.excepciones.FechasNoValidasException;
import com.santanderbootcamp.desafio_spring.excepciones.VuelosException;
import com.santanderbootcamp.desafio_spring.mapper.VuelosMapper;
import com.santanderbootcamp.desafio_spring.modelos.Vuelos;
import com.santanderbootcamp.desafio_spring.repo.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Service(value = "VuelosService")
public class VuelosService implements IntTurService<VuelosDto>, IntReservas<ResponsePayloadVuelosDto, PayloadVuelosDto> {

    @Autowired
    private Dao<String,Vuelos> vuelosDaoJson;
    @Autowired
    private VuelosMapper vuelosMapper;

    // Devuelve una lista de VuelosDto
    @Override
    public List<VuelosDto> getElementos(){
        List<Vuelos> vuelos = vuelosDaoJson.getElementos();
        return vuelos.stream().map(
                v -> vuelosMapper.toDto(v)).collect(Collectors.toList());

    }

    // Filtra los vuelos por fecha
    @Override
    public List<VuelosDto> getElementosPorFecha(List<VuelosDto> listaVuelos, String desde, String hasta) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate desdeFecha = LocalDate.parse(desde, formatter);
        LocalDate hastaFecha = LocalDate.parse(hasta, formatter);
        if(hastaFecha.isBefore(desdeFecha) || hastaFecha.equals(desdeFecha)) throw new FechasNoValidasException("La fecha de entrada debe ser menor a la de salida");
        List<LocalDate> fechas = desdeFecha.datesUntil(hastaFecha.plusDays(1)).collect(Collectors.toList());

        return listaVuelos.stream().filter(v ->
                fechas.stream().anyMatch(f -> v.getFechaIda().isEqual(f))
                        && fechas.stream().anyMatch(f -> v.getFechaVuelta().isEqual(f))
        ).collect(Collectors.toList());
    }

    // Filtra los vuelos por destino
    @Override
    public List<VuelosDto> getElementosPorDestino(List<VuelosDto> listaVuelos, String destino) {
        List<VuelosDto> vuelos = listaVuelos.stream().filter(v -> v.getDestino().equalsIgnoreCase(destino)).collect(Collectors.toList());
        if (vuelos.get(0).getDestino().isEmpty()) throw new VuelosException("No hay un vuelo que llegue a ese destino.");
        return vuelos;
    }

    //Filtra los vuelos disponibles por fecha y destino
    @Override
    public List<VuelosDto> getElementosDisponiblesPorFechaYDestino(String desde, String hasta, String destino) {

        List<VuelosDto> porFecha = getElementosPorFecha(getElementos(),desde, hasta);
        if (porFecha.isEmpty()) throw new VuelosException("No hay vuelos disponibles");
        return getElementosPorDestino(porFecha, destino);

    }

    //AUXILIAR - CARGA EN EL PAYLOAD EL IMPORTE DE LA COMPRA
    public void calculoYDevolucionDeDatos(ResponsePayloadVuelosDto respuesta, int nroCuotas){
        List<VuelosDto> vuelosPosibles = getElementosDisponiblesPorFechaYDestino(
                respuesta.getFlightReservation().getDateFrom().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), respuesta.getFlightReservation().getDateTo().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), //Posibilidad de que no tome bien la fecha, tener en cuenta
                respuesta.getFlightReservation().getDestination()
        );
        if(vuelosPosibles.stream().noneMatch(v -> v.getOrigen().equals(respuesta.getFlightReservation().getOrigin())))
            throw new VuelosException("No hay un vuelo que parta desde ese origen.");
        if(vuelosPosibles.stream().noneMatch(v -> v.getDestino().equals(respuesta.getFlightReservation().getDestination())))
            throw new VuelosException("No hay un vuelo que llegue a ese destino.");

        //Filtrado de vuelo segun el numero de vuelo y el tipo de asiento
        VuelosDto vuelo = vuelosPosibles.stream().filter(v ->
                v.getNroVuelo().equals(respuesta.getFlightReservation().getFlightNumber()) &&
                        v.getTipoAsiento().equals(respuesta.getFlightReservation().getSeatType())
        ).findFirst().orElse(null);
        if (vuelo == null) throw new VuelosException("El vuelo no existe");
        //calculo del monto a pagar por el vuelo
        respuesta.setInterest(calcularInteres(nroCuotas));
        respuesta.setAmount(vuelo.getPrecioPersona() * respuesta.getFlightReservation().getSeats());
        respuesta.setTotal(respuesta.getAmount() * respuesta.getInterest());
    }

    //Calculo de interes segun las cuotas utilizadas
    private Double calcularInteres (int cuotas){
        double interes;
        switch (cuotas) {
            case 0:
                interes = 1;
                break;
            case 1:
            case 2:
            case 3:
                interes = 1.05;
                break;
            case 4:
            case 5:
            case 6:
                interes = 1.1;
                break;
            default:
                interes = 1.20;
                break;

        }
        return interes;
    }

    //Realiza una reserva
    public ResponsePayloadVuelosDto registrarYMostrarCliente(PayloadVuelosDto cliente) {
        ResponsePayloadVuelosDto reserva = new ResponsePayloadVuelosDto();
        StatusDto statusCode = new StatusDto(200, "El proceso termino satisfactoriamente");
        reserva.setUserName(cliente.getUserName());
        reserva.setFlightReservation(vuelosMapper.responseFlightReservation(cliente.getFlightReservation()));
        reserva.setStatusCode(statusCode);
        calculoYDevolucionDeDatos(reserva,cliente.getFlightReservation().getPaymentMethod().getDues());
        return reserva;
    }

}
