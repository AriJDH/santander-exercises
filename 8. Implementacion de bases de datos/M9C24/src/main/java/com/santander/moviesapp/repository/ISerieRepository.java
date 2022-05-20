package com.santander.moviesapp.repository;


import com.santander.moviesapp.entity.SerieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISerieRepository extends JpaRepository<SerieEntity, Integer> {

    // TODO: 20/05/2022 probar
    @Query("FROM SerieEntity s WHERE s.seasons.size > :seasonQuantity")
    List<SerieEntity> findSeriesWhichHaveMoreSeasonsThan (@Param("seasonQuantity") Integer seasonQuantity);
    
}
