package com.santander.moviesapp.service;



import com.santander.moviesapp.dto.response.EpisodeResponseDto;
import com.santander.moviesapp.entity.EpisodeEntity;
import com.santander.moviesapp.repository.IEpisodeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EpisodeService implements  IEpisodeService{
    @Autowired
    IEpisodeRepository episodeRepository;

    ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<EpisodeResponseDto> findEpisodeEntityByLastNameActor(String lastName) {
        List<EpisodeEntity> episodeEntityList = episodeRepository.findEpisodeEntityBynameActor(lastName);

        return episodeEntityList.stream().map(episodeEntity ->
                modelMapper.map(episodeEntity, EpisodeResponseDto.class)).collect(Collectors.toList());
    }
}
