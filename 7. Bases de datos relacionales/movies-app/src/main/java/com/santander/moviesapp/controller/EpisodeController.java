package com.santander.moviesapp.controller;



import com.santander.moviesapp.dto.response.EpisodeResponseDto;
import com.santander.moviesapp.service.EpisodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EpisodeController {

    @Autowired
    EpisodeService episodeService;

    @GetMapping(path = "getEpisodesByActor/{actorFirstName}/{actorLastName}")
    public List<EpisodeResponseDto> getEpisodesByActor(@PathVariable String actorFirstName, @PathVariable String actorLastName){
        return episodeService.getEpisodesByActor(actorFirstName, actorLastName);
    }

}
