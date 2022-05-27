package com.jpa.integrador.repository;

import com.jpa.integrador.entity.Role;
import com.jpa.integrador.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
