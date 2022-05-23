package com.santander.sorteo.repository;

import com.santander.sorteo.entity.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAlumnoRepository extends JpaRepository<Alumno,Integer> {
}
