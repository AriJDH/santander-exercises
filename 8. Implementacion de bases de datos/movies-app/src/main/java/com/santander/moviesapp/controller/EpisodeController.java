package com.santander.moviesapp.controller;



import com.santander.moviesapp.dto.response.EpisodeResponseDto;
import com.santander.moviesapp.service.IEpisodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EpisodeController {

    @Autowired
    private IEpisodeService episodeService;

    @GetMapping("/getepisodebylastnameactor/{lastName}")
    public List<EpisodeResponseDto> getEpisodeByLastNameActor(@PathVariable String lastName){
        List<EpisodeResponseDto> episodeResponseDtoList = episodeService.findEpisodeEntityByLastNameActor(lastName);
        return episodeResponseDtoList;
    }

}
