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
    public ResponseEntity<List<ActorResponseDto>> getActors(){
        return ResponseEntity.ok().body(actorService.findAll());
    }

    //Listar todos los actores que tengan declarada una película favorita.
    @GetMapping("/actorsWithFavoriteMovie")
    public ResponseEntity<List<ActorResponseDto>> getActorsWithFavoriteMovie(){
        return ResponseEntity.ok().body(actorService.findActorsWithFavoriteMovie());
    }

    //Listar todos los actores que tengan rating superior a <valor recibido por parámetro>
    @GetMapping("/actorsWithRatingGreatingThan/{rating}")
    public ResponseEntity<List<ActorResponseDto>> getActorsWithRatingGreatingThan(@PathVariable BigDecimal rating){
        return ResponseEntity.ok().body(actorService.findActorsWithRatingGreaterThan(rating));
    }

    @GetMapping("/actorsWorkInMovie/{movie}")
    public ResponseEntity<List<ActorResponseDto>> getActorWorkInMovie (@PathVariable String movie){
        return ResponseEntity.ok().body(actorService.findActorWorkInMovie(movie));
    }
}
