package com.santander.moviesapp.controller;


import com.santander.moviesapp.dto.response.ActorResponseDto;
import com.santander.moviesapp.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@Controller
public class ActorController {

    @Autowired
    ActorService actorService;

    @GetMapping ("/actors")
    public ResponseEntity<List<ActorResponseDto>> listAllActors(){
        return ResponseEntity.ok().body(actorService.listarActores());
    }

    @GetMapping (value = "/actors_rating", params = {"rating"})
    public  ResponseEntity<List<ActorResponseDto>> listActorsBiggerThan(@RequestParam Double rating){
        return ResponseEntity.ok().body(actorService.listarActoresMayorRating(rating));
    }

    @GetMapping(value = "/actors_movie", params = {"name"})
    public ResponseEntity<List<ActorResponseDto>> listActorsByMovie(@RequestParam String name){
        return ResponseEntity.ok().body(actorService.listarActoresPorPelicula(name));
    }
}
