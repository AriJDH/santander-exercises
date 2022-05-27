package com.santander.moviesapp.controller;


import com.santander.moviesapp.dto.response.MovieResponseDto;
import com.santander.moviesapp.service.ActorService;
import com.santander.moviesapp.service.MovieService;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class MovieController {
    @Autowired
    MovieService movieService;

    //Listar todas las películas cuyos actores tengan rating superior a <valor recibido por parámetro>
    @GetMapping("/moviesRatingGreaterThan/{rating}")
    public ResponseEntity<List<MovieResponseDto>> getMoviesRatingGreaterThan (@PathVariable BigDecimal rating) {
       return new ResponseEntity<>(movieService.getMoviesRatingGreaterThan(rating),HttpStatus.OK);
    }

    //Listar todas las películas que pertenezcan al <género recibido por parámetro>
    @GetMapping("/moviesSameGenre/{genre}")
    public ResponseEntity<List<MovieResponseDto>> getMoviesSameGenre (@PathVariable String genre) {
        return new ResponseEntity<>(movieService.getMoviesSameGenre(genre), HttpStatus.OK);
    }
}
