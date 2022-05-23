package com.santander.moviesapp.repository;



import com.santander.moviesapp.entity.SerieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISerieRepository extends JpaRepository<SerieEntity, Integer> {

    // Listar todas las series que tengan más de <cantidad de temporadas recibida por parámetro>
    @Query("FROM SerieEntity s WHERE s.seasons.size > :cantidad")
    List<SerieEntity> findSeriesForSeason(@Param("cantidad")  Integer cantidad);


}
