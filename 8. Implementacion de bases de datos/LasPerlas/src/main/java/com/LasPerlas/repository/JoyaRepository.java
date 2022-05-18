package com.LasPerlas.repository;

import com.LasPerlas.entity.Joya;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface JoyaRepository extends JpaRepository<Joya, Long> {

    List<Joya> findJoyaByventaONoTrue();
}
