package com.santander.moviesapp.repository;


import com.santander.moviesapp.entity.SerieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface ISerieRepository extends JpaRepository<SerieEntity, Integer> {
    @Query("SELECT serie FROM SerieEntity serie WHERE SIZE(serie.seasons)> :cantidadSeason")
    List<SerieEntity> getSeriesWithMoreSeasonThan(@Param("cantidadSeason") Integer cantidadSeason);
}
