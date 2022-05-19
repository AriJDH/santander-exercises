package com.santander.aplicacionSorteo.repository;

import com.santander.aplicacionSorteo.entity.Alumnos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumnos, Integer> {
}
