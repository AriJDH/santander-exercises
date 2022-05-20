package com.santander.moviesapp.repository;
import com.santander.moviesapp.dto.response.ActorResponseDto;
import com.santander.moviesapp.entity.ActorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

@Repository
public interface IActorRepository extends JpaRepository<ActorEntity, Integer> {

    List<ActorEntity> findByfavoriteMovieIsNotNull();

    @Query("FROM ActorEntity as ae WHERE raiting > :rating")
    List<ActorEntity> findActorWithRatingGreatingThan(@Param("rating") BigDecimal rating);


    @Query("FROM ActorEntity as a INNER JOIN ActorMovieEntity as ame ON a.id = ame.actor.id INNER JOIN MovieEntity as m ON m.id = ame.movie.id  WHERE m.title LIKE :movie")
    List<ActorEntity> findActorWorkInMovie(@Param("movie") String movie);








}
