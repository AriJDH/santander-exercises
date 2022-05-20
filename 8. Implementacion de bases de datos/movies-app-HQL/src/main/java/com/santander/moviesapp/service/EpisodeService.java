package com.santander.moviesapp.service;



import com.santander.moviesapp.dto.response.EpisodeResponseDto;
import com.santander.moviesapp.dto.response.MovieResponseDto;
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

    public List<EpisodeResponseDto> getEpisodesWhereActorsIs(Integer id) {
        return episodeRepository.getEpisodesWhereActorsIs(id).stream().map(e->mapper.map(e, EpisodeResponseDto.class)).collect(Collectors.toList());
    }
}
