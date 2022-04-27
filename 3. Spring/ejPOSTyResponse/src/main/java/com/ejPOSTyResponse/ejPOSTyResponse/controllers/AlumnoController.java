package com.ejPOSTyResponse.ejPOSTyResponse.controllers;

import com.ejPOSTyResponse.ejPOSTyResponse.dto.AlumnoDTO;
import com.ejPOSTyResponse.ejPOSTyResponse.services.AlumnoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AlumnoController {
    private AlumnoService ser = new AlumnoService();

    @PostMapping("/diploma")
    public ResponseEntity<String> getDiploma(@RequestBody AlumnoDTO a1) {
        return new ResponseEntity<>(ser.mesajefor(a1), HttpStatus.OK);
    }

}
