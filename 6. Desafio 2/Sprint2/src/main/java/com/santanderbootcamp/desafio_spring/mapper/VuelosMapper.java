package com.santanderbootcamp.desafio_spring.mapper;

import com.santanderbootcamp.desafio_spring.dto.VuelosDto;
import com.santanderbootcamp.desafio_spring.dto.request.FlightReservationDto;
import com.santanderbootcamp.desafio_spring.dto.response.ResponseFlightReservationDto;
import com.santanderbootcamp.desafio_spring.modelos.Vuelos;
import org.springframework.stereotype.Component;

@Component("VuelosMapper")
public class VuelosMapper implements IMapper<VuelosDto, Vuelos> {

    //Mapeo de los datos de Vuelos a VuelosDto
    @Override
    public VuelosDto toDto(Vuelos vuelos) {
        VuelosDto vuelosDto = new VuelosDto();
        vuelosDto.setNroVuelo(vuelos.getNroVuelo());
        vuelosDto.setOrigen(vuelos.getOrigen());
        vuelosDto.setDestino(vuelos.getDestino());
        vuelosDto.setTipoAsiento(vuelos.getTipoAsiento());
        vuelosDto.setPrecioPersona(vuelos.getPrecioPersona());
        vuelosDto.setFechaIda(vuelos.getFechaIda());
        vuelosDto.setFechaVuelta(vuelos.getFechaVuelta());
        return vuelosDto;
    }

    //Mapeo de los datos de VuelosDto a Vuelos
    @Override
    public Vuelos dtoTo(VuelosDto vuelosDto) {
        Vuelos vuelos = new Vuelos();
        vuelos.setNroVuelo(vuelosDto.getNroVuelo());
        vuelos.setOrigen(vuelosDto.getOrigen());
        vuelos.setDestino(vuelosDto.getDestino());
        vuelos.setPrecioPersona(vuelosDto.getPrecioPersona());
        vuelos.setFechaIda(vuelosDto.getFechaIda());
        vuelos.setFechaVuelta(vuelosDto.getFechaVuelta());
        vuelos.setTipoAsiento(vuelosDto.getTipoAsiento());
        return  vuelos;
    }

    //Mapeo de los datos de FlightReservationDto a ResponseFlightReservationDto (para poder traer la información de la reserva de vuelo)
    public ResponseFlightReservationDto responseFlightReservation (FlightReservationDto element) {
        ResponseFlightReservationDto flightDto = new ResponseFlightReservationDto();
        flightDto.setDateFrom(element.getDateFrom());
        flightDto.setDateTo(element.getDateTo());
        flightDto.setOrigin(element.getOrigin());
        flightDto.setDestination(element.getDestination());
        flightDto.setFlightNumber(element.getFlightNumber());
        flightDto.setSeats(element.getSeats());
        flightDto.setSeatType(element.getSeatType());
        flightDto.setPeople(element.getPeople());
        return flightDto;
    }
}
