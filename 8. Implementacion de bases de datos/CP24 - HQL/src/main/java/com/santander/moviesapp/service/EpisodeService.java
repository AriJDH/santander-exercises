package com.santander.moviesapp.service;


import com.santander.moviesapp.dto.response.EpisodeResponseDto;
import com.santander.moviesapp.entity.EpisodeEntity;
import com.santander.moviesapp.repository.IEpisodeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EpisodeService {

    @Autowired
    IEpisodeRepository episodeRepository;

    ModelMapper mapper = new ModelMapper();



    public List<EpisodeResponseDto> episodesWithTheActor(String name, String lastName) {
        List<EpisodeEntity> episodeList = episodeRepository.findEpisodesWithTheActor(name,lastName);
        return episodeList.stream()
                .map(episode ->
                        mapper.map(episode, EpisodeResponseDto.class)).collect(Collectors.toList());
    }

}
