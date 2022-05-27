package com.jpa.integrador.service;


import com.jpa.integrador.config.JwtUtil;
import com.jpa.integrador.config.SecurityConfig;
import com.jpa.integrador.entity.UserEntity;
import com.jpa.integrador.repository.UserEntityRepository;

import io.jsonwebtoken.impl.DefaultClaims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    UserEntityRepository userEntityRepository;

    @Autowired
    SecurityService securityService;

    @Autowired
    JwtUtil jwtUtil;


    public String login(String username, String password) {
        UserEntity userEntity = userEntityRepository.findUserEntityByUsernameEquals(username).orElseThrow(() -> new RuntimeException());
        if (!SecurityConfig.passwordEncoder().matches(password, userEntity.getPassword())) return null;
        return jwtUtil.generateToken(securityService.loadUserByUsername(username));
    }


    public String helloAdmin() {
        return "Hola admin";
    }

    public String refreshToken(HttpServletRequest request) {
        DefaultClaims claims = (DefaultClaims) request.getAttribute("claims");
        Map<String, Object> expectedMap = getMapFromIoJsonWebTokenClaims(claims);
        String token = jwtUtil.doGenerateRefreshToken(expectedMap, expectedMap.get("sub").toString());
        return token;
    }

    private Map<String, Object> getMapFromIoJsonWebTokenClaims(DefaultClaims claims) {
        Map<String, Object> expectedMap = new HashMap<>();
        for (Map.Entry<String, Object> entry : claims.entrySet()) {
            expectedMap.put(entry.getKey(),entry.getValue());
        }
        return expectedMap;
    }
}
