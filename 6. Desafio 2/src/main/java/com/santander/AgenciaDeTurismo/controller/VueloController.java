package com.santander.AgenciaDeTurismo.controller;


import com.santander.AgenciaDeTurismo.dtos.request.RequestReservationDTO;
import com.santander.AgenciaDeTurismo.dtos.request.RequestVueloDecoyDTO;
import com.santander.AgenciaDeTurismo.dtos.response.ResponseReservationDTO;
import com.santander.AgenciaDeTurismo.dtos.response.ResponseVueloDTO;
import com.santander.AgenciaDeTurismo.services.VueloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
@Validated
public class VueloController {

    @Autowired
    @Qualifier("VueloService")
    VueloService vueloService;

    @GetMapping("/flights")
    public ResponseEntity<List<ResponseVueloDTO>> getVuelos() {
        List<ResponseVueloDTO> vuelosDTO = vueloService.obtenerElementos();
        return new ResponseEntity<>(vuelosDTO, HttpStatus.OK);
    }

    @PostMapping("/flight-reservation")
    public ResponseEntity<ResponseReservationDTO> makeReservation(@Valid @RequestBody RequestReservationDTO requestReservationDTO) {
        return  new ResponseEntity<>(vueloService.makeReservation(requestReservationDTO), HttpStatus.OK);
    }

    @GetMapping("/flights/")
    public ResponseEntity<List<ResponseVueloDTO>> getVuelosFiltrados( @Valid @NotEmpty(message = "Fecha de ida no puede estar vacío") @NotNull(message = "Fecha de ida no puede ser nulo")
                                                                          @RequestParam String dateFrom,
                                                                      @Valid @NotEmpty(message = "Fecha de vuelta no puede estar vacío") @NotNull(message = "Fecha de vuelta no puede ser nulo")
                                                                          @RequestParam String dateTo,
                                                                      @Valid @NotEmpty(message = "Origen no puede estar vacío") @NotNull(message = "Origen no puede ser nulo")
                                                                          @RequestParam String origin,
                                                                      @Valid @NotEmpty(message = "Destino no puede estar vacío") @NotNull(message = "Destino no puede ser nulo")
                                                                          @RequestParam String destination) {
        RequestVueloDecoyDTO requestVueloDecoyDTO = new RequestVueloDecoyDTO(origin,destination,dateFrom,dateTo);
        List<ResponseVueloDTO> vueloDTO = vueloService.vuelosFiltrados(requestVueloDecoyDTO);
        return new ResponseEntity<>(vueloDTO, HttpStatus.OK);
    }

    /*
    @PostMapping("/altaVuelo")
    public ResponseEntity<ResponseStatusDTO> agregarVuelo (@RequestBody VueloDTO vueloDTO) {
        return new ResponseEntity<>(vueloService.agregarVuelo(vueloDTO), HttpStatus.OK);
    }

    @PostMapping("/bajaVuelo")
    public ResponseEntity<ResponseStatusDTO> quitarVuelo (@RequestBody String flightNumber) {
        return new ResponseEntity<>(vueloService.quitarVuelo(flightNumber), HttpStatus.OK);
    }

    @PostMapping("/modificarVuelo")
    public ResponseEntity<ResponseStatusDTO> modificarVuelo (@RequestBody VueloDTO vueloDTO) {
        return new ResponseEntity<>(vueloService.modificarVuelo(vueloDTO), HttpStatus.OK);
    }
     */

}
