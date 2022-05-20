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

    List<ActorEntity> findAllActorsByFavoriteMovieIdIsNotNull();

    @Query("FROM ActorEntity WHERE raiting > :rating")
    List<ActorEntity> findAllActorsByRatingHigherThan(@Param("rating") BigDecimal rating);
}
