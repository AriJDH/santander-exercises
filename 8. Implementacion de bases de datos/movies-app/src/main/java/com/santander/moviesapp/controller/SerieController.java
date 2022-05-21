package com.santander.moviesapp.controller;



import com.santander.moviesapp.dto.response.SerieResponseDto;
import com.santander.moviesapp.service.ISerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SerieController {
    @Autowired
    ISerieService serieService;

    @GetMapping("/serieswithseasongreater/{cantidad}")
    public List<SerieResponseDto> seriesWithSeasonGreater(@PathVariable Integer cantidad){
        List<SerieResponseDto> serieResponseDtos = serieService.findSerieEntityByCountSeasonGreaterThan(cantidad);
        return serieResponseDtos;
    }

}
