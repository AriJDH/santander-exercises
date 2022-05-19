package com.santanderbootcamp.joyeria.repository;

import com.santanderbootcamp.joyeria.model.Joya;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JoyeriaRepository extends JpaRepository<Joya, Integer> {
}
