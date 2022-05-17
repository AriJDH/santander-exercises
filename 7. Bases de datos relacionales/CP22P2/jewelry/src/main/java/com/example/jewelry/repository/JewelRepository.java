package com.example.jewelry.repository;

import com.example.jewelry.model.Jewel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JewelRepository extends JpaRepository<Jewel, Integer> {
}
