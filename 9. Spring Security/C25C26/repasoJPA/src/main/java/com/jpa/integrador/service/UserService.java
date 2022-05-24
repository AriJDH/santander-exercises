package com.jpa.integrador.service;

import com.jpa.integrador.dto.LoginDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserDetailsServiceImpl userDetailsServiceImpl;

    public void login(String username) {
        userDetailsServiceImpl.loadUserByUsername(username);
    }
}
