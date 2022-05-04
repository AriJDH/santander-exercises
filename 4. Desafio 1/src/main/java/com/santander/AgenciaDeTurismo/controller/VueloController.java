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
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
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
    public ResponseEntity<ResponseReservationDTO> makeReservation(@RequestBody RequestReservationDTO requestReservationDTO) {
        return  new ResponseEntity<>(vueloService.makeReservation(requestReservationDTO), HttpStatus.OK);
    }


    @GetMapping("/flights/")
    public ResponseEntity<List<ResponseVueloDTO>> getVuelosFiltrados( @RequestParam String dateFrom,
                                                                      @RequestParam String dateTo,
                                                                     @RequestParam String origin, @RequestParam String destination){
        RequestVueloDecoyDTO requestVueloDecoyDTO = new RequestVueloDecoyDTO(origin,destination,dateFrom,dateTo);
        List<ResponseVueloDTO> vueloDTO = vueloService.vuelos_filtrados(requestVueloDecoyDTO);
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
