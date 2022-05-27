package com.santander.moviesapp.service;

import com.santander.moviesapp.dto.response.ActorFavoriteMovieResponseDto;
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

    public List<ActorResponseDto> getActors (){
        List<ActorEntity> listActors = actorRepository.findAll();
        return listActors.stream().map(actor -> mapper.map(actor,ActorResponseDto.class)).collect(Collectors.toList());
    }

    public List<ActorFavoriteMovieResponseDto> getActorsFavMovie () {
        List<ActorEntity> listActors = actorRepository.findActorEntityByFavoriteMovieIsNotNull();
        return listActors.stream().map(actor -> mapper.map(actor, ActorFavoriteMovieResponseDto.class)).collect(Collectors.toList());
    }

    public List<ActorResponseDto> getActorsRatingGreaterThan (BigDecimal rating) {
        List<ActorEntity> listActors = actorRepository.findActorEntityByRatingGreaterThan(rating);
        return listActors.stream().map(actor -> mapper.map(actor,ActorResponseDto.class)).collect(Collectors.toList());
    }

    public List<ActorResponseDto> getActorsWorksInMovie (Integer idMovie) {
        List<ActorEntity> listActors = actorRepository.findActorByMovieId(idMovie);
        return listActors.stream().map(actor -> mapper.map(actor,ActorResponseDto.class)).collect(Collectors.toList());
    }
}
