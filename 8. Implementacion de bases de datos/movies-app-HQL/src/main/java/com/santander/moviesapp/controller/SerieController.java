package com.santander.moviesapp.controller;



import com.santander.moviesapp.dto.response.SerieResponseDto;
import com.santander.moviesapp.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SerieController {
    @Autowired
    SerieService serieService;
    @GetMapping("/series/masDeCantTemporadas/{cantidadSeason}")
    public List<SerieResponseDto> getSeriesWithMoreSeasonThan(@PathVariable Integer cantidadSeason){
        return serieService.getSeriesWithMoreSeasonThan(cantidadSeason);
    }
}
