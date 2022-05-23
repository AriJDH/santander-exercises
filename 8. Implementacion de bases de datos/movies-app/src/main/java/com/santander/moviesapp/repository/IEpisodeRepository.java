package com.santander.moviesapp.repository;

import com.santander.moviesapp.entity.EpisodeEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEpisodeRepository extends JpaRepository<EpisodeEntity, Integer> {

    @Query("SELECT ae.episode FROM ActorEpisodioEntity ae WHERE ae.actor.lastName = :lastName")
    List<EpisodeEntity> findEpisodeEntityBynameActor(@Param("lastName") String lastName);



}
