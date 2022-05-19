package SorteoAlumnos.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Course {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

}
