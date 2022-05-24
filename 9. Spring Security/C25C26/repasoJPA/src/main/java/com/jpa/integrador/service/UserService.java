package com.jpa.integrador.service;

import com.jpa.integrador.dto.request.UserRequestDTO;
import com.jpa.integrador.dto.response.UserResponseDTO;
import com.jpa.integrador.entity.UserEntity;
import com.jpa.integrador.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserDetailsServiceImpl userDetailsServiceImpl;

    @Autowired
    UserRepository userRepository;

    ModelMapper mapper = new ModelMapper();

    public void login(String username) {
        userDetailsServiceImpl.loadUserByUsername(username);
    }

    public UserResponseDTO signup(UserRequestDTO userRequestDTO) {
        UserEntity userEntity = mapper.map(userRequestDTO, UserEntity.class);

        userEntity = userRepository.save(userEntity);

        if (userEntity.getId() == null){
            throw new RuntimeException("Error al registrar usuario");
        }

        return mapper.map(userEntity, UserResponseDTO.class);
    }
}
