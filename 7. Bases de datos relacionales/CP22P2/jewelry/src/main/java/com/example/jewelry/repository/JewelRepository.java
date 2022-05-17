package com.example.jewelry.repository;

import com.example.jewelry.model.Jewel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JewelRepository extends JpaRepository<Jewel, Integer> {
    List<Jewel> findJewelBySellableIsTrue();

}
