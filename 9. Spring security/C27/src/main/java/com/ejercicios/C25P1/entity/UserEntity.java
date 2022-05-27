package com.ejercicios.C25P1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "users")
@Entity
public class UserEntity {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String username;
    @Column
    private String role;
    @Column
    private String password;
}
