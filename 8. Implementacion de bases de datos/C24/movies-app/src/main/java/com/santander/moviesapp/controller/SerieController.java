package com.santander.moviesapp.controller;




import com.santander.moviesapp.dto.response.MovieResponseDto;
import com.santander.moviesapp.dto.response.SerieResponseDto;
import com.santander.moviesapp.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class SerieController {
    @Autowired
    SerieService serieService;

        @GetMapping("/series/{cantidad}")
    public ResponseEntity<List<SerieResponseDto>> getSeriesForSizeSeason(@PathVariable Integer cantidad) {
        return ResponseEntity.ok().body(serieService.findSeriesForSeason(cantidad));
    }
}
