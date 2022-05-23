package com.santander.moviesapp.repository;
import com.santander.moviesapp.entity.ActorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface IActorRepository extends JpaRepository<ActorEntity, Integer> {
    List<ActorEntity> findByfavoriteMovieIsNotNull();

    @Query("FROM ActorEntity WHERE raiting > :parametro ")
    List<ActorEntity> findActorsForRating(@Param("parametro") BigDecimal raiting );


    @Query("FROM ActorEntity a JOIN ActorMovieEntity am ON am.actor.id = a.id JOIN MovieEntity m ON m.id = am.movie.id WHERE m.title like :movie")
    List<ActorEntity> findActorWorkInMovie(@Param("movie") String movie);




}
