package com.santander.moviesapp.service;



import com.santander.moviesapp.dto.response.SerieResponseDto;
import com.santander.moviesapp.entity.SerieEntity;
import com.santander.moviesapp.repository.ISerieRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SerieService implements ISerieService{
    @Autowired
    ISerieRepository serieRepository;

    ModelMapper modelMapper = new ModelMapper();


    @Override
    public List<SerieResponseDto> findSerieEntityByCountSeasonGreaterThan(Integer cantidad) {
        List<SerieEntity> serieEntities = serieRepository.findSerieEntityByCountSeasonGreaterThan(cantidad);

        return serieEntities.stream().map(serieEntity ->
                modelMapper.map(serieEntity, SerieResponseDto.class)).collect(Collectors.toList());
    }
}
