package com.santander.moviesapp.service;

import com.santander.moviesapp.dto.response.ActorResponseDto;
import com.santander.moviesapp.dto.response.MovieResponseDto;
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
public class ActorService{
    @Autowired
    IActorRepository actorRepository;

    ModelMapper mapper = new ModelMapper();

    public List<ActorResponseDto> actorResponseDtoList(){
        List<ActorEntity> actorEntities = actorRepository.findAll();
        return actorEntities.stream().map(actorEntity -> mapper.map(actorEntity, ActorResponseDto.class)).collect(Collectors.toList());
    }
    public List<ActorResponseDto> findActorsWithFavoriteMovie() {
        List<ActorEntity> actorList = actorRepository.findByfavoriteMovieIsNotNull();
        return actorList.stream()
                .map(actor ->
                        mapper.map(actor, ActorResponseDto.class)).collect(Collectors.toList());
    }
    public List<ActorResponseDto> findActorsWithRating(BigDecimal raiting){
        List<ActorEntity> actorList = actorRepository.findActorsWithRating(raiting);
        return actorList.stream().map(actorEntity -> mapper.map(actorEntity, ActorResponseDto.class)).collect(Collectors.toList());
    }

    public List<ActorResponseDto> findActorWorkInMovie(String movie){
        List<ActorEntity> actorList = actorRepository.findActorWorkInMovie(movie);
        return actorList.stream().map(actorEntity -> mapper.map(actorEntity, ActorResponseDto.class)).collect(Collectors.toList());
    }







}
