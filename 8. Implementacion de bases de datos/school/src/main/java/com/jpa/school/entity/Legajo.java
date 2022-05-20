package com.jpa.school.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "legajo")
public class Legajo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "codigo")
    private String code;

    @OneToOne(mappedBy = "legajo")
    //cascade = {
    //        CascadeType.REMOVE,
    //        CascadeType.PERSIST
    //})
    private Student student;

}
