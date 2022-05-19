package SorteoAlumnos.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Setter
@Getter
@Entity
@Table
public class Student {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String first_name;

    @Column
    private String last_name;

    @Column
    private String dni;

    @Column
    private String course;

    @ManyToOne()
    private Topic topic;

}
