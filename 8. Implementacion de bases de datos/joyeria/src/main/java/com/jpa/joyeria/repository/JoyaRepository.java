package com.jpa.joyeria.repository;

import com.jpa.joyeria.entity.Joya;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JoyaRepository extends JpaRepository<Joya, Integer> {
    List<Joya> findJoyaByNombreEquals(String nombre);

    List<Joya> findJoyaByVentaONoIsTrue();
}
