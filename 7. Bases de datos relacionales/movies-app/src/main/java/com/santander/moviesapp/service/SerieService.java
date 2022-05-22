package com.santander.moviesapp.service;



import com.santander.moviesapp.dto.response.SerieResponseDto;
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

    ModelMapper mapper = new ModelMapper();

    public List<SerieResponseDto> getSeriesBySeasonNumber(Long numberOfSeasons) {

        List<SerieResponseDto> serieList = new ArrayList<>();

        serieRepository.getSeriesBySeasonNumber(numberOfSeasons).forEach(
                serieEntity -> {
                    SerieResponseDto serie = new SerieResponseDto();
                    serie.setTitle(serieEntity.getTitle());
                    serie.setGenre(serieEntity.getGenre().getName());
                    serie.setEnd_date(serieEntity.getEnd_date());
                    serie.setRelease_date(serieEntity.getRelease_date());
                    serie.setSeasons(serieEntity.getSeasons().size());
                    
                    serieList.add(serie);
                }
        );

        return serieList;
    }
}
