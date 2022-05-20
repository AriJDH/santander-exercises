package com.santander.moviesapp.controller;


import com.santander.moviesapp.dto.response.ActorResponseDto;
import com.santander.moviesapp.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class ActorController {

    @Autowired
    ActorService actorService;

    @GetMapping("/findActorsWhoHaveFavoriteMovie")
    public ResponseEntity<List<ActorResponseDto>> findActorsWhoHaveFavoriteMovie () {
        return new ResponseEntity<>(this.actorService.findActorsWhoHaveFavoriteMovie(), HttpStatus.OK);
    }

    @GetMapping("/findActorsWithRatingGreaterThan")
    public ResponseEntity<List<ActorResponseDto>> findActorsWithRatingGreaterThan (@RequestParam BigDecimal rating) {
        return new ResponseEntity<>(this.actorService.findActorsWithRatingGreaterThan(rating), HttpStatus.OK);
    }

    @GetMapping("/findActorByMovieId")
    public ResponseEntity<List<ActorResponseDto>> findActorByMovieId (@RequestParam int movieId) {
        return new ResponseEntity<>(this.actorService.findActorByMovieId(movieId), HttpStatus.OK);
    }

}
