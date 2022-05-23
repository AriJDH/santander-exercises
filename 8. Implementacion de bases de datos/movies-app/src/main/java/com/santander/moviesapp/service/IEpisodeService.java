package com.santander.moviesapp.service;


import com.santander.moviesapp.dto.response.EpisodeResponseDto;

import java.util.List;

public interface IEpisodeService {

    public List<EpisodeResponseDto> findEpisodeEntityByLastNameActor(String lastName);
}
