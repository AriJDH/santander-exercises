package com.santander.moviesapp.repository;
import com.santander.moviesapp.entity.ActorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface IActorRepository extends JpaRepository<ActorEntity,Integer> {

    @Query("FROM ActorEntity act WHERE act.rating > :rat")
    List<ActorEntity> findActorsByRating(@Param("rat") Double rating);

    @Query("SELECT actm.actor FROM ActorMovieEntity actm WHERE actm.movie.title = :name")
    List<ActorEntity> findActorsByNameOfMovie(@Param("name") String name);

}
