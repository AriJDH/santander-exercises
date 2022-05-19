package SorteoAlumnos.repositories;

import SorteoAlumnos.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Integer> {
}
