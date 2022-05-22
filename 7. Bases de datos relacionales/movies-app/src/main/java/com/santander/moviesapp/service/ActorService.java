package com.santander.moviesapp.service;

import com.santander.moviesapp.dto.response.ActorFavoriteMovieResponseDto;
import com.santander.moviesapp.dto.response.ActorResponseDto;
import com.santander.moviesapp.dto.response.MovieResponseDto;
import com.santander.moviesapp.entity.ActorMovieEntity;
import com.santander.moviesapp.repository.IActorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ActorService{
    @Autowired
    IActorRepository actorRepository;

    ModelMapper mapper = new ModelMapper();


    public List<ActorFavoriteMovieResponseDto> getActorsWithFavMovie() {
        List<ActorFavoriteMovieResponseDto> actorWithMovieFavList = new ArrayList<>();


        actorRepository.findByfavoriteMovieIsNotNull().forEach(
                actorEntity -> {

                    ActorFavoriteMovieResponseDto actor;
                    actor = mapper.map(actorEntity, ActorFavoriteMovieResponseDto.class);
                    actor.setFavoriteMovie(actorEntity.getFavoriteMovie().getTitle());

                    actorWithMovieFavList.add(actor);
                }
        );

        return actorWithMovieFavList;
    }


    public List<ActorResponseDto> getActorsByRating(BigDecimal rating) {

        List<ActorResponseDto> actorList;

        actorList = actorRepository.findByRaitingGreaterThan(rating).stream().map(
                actorEntity -> mapper.map(actorEntity, ActorResponseDto.class)
        ).collect(Collectors.toList());

        return actorList;
    }


    public List<ActorResponseDto> getActorsByMovie(String movie) {

        List<ActorResponseDto> actorList;

        actorList = actorRepository.findActorsByMovie(movie).stream().map(
                actorEntity -> mapper.map(actorEntity, ActorResponseDto.class)
        ).collect(Collectors.toList());

        return actorList;

    }
}
