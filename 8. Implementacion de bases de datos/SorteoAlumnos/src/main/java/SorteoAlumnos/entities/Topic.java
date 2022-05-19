package SorteoAlumnos.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table
public class Topic {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String name;

    @Column
    private String complexity;

    @OneToMany(mappedBy = "topic")
    private Set<Student> students;
}
