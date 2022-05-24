package com.jpa.integrador.service;

import com.jpa.integrador.config.JwtUtil;
import com.jpa.integrador.config.UserDetailsServiceImpl;
import com.jpa.integrador.dto.SuccessDTO;
import com.jpa.integrador.dto.request.UsersRequestDTO;
import com.jpa.integrador.entity.Users;
import com.jpa.integrador.repository.UserRepository;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsersService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private JwtUtil jwtUtil;

    public SuccessDTO crearUsuario(UsersRequestDTO user) {
        String passwordEncoded = passwordEncoder.encode(user.getPassword());
        Users nuevoUser = new Users();
        nuevoUser.setUsername(user.getUsername());
        nuevoUser.setPassword(passwordEncoded);
        nuevoUser.setRole(user.getRole());
        userRepository.save(nuevoUser);
        return new SuccessDTO("Se ha creado un nuevo usuario con id " + nuevoUser.getId(), 201);

    }

    public SuccessDTO loguearse(UsersRequestDTO user) throws Exception {
        Users usuario = userRepository.findByUsername(user.getUsername()).stream().findFirst().orElse(null);

        if (usuario != null && passwordEncoder.matches(user.getPassword(), usuario.getPassword())) {

            try {
                authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                        user.getUsername(), user.getPassword()));
            } catch (DisabledException e) {
                throw new Exception("USER_DISABLED", e);
            } catch (BadCredentialsException e) {
                throw new Exception("INVALID_CREDENTIALS", e);
            }

            UserDetails userdetails = userDetailsService.loadUserByUsername(user.getUsername());
            String token = jwtUtil.generateToken(userdetails);
            return new SuccessDTO("El usuario se ha logeado con el token: " + token, 200);
        }
        return new SuccessDTO("No coincide con un usuario registrado", 400);
    }
    //return new SuccessDTO("No coincide con un usuario registrado",400);




    private String getJWTToken(String username) {
        String secretKey = "mySecretKey";
        List<GrantedAuthority> grantedAuthorities = AuthorityUtils
                .commaSeparatedStringToAuthorityList("ROLE_USER");

        String token = Jwts
                .builder()
                .setId("softtekJWT")
                .setSubject(username)
                .claim("authorities",
                        grantedAuthorities.stream()
                                .map(GrantedAuthority::getAuthority)
                                .collect(Collectors.toList()))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 600000))
                .signWith(SignatureAlgorithm.HS512,
                        secretKey.getBytes()).compact();

        return "Bearer " + token;
    }

}
