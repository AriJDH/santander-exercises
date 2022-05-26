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
//SELECT * FROM actors WHERE favorite_movie_id>0;
    List<ActorEntity> findByfavoriteMovieIsNotNull();

    @Query("FROM ActorEntity WHERE raiting > :parametro")
    List<ActorEntity> findActorsWithRating(@Param("parametro") BigDecimal raiting);

    //SELECT * FROM actors a JOIN actor_movie am ON am.actor_id = a.id JOIN movies m ON m.id = am.movie_id WHERE m.title like 'Avatar'
    @Query("FROM ActorEntity a JOIN ActorMovieEntity am ON am.actor.id = a.id JOIN MovieEntity m ON m.id = am.movie.id WHERE m.title like :movie")
    List<ActorEntity> findActorWorkInMovie(@Param("movie") String movie);

    @Query("FROM MovieEntity m JOIN ActorMovieEntity am ON am.movie.id = m.id JOIN ActorEntity a ON a.id = am.actor.id WHERE a.raiting > :rating")
    List<ActorEntity> findFilmWithActorWithRating(@Param("rating") BigDecimal rating);

}
