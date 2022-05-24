package SorteoAlumnos.repositories;

import SorteoAlumnos.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
