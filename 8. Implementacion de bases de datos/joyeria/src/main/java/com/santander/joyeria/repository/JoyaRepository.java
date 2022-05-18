package com.santander.joyeria.repository;

import com.santander.joyeria.dtos.response.JoyaResponseDTO;
import com.santander.joyeria.models.Joya;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface JoyaRepository extends JpaRepository<Joya, Integer> {
    List<Joya> findJoyaByVentaONoIsFalse();
}
