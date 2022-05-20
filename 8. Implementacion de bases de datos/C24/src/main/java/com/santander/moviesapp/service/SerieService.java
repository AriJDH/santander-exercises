package com.santander.moviesapp.service;



import com.santander.moviesapp.dto.response.SerieResponseDto;
import com.santander.moviesapp.entity.SeasonEntity;
import com.santander.moviesapp.entity.SerieEntity;
import com.santander.moviesapp.repository.ISerieRepository;
import org.modelmapper.AbstractConverter;
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

    public List<SerieResponseDto> findSeriesWhichHaveMoreSeasonsThan(Integer genreId){
        List<SerieEntity> serieEntities= serieRepository.findSeriesWhichHaveMoreSeasonsThan(genreId);

        mapper.addConverter(new AbstractConverter<List<SeasonEntity>, Integer>() {
            @Override
            protected Integer convert(List<SeasonEntity> source) {
                return source.size();
            }
        });

        return serieEntities.stream().map(movie -> mapper.map(movie, SerieResponseDto.class)).collect(Collectors.toList());
    }

}
