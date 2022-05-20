package com.santander.moviesapp.service;

import com.santander.moviesapp.dto.request.MovieRequestDto;
import com.santander.moviesapp.dto.response.ActorResponseDto;
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


    public List<ActorResponseDto> getActorsWithMovieFav() {
        return actorRepository.findByFavoriteMovieIsNotNull().stream().map(actor->mapper.map(actor,ActorResponseDto.class)).collect(Collectors.toList());
    }

    public List<ActorResponseDto> getActorsWithRaitingSuperior(BigDecimal raiting) {
        return actorRepository.findByRaitingGreaterThan(raiting).stream().map(actor->mapper.map(actor,ActorResponseDto.class)).collect(Collectors.toList());
    }

    public List<ActorResponseDto> getActorsInFilm(String movie) {
        return actorRepository.findActorsByMovie(movie).stream().map(actor->mapper.map(actor,ActorResponseDto.class)).collect(Collectors.toList());
    }
}
