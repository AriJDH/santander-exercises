package com.santander.moviesapp.service;



import com.santander.moviesapp.dto.response.EpisodeResponseDto;
import com.santander.moviesapp.repository.IEpisodeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EpisodeService {
    @Autowired
    IEpisodeRepository episodeRepository;

    ModelMapper mapper = new ModelMapper();
    public List<EpisodeResponseDto> getEpisodesByActor(String actorFirstName, String actorLastName) {
        List<EpisodeResponseDto> episodeList;

        episodeList = episodeRepository.getEpisodesByActor(actorFirstName, actorLastName).stream().map(
                episodeEntity -> mapper.map(episodeEntity, EpisodeResponseDto.class)
        ).collect(Collectors.toList());

        return episodeList;
    }
}
