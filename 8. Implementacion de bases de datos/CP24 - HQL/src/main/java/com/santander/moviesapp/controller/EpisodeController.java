package com.santander.moviesapp.controller;



import com.santander.moviesapp.dto.response.EpisodeResponseDto;
import com.santander.moviesapp.service.EpisodeService;
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

    @GetMapping("/EpisodesWithTheActor/{actor_name}/{actor_lastname}")
    public ResponseEntity<List<EpisodeResponseDto>> episodesWithTheActor (@PathVariable String actor_name, @PathVariable String actor_lastname){
        return ResponseEntity.ok().body(episodeService.episodesWithTheActor(actor_name,actor_lastname));
    }

}
