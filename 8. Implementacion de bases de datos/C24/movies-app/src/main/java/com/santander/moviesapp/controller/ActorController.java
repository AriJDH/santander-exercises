package com.santander.moviesapp.controller;


import com.santander.moviesapp.dto.response.ActorResponseDto;
import com.santander.moviesapp.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class ActorController {
    @Autowired
    ActorService actorService;

    @GetMapping("/actors")
    public ResponseEntity<List<ActorResponseDto>> getActores() {
        return ResponseEntity.ok().body(actorService.getAllActors());
    }

    @GetMapping("/actors/favoriteMovie")
    public ResponseEntity<List<ActorResponseDto>> getActoresFavoriteMovie() {
        return ResponseEntity.ok().body(actorService.findActorsWithFavoriteMovie());
    }

    //Listar todos los actores que tengan rating superior a <valor recibido por parámetro>
    @GetMapping("/actors/{rating}")
    public ResponseEntity<List<ActorResponseDto>> getActorForRating(@PathVariable BigDecimal rating) {
        return ResponseEntity.ok().body(actorService.findActorsForRating(rating));
    }

    //Listar todos los actores que trabajan en la <película recibida por parámetro>
    @GetMapping("/actores/{pelicula}")
    public ResponseEntity<List<ActorResponseDto>> getActorWorkInMovie(@PathVariable String pelicula) {
        return ResponseEntity.ok().body(actorService.findActorWorkInMovie(pelicula));
    }




}
