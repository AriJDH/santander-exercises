package com.santander.moviesapp.controller;


import com.santander.moviesapp.dto.response.ActorResponseDto;
import com.santander.moviesapp.dto.response.MovieResponseDto;
import com.santander.moviesapp.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    //Listar todos los actores que tengan rating superior a <valor recibido por parámetro>
    @GetMapping("/movies/actorRatingHigherThan/{rating}")
    public ResponseEntity<List<MovieResponseDto>> findMoviesActorRatingHigherThan(@PathVariable BigDecimal rating){
        List<MovieResponseDto> movies = movieService.findMoviesActorRatingHigherThan(rating);
        return ResponseEntity.ok().body(movies);
    }
}
