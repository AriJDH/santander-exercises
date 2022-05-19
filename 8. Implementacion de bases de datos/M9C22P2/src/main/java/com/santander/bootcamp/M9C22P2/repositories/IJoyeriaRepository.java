package com.santander.bootcamp.M9C22P2.repositories;

import com.santander.bootcamp.M9C22P2.entities.Joya;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IJoyeriaRepository extends JpaRepository<Joya, Long> {}
