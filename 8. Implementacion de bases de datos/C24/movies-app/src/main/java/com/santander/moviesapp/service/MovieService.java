package com.santander.moviesapp.service;


import com.santander.moviesapp.repository.IMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService{
    @Autowired
    IMovieRepository movieRepository;


}
