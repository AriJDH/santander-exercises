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

    @Query("SELECT a.movie FROM ActorMovieEntity a WHERE a.actor.rating > :rating")
    List<MovieEntity> findMovieEntityByratingActorsGreaterThanEqual(@Param("rating") BigDecimal rating);

    @Query("FROM MovieEntity m WHERE m.genre.name = :name")
    List<MovieEntity> findMovieEntityBynameGenre(@Param("name") String name);



}
