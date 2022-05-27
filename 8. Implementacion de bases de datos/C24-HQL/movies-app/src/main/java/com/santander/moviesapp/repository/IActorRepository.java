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
    //@Query("FROM ActorEntity a WHERE a.favoriteMovie != null")
    List<ActorEntity> findActorEntityByFavoriteMovieIsNotNull();

    @Query("FROM ActorEntity a WHERE a.raiting > :rating")
    List<ActorEntity> findActorEntityByRatingGreaterThan(@Param("rating") BigDecimal rating);

    @Query("SELECT a.actor FROM ActorMovieEntity a WHERE a.movie.id = :movieId")
    List<ActorEntity> findActorByMovieId (@Param("movieId") Integer movieId);

}
