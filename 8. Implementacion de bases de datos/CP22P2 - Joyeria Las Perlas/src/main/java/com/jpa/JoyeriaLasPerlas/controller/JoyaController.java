package com.jpa.JoyeriaLasPerlas.controller;


import com.jpa.JoyeriaLasPerlas.dto.RespuestaDto;
import com.jpa.JoyeriaLasPerlas.dto.response.SuccessDto;
import com.jpa.JoyeriaLasPerlas.dto.request.JoyaDtoRequest;
import com.jpa.JoyeriaLasPerlas.dto.response.JoyaDtoResponse;
import com.jpa.JoyeriaLasPerlas.service.JoyaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JoyaController {

    @Autowired
    JoyaService joyaService;

    @PostMapping("/jewerly/new")
    public ResponseEntity<SuccessDto> newJoya(@RequestBody JoyaDtoRequest joyaDtoRequest){
        return ResponseEntity.status(201).body(joyaService.newJoya(joyaDtoRequest));
    }

    @GetMapping("/jewerly")
    public ResponseEntity<List<JoyaDtoResponse>> getJoyas(){
        List<JoyaDtoResponse> listaJoyas = joyaService.getJoyas();
        return new ResponseEntity<>(listaJoyas, HttpStatus.OK);
    }

    @DeleteMapping("/jewerly/delete/{idJoya}")
    public ResponseEntity<RespuestaDto> deleteJoya(@PathVariable int idJoya) {
        return ResponseEntity.ok().body(joyaService.deleteJoya(idJoya));
    }

    @PutMapping("/jewerly/update/{id_modificar}")
    public ResponseEntity<SuccessDto> updateJoya(@PathVariable int id_modificar, @RequestBody JoyaDtoRequest joyaDtoRequest) {
        return ResponseEntity.ok().body(joyaService.updateJoya(id_modificar,joyaDtoRequest));
    }
}
