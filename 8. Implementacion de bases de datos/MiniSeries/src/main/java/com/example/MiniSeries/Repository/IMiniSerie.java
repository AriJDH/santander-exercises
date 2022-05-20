package com.example.MiniSeries.Repository;

import com.example.MiniSeries.Models.MiniSerie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMiniSerie extends JpaRepository<MiniSerie, Long> {
}
