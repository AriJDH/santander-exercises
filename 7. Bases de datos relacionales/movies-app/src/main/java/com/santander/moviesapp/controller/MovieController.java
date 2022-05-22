package com.santander.moviesapp.controller;


import com.santander.moviesapp.dto.response.MovieResponseDto;
import com.santander.moviesapp.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping(path = "getMoviesByActorRaiting/{rating}")
    public List<MovieResponseDto> getMoviesByActorRaiting(@PathVariable BigDecimal rating){
        return movieService.getMoviesByActorRaiting(rating);
    }

    @GetMapping(path = "getMoviesByGenre/{genre}")
    public List<MovieResponseDto> getMoviesByGenre(@PathVariable String genre){
        return movieService.getMoviesByGenre(genre);
    }
}
