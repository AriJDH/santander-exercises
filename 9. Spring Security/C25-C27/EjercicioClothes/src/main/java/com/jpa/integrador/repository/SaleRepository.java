package com.jpa.integrador.repository;

import com.jpa.integrador.entity.Cloth;
import com.jpa.integrador.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Integer> {

    @Query("FROM Sale s WHERE s.date = :date")
    List<Sale> findSaleByDateEquals(@Param("date") LocalDate date);

    @Query("SELECT s.cloth FROM Sale s WHERE SIZE(s.cloth) > 3 AND s.id = :id")
    List<Cloth> findClothBySaleId(@Param("id") Integer id);

}
