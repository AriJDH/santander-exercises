package com.santander.moviesapp.service;

import com.santander.moviesapp.dto.response.ActorFavoriteMovieResponseDto;
import com.santander.moviesapp.dto.response.ActorResponseDto;
import com.santander.moviesapp.dto.response.ActorsByMoviesDto;
import com.santander.moviesapp.entity.ActorEntity;
import com.santander.moviesapp.entity.MovieEntity;
import com.santander.moviesapp.repository.IActorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ActorService implements IActorService{
    @Autowired
    IActorRepository actorRepository;

    ModelMapper mapper = new ModelMapper();


    @Override
    public List<ActorFavoriteMovieResponseDto> getActors() {

        List<ActorEntity> actorEntityList = actorRepository.findActorEntityByfavoriteMovieIsNotNull();

        return actorEntityList.stream().map(actorEntity ->
                mapper.map(actorEntity, ActorFavoriteMovieResponseDto.class)).collect(Collectors.toList());
    }

    @Override
    public List<ActorResponseDto> findActorEntityByRatingGreaterThanEqual(BigDecimal rating) {

        List<ActorEntity> actorEntityList = actorRepository.findActorEntityByRatingGreaterThanEqual(rating);

        return actorEntityList.stream().map(actorEntity ->
                mapper.map(actorEntity, ActorResponseDto.class)).collect(Collectors.toList());
    }

    @Override
    public List<ActorsByMoviesDto> findActorMovieEntityBymoviesActors(String title) {

        List<ActorEntity> actorEntityList = actorRepository.findActorEntityBymoviesActors(title);

        return actorEntityList.stream().map(actorEntity ->
                mapper.map(actorEntity, ActorsByMoviesDto.class)).collect(Collectors.toList());
    }
}
