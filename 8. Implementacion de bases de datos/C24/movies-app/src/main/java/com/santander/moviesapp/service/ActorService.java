package com.santander.moviesapp.service;

import com.santander.moviesapp.repository.IActorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActorService{
    @Autowired
    IActorRepository actorRepository;

    ModelMapper mapper = new ModelMapper();


}
