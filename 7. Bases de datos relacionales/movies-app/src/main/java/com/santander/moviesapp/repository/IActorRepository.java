package com.santander.moviesapp.repository;
import com.santander.moviesapp.dto.response.ActorResponseDto;
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

    List<ActorEntity> findByRaitingGreaterThan(BigDecimal rating);

    @Query("SELECT actor_movie.actor FROM ActorMovieEntity actor_movie WHERE actor_movie.movie.title like :movie")
    List<ActorEntity> findActorsByMovie(@Param("movie") String movie);
}
