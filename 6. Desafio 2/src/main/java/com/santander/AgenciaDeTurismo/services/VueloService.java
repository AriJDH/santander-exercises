package com.santander.AgenciaDeTurismo.services;

import com.santander.AgenciaDeTurismo.dtos.ResponseStatusDTO;
import com.santander.AgenciaDeTurismo.dtos.request.RequestReservationDTO;
import com.santander.AgenciaDeTurismo.dtos.request.RequestVueloDTO;
import com.santander.AgenciaDeTurismo.dtos.request.RequestVueloDecoyDTO;
import com.santander.AgenciaDeTurismo.dtos.response.ResponseReservationDTO;
import com.santander.AgenciaDeTurismo.dtos.response.ResponseVueloDTO;
import com.santander.AgenciaDeTurismo.exceptions.VueloDepartOutOfBoundsException;
import com.santander.AgenciaDeTurismo.exceptions.VueloFechaException;
import com.santander.AgenciaDeTurismo.exceptions.VueloNotFoundException;
import com.santander.AgenciaDeTurismo.exceptions.VueloPlaceException;
import com.santander.AgenciaDeTurismo.models.Vuelo;
import com.santander.AgenciaDeTurismo.repo.VueloDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

@Service(value = "VueloService")
public class VueloService implements IService<ResponseVueloDTO> {

    @Autowired
    @Qualifier(value = "VueloDAOImpl")
    VueloDAO vueloDAO;

    @Override
    @ResponseStatus(value = HttpStatus.OK)
    public List<ResponseVueloDTO> obtenerElementos() {
        List<Vuelo> vuelos = vueloDAO.obtenerElementos();
        List<ResponseVueloDTO> vuelosDTO = new ArrayList<>();
        for (Vuelo p : vuelos) {
            ResponseVueloDTO v = new ResponseVueloDTO(p);
            vuelosDTO.add(v);
        }
        return vuelosDTO;
    }

    @ResponseStatus(value = HttpStatus.OK)
    public ResponseReservationDTO makeReservation(RequestReservationDTO requestReservation) {

        Vuelo vueloEncontrado = vueloDAO.buscarElemento(requestReservation.getFlightReservation().getFlightNumber());

        if (vueloEncontrado == null) {
            throw new VueloNotFoundException("No existe un vuelo con el numero solicitado");

        } else if(!requestReservation.getFlightReservation().getDestination().equals(vueloEncontrado.getDestination())) {
            throw new VueloNotFoundException("El destino elegido no existe");

        } else if (!vueloEncontrado.isAvailable(requestReservation.getFlightReservation().getDateFrom())) {
            throw new VueloDepartOutOfBoundsException("El vuelo solicitado no se encuentra disponible en la fecha indicada");
        }

        double interest = requestReservation.getFlightReservation().getPaymentMethod().getType().equals("DEBIT") ? 0 : (Math.ceil(requestReservation.getFlightReservation().getPaymentMethod().getDues() / 3)) * 5.0;

        return new ResponseReservationDTO(requestReservation, interest,  vueloEncontrado, new ResponseStatusDTO(HttpStatus.OK.value(), "La reserva fue hecha con exito"));
    }

    @ResponseStatus(value = HttpStatus.OK)
    public List<ResponseVueloDTO> vuelosFiltrados(RequestVueloDecoyDTO requestVueloDecoyDTO) {

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            RequestVueloDTO requestVueloDTO = new RequestVueloDTO(requestVueloDecoyDTO.getOrigin(), requestVueloDecoyDTO.getDestination(), LocalDate.parse(requestVueloDecoyDTO.getDateFrom(), formatter), LocalDate.parse(requestVueloDecoyDTO.getDateTo(), formatter));

            //Validación si no existe el origen o destino elegido
            if (!vueloDAO.existeOrigen(requestVueloDTO.getOrigin())) {
                throw new VueloPlaceException("El origen elegido no existe.");
            }
            else if (!vueloDAO.existeDestino(requestVueloDTO.getDestination())) {
                throw new VueloPlaceException("El destino elegido no existe");
            }

            //guardo una lista de todos los vuelosDAO
            List<Vuelo> vuelos = vueloDAO.obtenerElementos();

            //Recibe una lista de vuelos que contiene el Json y la clase requestVueloDTO, devolviéndo una lista de vuelosDTO
            return convertirDTO (vuelos, requestVueloDTO);

        } catch (DateTimeParseException e) {
            throw new VueloFechaException("La fecha ingresada tiene que tener el formato (dd/MM/yyyy)");
        }
    }
    //Recibe una lista de Vuelos y una clase RequestVueloDTO, y devuelve una lista de VuelosDTO
    public List<ResponseVueloDTO> convertirDTO (List<Vuelo> vuelos, RequestVueloDTO requestVueloDTO) {
        //Creo una listaDTO para guardar los vuelos filtrados y devolverlo
        List<ResponseVueloDTO> vuelosDTO = new ArrayList<>();

        //Si la fecha de ida es mayor a la fecha de vuelta
        if(requestVueloDTO.getDateFrom().isAfter(requestVueloDTO.getDateTo().minusDays(1))){
            throw new VueloFechaException("La fecha ingresada es inválida.");
        }
        for (Vuelo vuelo : vuelos) {
            LocalDate fecha_ida = vuelo.getDateFrom();
            LocalDate fecha_vuelta = vuelo.getDateTo();

            if ( (requestVueloDTO.getDateFrom().isBefore(fecha_ida.plusDays(1)) &&
                    requestVueloDTO.getDateTo().isAfter(fecha_vuelta.minusDays(1))) &&
                    (requestVueloDTO.getOrigin().equalsIgnoreCase(vuelo.getOrigin()) && requestVueloDTO.getDestination().equalsIgnoreCase(vuelo.getDestination()))) {
                ResponseVueloDTO v = new ResponseVueloDTO(vuelo); //guardo el vuelo filtrado en un vueloDTO
                vuelosDTO.add(v); //agrego el vueloDTO a la lista de vuelos DTO
            }
        }

        if (vuelosDTO.isEmpty()) {
            throw new VueloNotFoundException("Vuelos no encontrados.");
        }
        return vuelosDTO;
    }

}
