package com.santander.moviesapp.controller;


import com.santander.moviesapp.dto.response.ActorResponseDto;
import com.santander.moviesapp.dto.response.MovieResponseDto;
import com.santander.moviesapp.service.ActorService;
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

    @GetMapping("/movies/{rating}")
    public ResponseEntity<List<MovieResponseDto>> getArctorsForRatingMovies(@PathVariable BigDecimal rating) {
        return ResponseEntity.ok().body(movieService.findFilmWithActorWithRating(rating));
    }

    //Listar todas las películas que pertenezcan al <género recibido por parámetro>
    @GetMapping("/movies/gender/{gender}")
    public ResponseEntity<List<MovieResponseDto>> getMovieForGender(@PathVariable String gender) {
        return ResponseEntity.ok().body(movieService.findMoviesForGender(gender));
    }




}
