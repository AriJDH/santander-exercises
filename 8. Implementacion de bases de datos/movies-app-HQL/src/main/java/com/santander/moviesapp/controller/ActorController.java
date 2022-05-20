package com.santander.moviesapp.controller;


import com.santander.moviesapp.dto.request.MovieRequestDto;
import com.santander.moviesapp.dto.response.ActorResponseDto;
import com.santander.moviesapp.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class ActorController {
    @Autowired
    ActorService actorService;
    @GetMapping("/actors/withMovieFav")
    public List<ActorResponseDto> getActorsWithMovieFav(){
        return actorService.getActorsWithMovieFav();
    }
    @GetMapping("/actors/raitingSuperior/{raiting}")
    public List<ActorResponseDto> getActorsWithRaitingSuperior(@PathVariable BigDecimal raiting){
        return actorService.getActorsWithRaitingSuperior(raiting);
    }

    @GetMapping("/actors/working/{film}")
    public List<ActorResponseDto> getActorsInFilm(@PathVariable String film){
        return actorService.getActorsInFilm(film);
    }

}
