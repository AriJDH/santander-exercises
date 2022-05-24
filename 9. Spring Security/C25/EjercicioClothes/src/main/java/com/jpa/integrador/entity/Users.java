package com.jpa.integrador.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuarios")
public class Users {
    @Id
    @GeneratedValue
    Integer id;

    @Column(name = "usuario")
    String username;
    @Column(name = "contrasenia")
    String password;

}
