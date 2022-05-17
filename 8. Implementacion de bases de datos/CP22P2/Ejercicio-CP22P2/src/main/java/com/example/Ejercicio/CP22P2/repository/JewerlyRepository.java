package com.example.Ejercicio.CP22P2.repository;

import com.example.Ejercicio.CP22P2.entity.Jewelry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JewerlyRepository extends JpaRepository<Jewelry,Integer> {
}
