package com.santander.moviesapp.repository;


import com.santander.moviesapp.dto.response.MovieResponseDto;
import com.santander.moviesapp.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface IMovieRepository extends JpaRepository<MovieEntity, Integer> {


    @Query("SELECT actorMovieEntity.movie From ActorMovieEntity actorMovieEntity GROUP BY actorMovieEntity.movie HAVING MIN(actorMovieEntity.actor.raiting) > :rating")
    List<MovieEntity> findByActorRaiting(@Param("rating") BigDecimal rating);

    @Query("FROM MovieEntity movie WHERE movie.genre.name LIKE :genre")
    List<MovieEntity> findByGenre(@Param("genre") String genre);
}
