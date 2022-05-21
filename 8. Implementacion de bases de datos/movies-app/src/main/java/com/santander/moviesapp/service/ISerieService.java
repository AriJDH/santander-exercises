package com.santander.moviesapp.service;

import com.santander.moviesapp.dto.response.SerieResponseDto;


import java.util.List;

public interface ISerieService {
    public List<SerieResponseDto> findSerieEntityByCountSeasonGreaterThan(Integer cantidad);
}
