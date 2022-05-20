package com.santander.moviesapp.repository;


import com.santander.moviesapp.dto.response.SerieResponseDto;
import com.santander.moviesapp.entity.SerieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ISerieRepository extends JpaRepository<SerieEntity, Integer> {

    @Query("FROM SerieEntity as s WHERE SIZE(s.seasons) > :cantTemporadas")
    List<SerieEntity> findSeriesWithSeasonsGreatingThan(@Param("cantTemporadas") Integer cantTemporadas);


}

