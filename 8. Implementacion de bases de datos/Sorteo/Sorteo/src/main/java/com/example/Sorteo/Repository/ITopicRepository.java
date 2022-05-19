package com.example.Sorteo.Repository;

import com.example.Sorteo.Models.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITopicRepository extends JpaRepository<Topic, Integer> {
}
