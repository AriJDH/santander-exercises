package com.jpa.integrador.service;

import com.jpa.integrador.config.UserDetailsServiceImpl;
import com.jpa.integrador.dto.SuccessDTO;
import com.jpa.integrador.dto.request.UsersRequestDTO;
import com.jpa.integrador.entity.Users;
import com.jpa.integrador.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @Autowired
    UserDetailsServiceImpl userDetailsService;

    public SuccessDTO crearUsuario(UsersRequestDTO user){
       String passwordEncoded = passwordEncoder.encode(user.getPassword());
       Users nuevoUser = new Users();
       nuevoUser.setUsername(user.getUsername());
       nuevoUser.setPassword(passwordEncoded);
       userRepository.save(nuevoUser);
       return new SuccessDTO("Se ha creado un nuevo usuario con id " + nuevoUser.getId() , 201);

    }

    public SuccessDTO loguearse(UsersRequestDTO user) {
        Users usuario = userRepository.findByUsername(user.getUsername()).stream().findFirst().orElse(null);

        if(usuario != null && passwordEncoder.matches(user.getPassword(), usuario.getPassword())){
            userDetailsService.loadUserByUsername(usuario.getUsername());
            return new SuccessDTO("Se ha loggeado con éxito",200);
        }
        return new SuccessDTO("No coincide con un usuario registrado",400);
    }
}
