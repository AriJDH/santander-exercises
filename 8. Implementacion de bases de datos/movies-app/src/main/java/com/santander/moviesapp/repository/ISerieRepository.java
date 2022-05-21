package com.santander.moviesapp.repository;


import com.santander.moviesapp.entity.MovieEntity;
import com.santander.moviesapp.entity.SerieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISerieRepository extends JpaRepository<SerieEntity, Integer> {

    @Query("FROM SerieEntity s WHERE SIZE(s.seasons) > :cantidad")
    List<SerieEntity> findSerieEntityByCountSeasonGreaterThan(@Param("cantidad") Integer cantidad);
}
