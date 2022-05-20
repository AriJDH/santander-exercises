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

    @GetMapping("/MoviesWithActorRatingGreatingThan/{rating}")
    public ResponseEntity<List<MovieResponseDto>> findMoviesWithActorRatingGreatingThan (@PathVariable BigDecimal rating){
        return ResponseEntity.ok().body(movieService.findMoviesWithActorRatingGreatingThan(rating));
    }

    @GetMapping("/MoviesInGenre/{genre}")
    public ResponseEntity<List<MovieResponseDto>> moviesInGenre (@PathVariable String genre){
        return ResponseEntity.ok().body(movieService.moviesInGenre(genre));
    }


}
