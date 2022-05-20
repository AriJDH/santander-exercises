package com.santander.moviesapp.service;

import com.santander.moviesapp.dto.response.ActorResponseDto;
import com.santander.moviesapp.entity.ActorEntity;
import com.santander.moviesapp.repository.IActorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ActorService{
    @Autowired
    IActorRepository actorRepository;

    ModelMapper mapper = new ModelMapper();


    public List<ActorResponseDto> findAll() {
        List<ActorEntity> actorList = actorRepository.findAll();
        return actorList.stream()
                .map(actor ->
                        mapper.map(actor, ActorResponseDto.class)).collect(Collectors.toList());
    }

    public List<ActorResponseDto> findActorsWithFavoriteMovie() {
        List<ActorEntity> actorList = actorRepository.findByfavoriteMovieIsNotNull();
        return actorList.stream()
                .map(actor ->
                        mapper.map(actor, ActorResponseDto.class)).collect(Collectors.toList());
    }

    public List<ActorResponseDto> findActorsWithRatingGreaterThan(BigDecimal rating) {
        List<ActorEntity> actorList = actorRepository.findActorWithRatingGreatingThan(rating);
        return actorList.stream()
                .map(actor ->
                        mapper.map(actor, ActorResponseDto.class)).collect(Collectors.toList());
    }


    public List<ActorResponseDto> findActorWorkInMovie(String movie_title) {
        List<ActorEntity> actorList = actorRepository.findActorWorkInMovie(movie_title);
        return actorList.stream()
                .map(actor ->
                        mapper.map(actor, ActorResponseDto.class)).collect(Collectors.toList());
    }
}
