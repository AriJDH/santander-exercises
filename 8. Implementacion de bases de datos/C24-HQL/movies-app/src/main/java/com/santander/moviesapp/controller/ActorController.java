package com.santander.moviesapp.controller;


import com.santander.moviesapp.dto.response.ActorFavoriteMovieResponseDto;
import com.santander.moviesapp.dto.response.ActorResponseDto;
import com.santander.moviesapp.service.ActorService;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class ActorController {
    @Autowired
    ActorService actorService;

    @GetMapping("/actors")
    public ResponseEntity<List<ActorResponseDto>> getActors() {
        return new ResponseEntity<>(actorService.getActors(), HttpStatus.OK);
    }

    //Listar todos los actores que tengan declarada una pelicula favorita
    @GetMapping("/actorsFavoriteMovie")
    public ResponseEntity<List<ActorFavoriteMovieResponseDto>> getActorsFavMovie () {
        return new ResponseEntity<>(actorService.getActorsFavMovie(), HttpStatus.OK);
    }

    //Listar todos los actores que tengan rating superior a <valor recibido por parámetro>
    @GetMapping("/actorsRatingGreaterThan/{rating}")
    public ResponseEntity<List<ActorResponseDto>> getActorsRatingGreaterThan (@PathVariable BigDecimal rating) {
        return new ResponseEntity<>(actorService.getActorsRatingGreaterThan(rating), HttpStatus.OK);
    }

    //Listar todos los actores que trabajan en la <película recibida por parámetro>
    @GetMapping("/actorsWorksInMovie/{idMovie}")
    public ResponseEntity<List<ActorResponseDto>> getActorsWorksInMovie (@PathVariable Integer idMovie) {
        return new ResponseEntity<>(actorService.getActorsWorksInMovie(idMovie), HttpStatus.OK);
    }
}
