package com.santander.moviesapp.repository;

import com.santander.moviesapp.dto.response.EpisodeResponseDto;
import com.santander.moviesapp.entity.EpisodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEpisodeRepository extends JpaRepository<EpisodeEntity, Integer> {

    @Query("SELECT actor_episode.episode FROM ActorEpisodioEntity actor_episode WHERE actor_episode.actor.firstName LIKE :actorFirstName and actor_episode.actor.lastName LIKE :actorLastName")
    List<EpisodeEntity> getEpisodesByActor(@Param("actorFirstName") String actorFirstName, @Param("actorLastName") String actorLastName);
}
