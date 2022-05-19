package com.santander.bootcamp.M9C23P1.repositories;

import com.santander.bootcamp.M9C23P1.entities.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {
}
