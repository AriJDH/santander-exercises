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


    List<ActorEntity> findActorEntityByfavoriteMovieIsNotNull();
    List<ActorEntity> findActorEntityByRatingGreaterThanEqual(BigDecimal rating);

    @Query("SELECT a.actor FROM ActorMovieEntity a WHERE a.movie.title = :title")
    List<ActorEntity> findActorEntityBymoviesActors(@Param("title") String title);

}
