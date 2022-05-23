package com.santander.moviesapp.repository;

import com.santander.moviesapp.entity.EpisodeEntity;
import com.santander.moviesapp.entity.SerieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEpisodeRepository extends JpaRepository<EpisodeEntity, Integer> {

    //Listar todos los episodios (de cualquier serie) donde trabaja un <actor
    @Query("FROM EpisodeEntity e JOIN ActorEpisodioEntity ae ON ae.episode.id = e.id JOIN ActorEntity a ON a.id = ae.actor.id WHERE a.firstName like :nombreActor")
    List<EpisodeEntity> findSerieForActor(@Param("nombreActor")  String nombreActor);

}
