package com.santander.moviesapp.controller;


import com.santander.moviesapp.dto.response.ActorResponseDto;
import com.santander.moviesapp.dto.response.MovieResponseDto;
import com.santander.moviesapp.service.ActorService;
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

    @GetMapping("/films/actorsWithRaitingSuperior/{raiting}")
    public List<MovieResponseDto> getFilmsWhereActorsRaiting(@PathVariable BigDecimal raiting){
        return movieService.getFilmsWhereActorsRaiting(raiting);
    }

    @GetMapping("/films/withinGnre/{genero}")
    public List<MovieResponseDto> getFilmsWithInGnre(@PathVariable String genero){
        return movieService.getFilmsWithInGnre(genero);

    }

}
