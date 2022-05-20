package com.santander.moviesapp.repository;

import com.santander.moviesapp.entity.EpisodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEpisodeRepository extends JpaRepository<EpisodeEntity, Integer> {



    @Query("FROM EpisodeEntity e JOIN ActorEpisodioEntity ae ON ae.episode.id = e.id JOIN ActorEntity a ON a.id = ae.actor.id WHERE a.firstName = :name AND a.lastName = :lastName")
    List<EpisodeEntity> findEpisodesWithTheActor(@Param("name") String name, @Param("lastName") String lastName);

}
