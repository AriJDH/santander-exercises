package com.santander.moviesapp.service;



import com.santander.moviesapp.repository.ISerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SerieService{
    @Autowired
    ISerieRepository serieRepository;


}
