package com.sorteo.repository;

import com.sorteo.entity.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemaRepository extends JpaRepository<Tema, Integer> {
}
