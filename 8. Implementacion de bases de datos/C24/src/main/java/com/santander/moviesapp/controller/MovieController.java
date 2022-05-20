package com.santander.moviesapp.controller;


import com.santander.moviesapp.dto.response.MovieResponseDto;
import com.santander.moviesapp.repository.IMovieRepository;
import com.santander.moviesapp.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping("/findMoviesWhichActorsRatingGreaterThan")
    public ResponseEntity<List<MovieResponseDto>> findMoviesWhichActorsRatingGreaterThan (@RequestParam BigDecimal rating) {
        return new ResponseEntity<>(this.movieService.findMoviesWhichActorsRatingGreaterThan(rating), HttpStatus.OK);
    }

    @GetMapping("/findMoviesByGenreId")
    public ResponseEntity<List<MovieResponseDto>> findMoviesByGenreId (@RequestParam int genreId) {
        return new ResponseEntity<>(this.movieService.findMoviesByGenreId(genreId), HttpStatus.OK);
    }

}
