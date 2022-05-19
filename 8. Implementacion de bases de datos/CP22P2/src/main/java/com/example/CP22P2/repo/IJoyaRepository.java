package com.example.CP22P2.repo;

import com.example.CP22P2.model.Joya;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IJoyaRepository extends JpaRepository<Joya, Integer> {

}
