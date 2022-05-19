package com.jpa.school.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class Legajo {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "codigo")
    private String code;

    @OneToOne(mappedBy = "legajo",
            cascade = {
                //un estudiante no existe si no existe su legajo
                CascadeType.REMOVE,
                CascadeType.PERSIST
            })
    private Student student;

}
