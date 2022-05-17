package com.jpa.miniseries.Repository;

import com.jpa.miniseries.Models.MiniSerie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMiniserieRepository extends JpaRepository<MiniSerie, Integer> {


}
