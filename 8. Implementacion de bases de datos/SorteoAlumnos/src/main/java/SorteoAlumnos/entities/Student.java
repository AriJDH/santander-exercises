package SorteoAlumnos.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@NoArgsConstructor
@Setter
@Getter
@Entity
@Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String first_name;

    @Column
    private String last_name;

    @Column
    private String dni;

    @Column
    private String course;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    @Cascade({org.hibernate.annotations.CascadeType.ALL, org.hibernate.annotations.CascadeType.REFRESH})
    private Topic topic;

}
