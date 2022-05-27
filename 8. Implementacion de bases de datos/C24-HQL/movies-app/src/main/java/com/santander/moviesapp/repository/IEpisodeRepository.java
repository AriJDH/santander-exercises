package com.santander.moviesapp.repository;

import com.santander.moviesapp.entity.EpisodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEpisodeRepository extends JpaRepository<EpisodeEntity, Integer> {



}
