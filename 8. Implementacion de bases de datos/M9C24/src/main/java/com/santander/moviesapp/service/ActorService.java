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

    public List<ActorResponseDto> findActorsWhoHaveFavoriteMovie(){
        List<ActorEntity> actoresList= actorRepository.findActorsWhoHaveFavoriteMovie();
        return actoresList.stream().map(actores -> mapper.map(actores,ActorResponseDto.class)).collect(Collectors.toList());
    }

    public List<ActorResponseDto> findActorsWithRatingGreaterThan(BigDecimal rating){
        List<ActorEntity> actoresList= actorRepository.findActorsWithRatingGreaterThan(rating);
        return actoresList.stream().map(actores -> mapper.map(actores,ActorResponseDto.class)).collect(Collectors.toList());
    }

    public List<ActorResponseDto> findActorByMovieId(Integer movie_id){
        List<ActorEntity> actoresList= actorRepository.findActorByMovieId(movie_id);
        return actoresList.stream().map(actores -> mapper.map(actores,ActorResponseDto.class)).collect(Collectors.toList());
    }

}
