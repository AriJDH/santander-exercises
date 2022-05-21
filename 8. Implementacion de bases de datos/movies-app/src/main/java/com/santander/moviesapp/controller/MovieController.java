package com.santander.moviesapp.controller;


import com.santander.moviesapp.dto.response.MovieResponseDto;
import com.santander.moviesapp.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private IMovieService movieService;

    @GetMapping("moviesbyratingactors/{rating}")
    public List<MovieResponseDto> getMoviesByRatingActors(@PathVariable BigDecimal rating){
        List<MovieResponseDto> movieResponseDtos = movieService.findMoviesWithActorratingGreaterThan(rating);
        return movieResponseDtos;
    }

    @GetMapping("/moviesbygenresname/{name}")
    public List<MovieResponseDto> getMoviesByNameGenre(@PathVariable String name){
        List<MovieResponseDto> movieResponseDtoList = movieService.findMoviesByGenreName(name);
        return movieResponseDtoList;
    }
}
