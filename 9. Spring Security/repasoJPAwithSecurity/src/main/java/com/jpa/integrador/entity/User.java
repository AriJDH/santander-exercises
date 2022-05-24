package com.jpa.integrador.entity;

import com.jpa.integrador.entity.classes.Rol;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class User {
    @Id
    String username;

    @Column()
    String password;

    @Column()
    String rol;
}
