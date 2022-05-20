package com.santander.moviesapp.service;


import com.santander.moviesapp.dto.response.ActorResponseDto;
import com.santander.moviesapp.dto.response.MovieResponseDto;
import com.santander.moviesapp.entity.ActorEntity;
import com.santander.moviesapp.entity.MovieEntity;
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

    public List<MovieResponseDto> findMoviesActorRatingHigherThan(BigDecimal rating) {
        List<MovieEntity> movies = movieRepository.findMoviesActorRatingHigherThan(rating);
        return movies.stream()
                .map(movieEntity -> mapper.map(movieEntity, MovieResponseDto.class))
                .collect(Collectors.toList());

    }
}
