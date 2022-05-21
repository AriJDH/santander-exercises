package com.santander.moviesapp.service;


import com.santander.moviesapp.dto.response.MovieResponseDto;
import com.santander.moviesapp.entity.MovieEntity;
import com.santander.moviesapp.repository.IMovieRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService implements  IMovieService{
    @Autowired
    IMovieRepository movieRepository;

    ModelMapper modelMapper = new ModelMapper();


    @Override
    public List<MovieResponseDto> findMoviesWithActorratingGreaterThan(BigDecimal rating) {

        List<MovieEntity> movieEntityList = movieRepository.findMovieEntityByratingActorsGreaterThanEqual(rating);

        return movieEntityList.stream().map(movieEntity ->
                modelMapper.map(movieEntity, MovieResponseDto.class)).collect(Collectors.toList());
    }

    @Override
    public List<MovieResponseDto> findMoviesByGenreName(String name) {

        List<MovieEntity> movieEntityList = movieRepository.findMovieEntityBynameGenre(name);
        return movieEntityList.stream().map(movieEntity ->
                modelMapper.map(movieEntity, MovieResponseDto.class)).collect(Collectors.toList());
    }
}
