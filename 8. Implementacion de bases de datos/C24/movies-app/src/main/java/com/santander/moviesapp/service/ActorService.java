package com.santander.moviesapp.service;

import com.santander.moviesapp.dto.response.ActorResponseDto;
import com.santander.moviesapp.entity.ActorEntity;
import com.santander.moviesapp.repository.IActorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ActorService{
    @Autowired
    IActorRepository actorRepository;

    ModelMapper mapper = new ModelMapper();

    public List<ActorResponseDto> getAllActors() {
        List<ActorEntity> actors = actorRepository.findAll();
        return actors.stream()
                .map(actorEntity -> mapper.map(actorEntity, ActorResponseDto.class))
                .collect(Collectors.toList());
    }

    public List<ActorResponseDto> findAllActorsByFavoriteMovieIdIsNotNull() {
        List<ActorEntity> actors = actorRepository.findAllActorsByFavoriteMovieIdIsNotNull();
        return actors.stream()
                .map(actorEntity -> mapper.map(actorEntity, ActorResponseDto.class))
                .collect(Collectors.toList());
    }

    public List<ActorResponseDto> findAllActorsByRatingHigherThan(BigDecimal rating) {
        List<ActorEntity> actors = actorRepository.findAllActorsByRatingHigherThan(rating);
        return actors.stream()
                .map(actorEntity -> mapper.map(actorEntity, ActorResponseDto.class))
                .collect(Collectors.toList());
    }

    public List<ActorResponseDto> findAllActorsByMovie(String title) {
        List<ActorEntity> actors = actorRepository.findAllActorsByMovie(title);
        return actors.stream()
                .map(actorEntity -> mapper.map(actorEntity, ActorResponseDto.class))
                .collect(Collectors.toList());
    }
}
