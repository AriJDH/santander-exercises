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
public interface IMovieRepository extends JpaRepository<MovieEntity, Integer> {
    @Query("FROM MovieEntity m JOIN ActorMovieEntity am ON am.movie.id = m.id JOIN ActorEntity a ON a.id = am.actor.id WHERE a.raiting > :rating")
    List<MovieEntity> findFilmWithActorWithRating(@Param("rating") BigDecimal rating);

    //Listar todas las películas que pertenezcan al <género recibido por parámetro>
    @Query("FROM MovieEntity m WHERE m.genre.name = :gender")
    List<MovieEntity> findMoviesForGender(@Param("gender")  String gender);
}
