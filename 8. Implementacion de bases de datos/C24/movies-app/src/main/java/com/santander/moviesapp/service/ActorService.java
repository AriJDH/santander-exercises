package com.santander.moviesapp.service;

import com.santander.moviesapp.dto.response.ActorResponseDto;
import com.santander.moviesapp.entity.ActorEntity;
import com.santander.moviesapp.repository.IActorRepository;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
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


    public List<ActorResponseDto> listarActores() {
        List<ActorEntity> listaActores = actorRepository.findAll();
        return listaActores.stream().map(actor -> mapper.map(actor ,ActorResponseDto.class))
                .collect(Collectors.toList());

    }

    public List<ActorResponseDto> listarActoresMayorRating(Double rating) {
        List<ActorEntity> listaActores = actorRepository.findActorsByRating(rating);

       return listaActores.stream().map(actor ->
               mapper.map(actor ,ActorResponseDto.class))
                       .collect(Collectors.toList());
               
               /*filter(r -> r.getRaiting().compareTo(rating) > 0).
                collect(Collectors.toList());*/
    }

    public List<ActorResponseDto> listarActoresPorPelicula(String name) {
        List<ActorEntity> listaActores = actorRepository.findActorsByNameOfMovie(name);

        return listaActores.stream().map(actorEntity ->
                        mapper.map(actorEntity,ActorResponseDto.class))
                .collect(Collectors.toList());
    }
}
