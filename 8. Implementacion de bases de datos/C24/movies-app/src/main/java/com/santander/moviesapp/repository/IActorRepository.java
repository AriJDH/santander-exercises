package com.santander.moviesapp.repository;
import com.santander.moviesapp.entity.ActorEntity;
import com.santander.moviesapp.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface IActorRepository extends JpaRepository<ActorEntity, Integer> {

    List<ActorEntity> findAllActorsByFavoriteMovieIdIsNotNull();

    @Query("FROM ActorEntity WHERE raiting > :rating")
    List<ActorEntity> findAllActorsByRatingHigherThan(@Param("rating") BigDecimal rating);

    // con clausula where
    @Query("FROM ActorEntity a WHERE a.id IN ( SELECT ame.actor.id FROM ActorMovieEntity ame WHERE ame.movie.id IN (SELECT id FROM MovieEntity me WHERE me.title = :title))")
    // con join
    //@Query("FROM ActorEntity a JOIN ActorMovieEntity am ON am.actor.id = a.id JOIN MovieEntity m ON m.id = am.movie.id WHERE m.title like :title")
    List<ActorEntity> findAllActorsByMovie(@Param("title") String title);
}
