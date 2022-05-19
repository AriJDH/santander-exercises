package com.bootcamp.EjercicioCP22P2.controllers;

import com.bootcamp.EjercicioCP22P2.dtos.*;
import com.bootcamp.EjercicioCP22P2.services.JewerlyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/jewerly")
public class JewerlyController {

    @Autowired
    JewerlyService jewerlyService;

    @PostMapping(path = "/new")
    public ResponseEntity<NewJewerlyResponseDTO> postNewJewerly(@RequestBody NewJewerlyRequestDTO newJewerlyRequestDTO){
        return new ResponseEntity<>(jewerlyService.createNewJewerly(newJewerlyRequestDTO), HttpStatus.CREATED);

    }

    @GetMapping
    public List<JewerlyDTO> getAllJewerly(){
        return jewerlyService.getAllJewerly();
    }

    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity<DeleteJewerlyResponseDTO> deleteJewerly(@PathVariable int id){
        return new ResponseEntity<>(jewerlyService.deleteJewerly(id), HttpStatus.OK);
    }

    @PutMapping(path = "/update/{id}")
    public ResponseEntity<UpdateJewerlyResponseDTO> updateJewerly(@PathVariable int id, @RequestBody UpdateJewerlyRequestDTO updateJewerlyRequestDTO){
        return new ResponseEntity<>(jewerlyService.updateJewerly(id, updateJewerlyRequestDTO), HttpStatus.OK);
    }



}
