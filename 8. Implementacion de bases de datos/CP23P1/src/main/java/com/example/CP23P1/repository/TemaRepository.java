package com.example.CP23P1.repository;

import com.example.CP23P1.entity.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemaRepository extends JpaRepository<Tema,Integer> {
}
