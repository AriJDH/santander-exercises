package com.jpa.integrador.repository;

import com.jpa.integrador.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User,String> {
}
