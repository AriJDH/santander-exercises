package com.santander.moviesapp.controller;


import com.santander.moviesapp.dto.response.ActorResponseDto;
import com.santander.moviesapp.dto.response.MovieResponseDto;
import com.santander.moviesapp.service.ActorService;
import com.santander.moviesapp.service.MovieService;
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
    public ResponseEntity<List<ActorResponseDto>>getActores(){
        return ResponseEntity.ok().body(actorService.actorResponseDtoList());
    }
    @GetMapping("/actors/favouriteMovie")
    public ResponseEntity<List<ActorResponseDto>>getActorsWithFavoriteMovie(){
        return ResponseEntity.ok().body(actorService.findActorsWithFavoriteMovie());
    }
    @GetMapping("/actors/{parametro}")
    public ResponseEntity<List<ActorResponseDto>>getActorsWithRating(@PathVariable BigDecimal parametro){
        return ResponseEntity.ok().body(actorService.findActorsWithRating(parametro));
    }

    @GetMapping("/actores/{movie}")
    public ResponseEntity<List<ActorResponseDto>>findActorWorkInMovie(@PathVariable String movie){
        return ResponseEntity.ok().body(actorService.findActorWorkInMovie(movie));
    }

}
