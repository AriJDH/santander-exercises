package com.santander.moviesapp.controller;


import com.santander.moviesapp.dto.response.ActorFavoriteMovieResponseDto;
import com.santander.moviesapp.dto.response.ActorResponseDto;
import com.santander.moviesapp.dto.response.MovieResponseDto;
import com.santander.moviesapp.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class ActorController {

    @Autowired
    ActorService actorService;

    @GetMapping(path = "getActorsWithFavMovie")
    public List<ActorFavoriteMovieResponseDto> getActorsWithFavMovie(){
        return actorService.getActorsWithFavMovie();
    }

    @GetMapping(path = "getActorsByRating/{rating}")
    public List<ActorResponseDto> getActorsByRating(@PathVariable BigDecimal rating){
        return actorService.getActorsByRating(rating);
    }

    @GetMapping(path = "getActorsByMovie/{movie}")
    public List<ActorResponseDto> getActorsByMovie(@PathVariable String movie){
        return actorService.getActorsByMovie(movie);
    }
}
