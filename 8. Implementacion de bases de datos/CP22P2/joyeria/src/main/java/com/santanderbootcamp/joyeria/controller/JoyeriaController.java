package com.santanderbootcamp.joyeria.controller;

import com.santanderbootcamp.joyeria.dto.JoyaDTO;
import com.santanderbootcamp.joyeria.dto.StatusDTO;
import com.santanderbootcamp.joyeria.dto.response.ResponseActualizarJoyaDTO;
import com.santanderbootcamp.joyeria.dto.response.ResponseListaJoyasDTO;
import com.santanderbootcamp.joyeria.service.IJoyeriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class JoyeriaController {
    @Autowired
    IJoyeriaService service;

    @PostMapping("/jewerly/new")
    public ResponseEntity<StatusDTO> crearJoya(@RequestBody JoyaDTO joya) {
        return new ResponseEntity<>(service.crear(joya), HttpStatus.OK);
    }

    @GetMapping("/jewerly")
    public ResponseEntity<ResponseListaJoyasDTO> obtenerListaJoyas() {
        return new ResponseEntity<>(service.obtenerListado(), HttpStatus.OK);
    }

    @DeleteMapping("/jewerly/delete/{id}")
    public ResponseEntity<ResponseListaJoyasDTO> eliminarJoya(@PathVariable int id) {
        return new ResponseEntity<>(service.eliminar(id), HttpStatus.OK);
    }

    @PutMapping("/jewerly/update/{id_modificar}")
    public ResponseEntity<ResponseActualizarJoyaDTO> actualizarJoya(@PathVariable int id_modificar, @RequestBody JoyaDTO joya) {
        return new ResponseEntity<>(service.actualizar(id_modificar, joya), HttpStatus.OK);
    }
}
