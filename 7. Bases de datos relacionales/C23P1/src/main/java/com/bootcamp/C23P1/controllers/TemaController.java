package com.bootcamp.C23P1.controllers;

import com.bootcamp.C23P1.dtos.CreateTemaRequestDTO;
import com.bootcamp.C23P1.dtos.CreateTemaResponseDTO;
import com.bootcamp.C23P1.dtos.TemaDTO;
import com.bootcamp.C23P1.services.TemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class TemaController {

    @Autowired
    TemaService temaService;

    @PostMapping(path = "createTema")
    public ResponseEntity<CreateTemaResponseDTO> createTema(@RequestBody CreateTemaRequestDTO createTemaRequestDTO){
        return new ResponseEntity<>(temaService.createTema(createTemaRequestDTO), HttpStatus.CREATED);
    }

    @GetMapping(path = "getAllTemas")
    public List<TemaDTO> getAllTemas(){
        return temaService.getAllTemas();
    }


}
