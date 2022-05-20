package com.example.Joya.Repository;

import com.example.Joya.Models.Joya;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IJoya extends JpaRepository<Joya, Long> {
}
