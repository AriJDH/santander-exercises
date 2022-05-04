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
            throw new VueloNotFoundException("No existe un vuelo con el número solicitado");
        } else if (!vueloEncontrado.isAvailable(requestReservation.getFlightReservation().getDateFrom())) {
            throw new VueloDepartOutOfBoundsException("El vuelo solicitado no se encuentra disponible en la fecha indicada.");
        }

        return new ResponseReservationDTO(requestReservation, vueloEncontrado, new ResponseStatusDTO(HttpStatus.OK.value(), "La reserva fue hecha con éxito. "));
    }

    @ResponseStatus(value = HttpStatus.OK)
    public List<ResponseVueloDTO> vuelos_filtrados(RequestVueloDecoyDTO requestVueloDecoyDTO) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            RequestVueloDTO requestVueloDTO = new RequestVueloDTO(requestVueloDecoyDTO.getOrigin(), requestVueloDecoyDTO.getDestination(), LocalDate.parse(requestVueloDecoyDTO.getDateFrom(), formatter), LocalDate.parse(requestVueloDecoyDTO.getDateTo(), formatter));
            List<Vuelo> vuelos = vueloDAO.obtenerElementos(); //guardo una lista de todos los vuelos

            List<ResponseVueloDTO> vuelosDTO = new ArrayList<>(); //Creo una listaDTO para guardar los vuelos filtrados y devolverlo
            if(requestVueloDTO.getDateFrom().isAfter(requestVueloDTO.getDateTo().minusDays(1))){
                throw new VueloFechaException("La fecha ingresada es inválida");
            }

            for (Vuelo p : vuelos) {
                LocalDate fecha_ida = p.getDateFrom();   //guardo en una variable la fecha de ida
                LocalDate fecha_vuelta = p.getDateTo();  //guardo en una variable la fecha de vuelta
                String origen = p.getOrigin();           //guardo en una variable el lugar de origen del vuelo
                String destino = p.getDestination();     //guardo en una variable el lugar de llegada del vuelo

                if ((requestVueloDTO.getDateFrom().isBefore(fecha_ida.plusDays(1)) &&
                        requestVueloDTO.getDateTo().isAfter(fecha_vuelta.minusDays(1)))
                        && (requestVueloDTO.getOrigin().equalsIgnoreCase(origen) && requestVueloDTO.getDestination().equalsIgnoreCase(destino))) {

                    ResponseVueloDTO v = new ResponseVueloDTO(p); //guardo el vuelo filtrado en un vueloDTO
                    vuelosDTO.add(v); //agrego el vueloDTO a la lista de vuelos DTO
                }
            }
            if (vuelosDTO.isEmpty()) {
                throw new VueloNotFoundException("Vuelos no encontrados");
            }
            return vuelosDTO;
        } catch (DateTimeParseException e) {
            throw new VueloFechaException("La fecha ingresada tiene que tener el formato (dd/MM/yyyy)");
        }
    }

}
