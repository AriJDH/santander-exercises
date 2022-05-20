package com.santander.moviesapp.service;


import com.santander.moviesapp.dto.response.MovieResponseDto;
import com.santander.moviesapp.entity.MovieEntity;
import com.santander.moviesapp.repository.IEpisodeRepository;
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

    public List<MovieResponseDto> findMoviesWhichActorsRatingGreaterThan(BigDecimal rating){
        List<MovieEntity> movieEntities= movieRepository.findMoviesWhichActorsRatingGreaterThan(rating);
        return movieEntities.stream().map(movie -> mapper.map(movie, MovieResponseDto.class)).collect(Collectors.toList());
    }

    public List<MovieResponseDto> findMoviesByGenreId(Integer genreId){

        List<MovieEntity> movieEntities= movieRepository.findMoviesByGenreId(genreId);
        return movieEntities.stream().map(movie -> mapper.map(movie, MovieResponseDto.class)).collect(Collectors.toList());
    }

}
