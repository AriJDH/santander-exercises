package com.example.CP22P2.controller;

import com.example.CP22P2.dto.JoyaDto;
import com.example.CP22P2.dto.RespuestaDto;
import com.example.CP22P2.service.JoyaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jewerly")
public class JoyaController {

    @Autowired
    JoyaService joyaService;

    @PostMapping("/new")
    public ResponseEntity<RespuestaDto> añadirJoya(@RequestBody JoyaDto joyaDto) {
        RespuestaDto respuesta = joyaService.añadirJoya(joyaDto);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    @GetMapping("")
    public ResponseEntity<List<JoyaDto>> obtenerJoyas() {
        return new ResponseEntity<>(joyaService.obtenerJoyas(), HttpStatus.OK);
    }

    @PutMapping ("/delete/{id}")
    public String borrarJoya (@PathVariable Integer id) {
        return joyaService.borrarJoya(id);
    }

    @PutMapping ("/update/{id_modificar}")
    public String modificarJoya (@PathVariable Integer id_modificar,@RequestBody JoyaDto joyaNueva) {
        return joyaService.editarJoya(id_modificar,joyaNueva);
    }



}
