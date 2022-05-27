package com.jpa.integrador.repository;

import com.jpa.integrador.entity.Cloth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClothRepository extends JpaRepository<Cloth, Integer> {

    @Query("FROM Cloth c WHERE c.size = :size")
    List<Cloth> findClothBySizeEquals(@Param("size") String size);

    @Query("FROM Cloth c WHERE name LIKE %:name%")
    List<Cloth> findClothByNameContains(@Param("name") String name);

}
