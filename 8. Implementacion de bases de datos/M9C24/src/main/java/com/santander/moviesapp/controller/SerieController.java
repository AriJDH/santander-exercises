package com.santander.moviesapp.controller;



import com.santander.moviesapp.dto.response.SerieResponseDto;
import com.santander.moviesapp.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SerieController {

    @Autowired
    SerieService serieService;

    @GetMapping("/findSeriesWhichHaveMoreSeasonsThan")
    public ResponseEntity<List<SerieResponseDto>> findSeriesWhichHaveMoreSeasonsThan (@RequestParam Integer genreId) {
        return new ResponseEntity<>(this.serieService.findSeriesWhichHaveMoreSeasonsThan(genreId), HttpStatus.OK);
    }

}
