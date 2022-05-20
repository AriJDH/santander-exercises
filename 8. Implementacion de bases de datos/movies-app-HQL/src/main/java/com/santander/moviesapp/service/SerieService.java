package com.santander.moviesapp.service;



import com.santander.moviesapp.dto.response.MovieResponseDto;
import com.santander.moviesapp.dto.response.SerieResponseDto;
import com.santander.moviesapp.repository.ISerieRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SerieService{
    @Autowired
    ISerieRepository serieRepository;
    ModelMapper mapper = new ModelMapper();

    public List<SerieResponseDto> getSeriesWithMoreSeasonThan(Integer cantidadSeason) {
        return serieRepository.getSeriesWithMoreSeasonThan(cantidadSeason).stream().map(serie->mapper.map(serie, SerieResponseDto.class)).collect(Collectors.toList());
    }
}
