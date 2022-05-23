package com.santander.moviesapp.service;




import com.santander.moviesapp.dto.response.SerieResponseDto;
import com.santander.moviesapp.entity.SerieEntity;
import com.santander.moviesapp.repository.ISerieRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SerieService{
    @Autowired
    ISerieRepository serieRepository;

    public List<SerieResponseDto> findSeriesForSeason(Integer cantidad){
        List<SerieEntity> series = serieRepository.findSeriesForSeason(cantidad);
        List<SerieResponseDto> seriesDto = new ArrayList<>();
        for (SerieEntity s:series) {
            seriesDto.add(new SerieResponseDto(s.getTitle(),
                    s.getRelease_date(),s.getRelease_date(),s.getGenre().getName()
                    ,s.getSeasons().size()));
        }
        return seriesDto;
    }




}
