package com.jpa.JoyeriaLasPerlas.repository;

import com.jpa.JoyeriaLasPerlas.entity.Joya;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IJoyaRepository extends JpaRepository<Joya,Integer> {

    List<Joya> findJoyaByventaONoIsTrue();


}
