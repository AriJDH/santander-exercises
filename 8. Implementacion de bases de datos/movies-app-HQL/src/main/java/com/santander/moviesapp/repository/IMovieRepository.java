package com.santander.moviesapp.repository;


import com.santander.moviesapp.dto.response.MovieResponseDto;
import com.santander.moviesapp.entity.ActorMovieEntity;
import com.santander.moviesapp.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@Repository
public interface IMovieRepository extends JpaRepository<MovieEntity, Integer> {
    @Query("SELECT actorMovieEntity.movie From ActorMovieEntity actorMovieEntity GROUP BY actorMovieEntity.movie HAVING MIN(actorMovieEntity.actor.raiting) > :raiting")
    List<MovieEntity> getFilmsWhereActorsRaiting(BigDecimal raiting);
    @Query("SELECT m FROM MovieEntity m WHERE m.genre.name=:genero")
    List<MovieEntity> findMovieEntityByGenre(@Param("genero") String genero);
}
