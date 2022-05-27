package com.jpa.integrador.config;

import io.jsonwebtoken.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JwtUtils {
    private String secret;
    private int jwtExpirationInMs;

    private Map<String, String> isRoleToRole = new HashMap<String, String>(){{
       put("isAdmin", "ADMIN");
       put("isUser", "USER");
       put("isNew", "NEW");
    }};

    @Value("${jwt.secret}")
    public void setSecret(String secret) {
        this.secret = secret;
    }

    @Value("${jwt.expirationDateInMs}")
    public void setJwtExpirationInMs(int jwtExpirationInMs) {
        this.jwtExpirationInMs = jwtExpirationInMs;
    }

    public String generateToken(UserDetails userDetails) {
        Map<String, Object> claims = new HashMap<>();

        Collection<? extends GrantedAuthority> roles = userDetails.getAuthorities();

        if (roles.contains(new SimpleGrantedAuthority("ROLE_ADMIN"))) {
            claims.put("isAdmin", true);
        }
        if (roles.contains(new SimpleGrantedAuthority("ROLE_USER"))) {
            claims.put("isUser", true);
        }
        if (roles.contains(new SimpleGrantedAuthority("ROLE_NEW"))) {
            claims.put("isNew", true);
        }

        return doGenerateToken(claims, userDetails.getUsername());
    }

    private String doGenerateToken(Map<String, Object> claims, String subject) {
        return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + jwtExpirationInMs))
                .signWith(SignatureAlgorithm.HS512, secret).compact();

    }

    public boolean validateToken(String authToken) {
        try {
            Jws<Claims> claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(authToken);
            return true;
        } catch (SignatureException | MalformedJwtException | UnsupportedJwtException | IllegalArgumentException ex) {
            throw new BadCredentialsException("INVALID_CREDENTIALS", ex);
        } catch (ExpiredJwtException ex) {
            throw ex;
        }
    }

    public String getUsernameFromToken(String token) {
        Claims claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
        return claims.getSubject();

    }

    public List<SimpleGrantedAuthority> getRolesFromToken(String token) {
        Claims claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();

        List<SimpleGrantedAuthority> roles = new ArrayList<>();

        Optional<String> role = Optional.empty();

        if((role = getRole(claims, "isAdmin")).isPresent()){
            roles.add(new SimpleGrantedAuthority(role.get()));
        }

        if((role = getRole(claims, "isUser")).isPresent()){
            roles.add(new SimpleGrantedAuthority(role.get()));
        }

        if((role = getRole(claims, "isNew")).isPresent()){
            roles.add(new SimpleGrantedAuthority(role.get()));
        }

        return roles;
    }

    private Optional<String> getRole(Claims claims, String jsonField){
        Boolean isRole = claims.get(jsonField, Boolean.class);
        Optional<String> role = Optional.empty();
        if(isRole != null && isRole){
            role = Optional.of("ROLE_" + isRoleToRole.get(jsonField));
        }
        return role;
    }

}
