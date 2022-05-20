package com.example.showroom.repository;

import com.example.showroom.dto.ClothResponseDTO;
import com.example.showroom.model.Cloth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClothRepository extends JpaRepository<Cloth, Integer> {

    @Query("FROM Cloth WHERE size = :size")
    List<Cloth> findClothesBySize(String size);

    @Query("FROM Cloth WHERE name LIKE %:name%")
    List<Cloth> findClothesByName(@Param("name") String name);
}
