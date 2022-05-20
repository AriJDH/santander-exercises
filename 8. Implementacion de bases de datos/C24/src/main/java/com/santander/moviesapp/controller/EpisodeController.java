package com.santander.moviesapp.controller;



import com.santander.moviesapp.dto.response.EpisodeResponseDto;
import com.santander.moviesapp.dto.response.MovieResponseDto;
import com.santander.moviesapp.service.EpisodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EpisodeController {

    @Autowired
    EpisodeService episodeService;

    @GetMapping("/findEpisodeByActorId")
    public ResponseEntity<List<EpisodeResponseDto>> findEpisodeByActorId (@RequestParam int actorId) {
        return new ResponseEntity<>(this.episodeService.findEpisodeByActorId(actorId), HttpStatus.OK);
    }

}
