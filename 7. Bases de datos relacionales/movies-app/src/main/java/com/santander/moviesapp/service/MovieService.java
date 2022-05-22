package com.santander.moviesapp.service;


import com.santander.moviesapp.dto.response.MovieResponseDto;
import com.santander.moviesapp.repository.IMovieRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService{
    @Autowired
    IMovieRepository movieRepository;

    ModelMapper mapper = new ModelMapper();

    public List<MovieResponseDto> getMoviesByActorRaiting(BigDecimal rating) {

        List<MovieResponseDto> movieList = null;

        movieList = movieRepository.findByActorRaiting(rating).stream().map(
                movieEntity -> mapper.map(movieEntity, MovieResponseDto.class)
        ).collect(Collectors.toList());

        return movieList;
    }

    public List<MovieResponseDto> getMoviesByGenre(String genre) {

        List<MovieResponseDto> movieList;

        movieList = movieRepository.findByGenre(genre).stream().map(
                movieEntity -> mapper.map(movieEntity, MovieResponseDto.class)
        ).collect(Collectors.toList());

        return movieList;

    }
}
