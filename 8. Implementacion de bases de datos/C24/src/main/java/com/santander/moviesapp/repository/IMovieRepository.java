package com.santander.moviesapp.repository;


import com.santander.moviesapp.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface IMovieRepository extends JpaRepository<MovieEntity, Integer> {

    @Query("SELECT DISTINCT am.movie FROM ActorMovieEntity am WHERE am.actor.rating > :rating")
    List<MovieEntity> findMoviesWhichActorsRatingGreaterThan (@Param("rating") BigDecimal rating);

    @Query("FROM MovieEntity m WHERE m.genre.id = :genreId")
    List<MovieEntity> findMoviesByGenreId (@Param("genreId") Integer genreId);

}
