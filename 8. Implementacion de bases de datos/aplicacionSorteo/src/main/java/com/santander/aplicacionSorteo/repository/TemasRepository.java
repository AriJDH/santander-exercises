package com.santander.aplicacionSorteo.repository;

import com.santander.aplicacionSorteo.entity.Temas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemasRepository extends JpaRepository<Temas, Integer> {
}
