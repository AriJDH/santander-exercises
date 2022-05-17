package com.jpa.joyeria.repository;

import com.jpa.joyeria.models.Joya;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface joyeriaRepo extends JpaRepository<Joya, Integer> {

}
