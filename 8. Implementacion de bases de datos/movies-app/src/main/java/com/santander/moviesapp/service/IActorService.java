package com.santander.moviesapp.service;

import com.santander.moviesapp.dto.response.ActorFavoriteMovieResponseDto;
import com.santander.moviesapp.dto.response.ActorResponseDto;
import com.santander.moviesapp.dto.response.ActorsByMoviesDto;
import com.santander.moviesapp.entity.ActorEntity;

import java.math.BigDecimal;
import java.util.List;

public interface IActorService {

    public List<ActorFavoriteMovieResponseDto> getActors();
    public List<ActorResponseDto> findActorEntityByRatingGreaterThanEqual(BigDecimal rating);
    public List<ActorsByMoviesDto> findActorMovieEntityBymoviesActors(String title);
}
