package com.example.sorteo.repository;

import com.example.sorteo.entity.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITemaRepository extends JpaRepository<Tema,Integer> {


}
