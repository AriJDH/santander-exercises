package com.santander.moviesapp.repository;


import com.santander.moviesapp.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface IMovieRepository extends JpaRepository<MovieEntity, Integer> {


    @Query("FROM MovieEntity AS m WHERE m.id IN (SELECT movie.id FROM ActorMovieEntity AS ame WHERE ame.actor.id IN (SELECT id FROM ActorEntity WHERE rating > :rating))")
    List<MovieEntity> findMoviesActorRatingHigherThan(BigDecimal rating);
}
