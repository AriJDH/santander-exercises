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

    @Query("FROM ActorEntity a WHERE a.favoriteMovie != null")
    List<ActorEntity> findActorsWhoHaveFavoriteMovie();

    @Query("FROM ActorEntity a WHERE a.rating >= :rating")
    List<ActorEntity> findActorsWithRatingGreaterThan(@Param("rating") BigDecimal rating);

    @Query("SELECT a.actor FROM ActorMovieEntity a WHERE a.movie.id = :peliculaId")
    List<ActorEntity> findActorByMovieId (@Param("peliculaId") Integer peliculaId);
}
