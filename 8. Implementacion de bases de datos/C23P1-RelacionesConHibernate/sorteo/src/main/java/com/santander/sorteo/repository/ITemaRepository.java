package com.santander.sorteo.repository;

import com.santander.sorteo.entity.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITemaRepository extends JpaRepository<Tema,Integer> {
}
