package com.santander.moviesapp.service;

import com.santander.moviesapp.dto.response.MovieResponseDto;

import java.math.BigDecimal;
import java.util.List;

public interface IMovieService {

    public List<MovieResponseDto> findMoviesWithActorratingGreaterThan(BigDecimal rating);
    public List<MovieResponseDto> findMoviesByGenreName(String name);
}
