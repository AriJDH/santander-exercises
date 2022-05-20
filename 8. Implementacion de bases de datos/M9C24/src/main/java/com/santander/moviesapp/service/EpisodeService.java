package com.santander.moviesapp.service;



import com.santander.moviesapp.dto.response.EpisodeResponseDto;
import com.santander.moviesapp.entity.EpisodeEntity;
import com.santander.moviesapp.repository.IEpisodeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EpisodeService {
    @Autowired
    IEpisodeRepository episodeRepository;

    ModelMapper mapper = new ModelMapper();

    public List<EpisodeResponseDto> findEpisodeByActorId (Integer actorId){
        List<EpisodeEntity> episodeEntityList= episodeRepository.findEpisodeByActorId(actorId);
        return episodeEntityList.stream().map(episode -> mapper.map(episode, EpisodeResponseDto.class)).collect(Collectors.toList());

    }


}
