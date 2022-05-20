package com.santander.moviesapp.service;


import com.santander.moviesapp.dto.response.ActorResponseDto;
import com.santander.moviesapp.dto.response.MovieResponseDto;
import com.santander.moviesapp.repository.IMovieRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService{
    @Autowired
    IMovieRepository movieRepository;
    ModelMapper mapper = new ModelMapper();

    public List<MovieResponseDto> getFilmsWhereActorsRaiting(BigDecimal raiting) {
       return movieRepository.getFilmsWhereActorsRaiting(raiting).stream().map(movie->mapper.map(movie, MovieResponseDto.class)).collect(Collectors.toList());
    }

    public List<MovieResponseDto> getFilmsWithInGnre(String genero) {
        return movieRepository.findMovieEntityByGenre(genero).stream().map(movie->mapper.map(movie, MovieResponseDto.class)).collect(Collectors.toList());
    }
}
