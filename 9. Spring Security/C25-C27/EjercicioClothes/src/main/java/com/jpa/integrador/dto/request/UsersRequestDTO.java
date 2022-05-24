package com.jpa.integrador.dto.request;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsersRequestDTO {

    private String username;
    private String password;
    private String role;
}
