package com.santander.moviesapp.controller;


import com.santander.moviesapp.dto.response.ActorFavoriteMovieResponseDto;
import com.santander.moviesapp.dto.response.ActorResponseDto;
import com.santander.moviesapp.dto.response.ActorsByMoviesDto;
import com.santander.moviesapp.service.IActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class ActorController {

    @Autowired
    private IActorService actorService;

    @GetMapping("/actorswithfavoritemovie")
    public List<ActorFavoriteMovieResponseDto> getActorFavoriteMovieResponseDtos(){
        List<ActorFavoriteMovieResponseDto> actorFavoriteMovieResponseDtos = actorService.getActors();
        return actorFavoriteMovieResponseDtos;
    }

    @GetMapping("/actorwithratinggreater/{rating}")
    public List<ActorResponseDto> getActorWithRatingGreater(@PathVariable BigDecimal rating){
        List<ActorResponseDto> actorResponseDtos = actorService.findActorEntityByRatingGreaterThanEqual(rating);
        return actorResponseDtos;

    }

    @GetMapping("/actorsbymovies/{title}")
    public List<ActorsByMoviesDto> getActorsByMovies(@PathVariable String title){
        List<ActorsByMoviesDto> actorsByMoviesDtos = actorService.findActorMovieEntityBymoviesActors(title);
        return actorsByMoviesDtos;
    }


}
