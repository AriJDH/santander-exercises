package com.santander.moviesapp.repository;

import com.santander.moviesapp.entity.EpisodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface IEpisodeRepository extends JpaRepository<EpisodeEntity, Integer> {

    @Query("SELECT a.episode FROM ActorEpisodioEntity a WHERE a.actor.id=:id")
    List<EpisodeEntity> getEpisodesWhereActorsIs(@Param("id") Integer id);
}
