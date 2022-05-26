package com.jpa.integrador.service;

import com.jpa.integrador.config.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired SecurityService securityService;

    @Autowired
    BCryptPasswordEncoder encoder;
    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;

    public String login(String username, String password) throws Exception{


        UserDetails user = securityService.loadUserByUsername(username);

        String token = null;

        //if(encoder.matches(password, user.getPassword()))
            token = jwtUtil.generateToken(user);
        return token;
    }

    public void signUp(){

    }
}
