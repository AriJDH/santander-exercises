package com.bootcamp.EjercicioCP22P2.repositories;

import com.bootcamp.EjercicioCP22P2.models.Jewerly;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JewerlyRepository extends JpaRepository<Jewerly, Integer> {

}
