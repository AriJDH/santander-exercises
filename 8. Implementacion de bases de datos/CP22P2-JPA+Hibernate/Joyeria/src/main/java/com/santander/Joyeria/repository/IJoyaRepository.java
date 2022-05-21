package com.santander.Joyeria.repository;

import com.santander.Joyeria.entity.Joya;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IJoyaRepository extends JpaRepository<Joya, Integer> {

    List<Joya> findJoyaByVentaONoIsTrue();

}
