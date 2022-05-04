package com.santander.AgenciaDeTurismo.controller;


import com.santander.AgenciaDeTurismo.dtos.request.RequestBookingDTO;
import com.santander.AgenciaDeTurismo.dtos.request.RequestHotelFechaDestinoDecoyDTO;
import com.santander.AgenciaDeTurismo.dtos.response.ResponseBookingDTO;
import com.santander.AgenciaDeTurismo.dtos.response.ResponseHotelDTO;
import com.santander.AgenciaDeTurismo.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
public class HotelController {

    @Autowired
    @Qualifier(value = "HotelService")
    HotelService hotelService;

    @GetMapping("/hotels")
    public ResponseEntity<List<ResponseHotelDTO>> obtenerHoteles() {
        return new ResponseEntity<>(hotelService.obtenerElementos(), HttpStatus.OK);
    }

    @PostMapping("/booking")
    public ResponseEntity<ResponseBookingDTO> booking(@RequestBody RequestBookingDTO requestBooking) {
        return new ResponseEntity<>(hotelService.makeReservation(requestBooking), HttpStatus.OK);
    }

    @GetMapping("/hotels/")
    public ResponseEntity<List<ResponseHotelDTO>> obtenerHotelesPorFechaDestino(@RequestParam String dateFrom,
                                                                                @RequestParam String dateTo,
                                                                                @RequestParam String destination){
        RequestHotelFechaDestinoDecoyDTO hotelDto = new RequestHotelFechaDestinoDecoyDTO(destination, dateFrom, dateTo);
        return new ResponseEntity<>(hotelService.obtenerHotelesPorFechaDestino(hotelDto), HttpStatus.OK);
    }

    /*
    @PostMapping("/altaHotel")
    public ResponseEntity<ResponseStatusDTO> agregarHotel (@RequestBody HotelDTO hotelDTO) {
        return new ResponseEntity<>(hotelService.agregarHotel(hotelDTO), HttpStatus.OK);
    }

    @PostMapping("/bajaHotel")
    public ResponseEntity<ResponseStatusDTO> quitarHotel (@RequestBody String hotelCode) {
        return new ResponseEntity<>(hotelService.quitarHotel(hotelCode), HttpStatus.OK);
    }

    @PostMapping("/modificarHotel")
    public ResponseEntity<ResponseStatusDTO> modificarHotel (@RequestBody HotelDTO hotelDTO) {
        return new ResponseEntity<>(hotelService.modificarHotel(hotelDTO), HttpStatus.OK);
    }
     */

}
