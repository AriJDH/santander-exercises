package com.santander.moviesapp.service;



import com.santander.moviesapp.repository.IEpisodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EpisodeService {
    @Autowired
    IEpisodeRepository episodeRepository;

}
