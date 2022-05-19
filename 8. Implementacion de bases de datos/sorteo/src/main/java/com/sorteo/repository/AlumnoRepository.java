package com.sorteo.repository;

import com.sorteo.entity.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {
    Alumno findAlumnoById(int id);
}
