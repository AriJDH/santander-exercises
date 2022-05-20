package com.santander.moviesapp.controller;


import com.santander.moviesapp.dto.response.ActorResponseDto;
import com.santander.moviesapp.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ActorController {

    @Autowired
    ActorService actorsService;

    @GetMapping("/actors")
    public ResponseEntity<List<ActorResponseDto>> getAllActors(){
        List<ActorResponseDto> actors = actorsService.getAllActors();
        return ResponseEntity.ok().body(actors);
    }

    //Listar todos los actores que tengan declarada una película favorita.
    @GetMapping("/actors/favorite")
    public ResponseEntity<List<ActorResponseDto>> findAllActorsByFavoriteMovieIdIsNotNull(){
        List<ActorResponseDto> actors = actorsService.findAllActorsByFavoriteMovieIdIsNotNull();
        return ResponseEntity.ok().body(actors);
    }
}
