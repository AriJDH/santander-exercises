package com.santander.moviesapp.controller;



import com.santander.moviesapp.dto.response.EpisodeResponseDto;
import com.santander.moviesapp.dto.response.SerieResponseDto;
import com.santander.moviesapp.service.EpisodeService;
import com.santander.moviesapp.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EpisodeController {
    @Autowired
    EpisodeService episodeService;

    @GetMapping("/episodios/{nombreActor}")
    public ResponseEntity<List<EpisodeResponseDto>> getEpisodeForName(@PathVariable String nombreActor) {
        return ResponseEntity.ok().body(episodeService.findSerieForActor(nombreActor));
    }
}
