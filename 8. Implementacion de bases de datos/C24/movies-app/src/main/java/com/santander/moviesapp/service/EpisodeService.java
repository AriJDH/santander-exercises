package com.santander.moviesapp.service;



import com.santander.moviesapp.dto.response.EpisodeResponseDto;
import com.santander.moviesapp.dto.response.SerieResponseDto;
import com.santander.moviesapp.entity.EpisodeEntity;
import com.santander.moviesapp.entity.SerieEntity;
import com.santander.moviesapp.repository.IEpisodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EpisodeService {
    @Autowired
    IEpisodeRepository episodeRepository;

    public List<EpisodeResponseDto> findSerieForActor(String nombreActor){
        List<EpisodeEntity> episodios = episodeRepository.findSerieForActor(nombreActor);

        List<EpisodeResponseDto> episodesEntity = new ArrayList<>();
        for (EpisodeEntity e:episodios) {
            episodesEntity.add(new EpisodeResponseDto(e.getId(),e.getTitle(),e.getNumber(),e.getRelease_date(),e.getRating()));
        }
        return episodesEntity;
    }
}
