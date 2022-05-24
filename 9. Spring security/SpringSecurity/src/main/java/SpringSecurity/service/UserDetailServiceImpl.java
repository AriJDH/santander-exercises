package SpringSecurity.service;

import SpringSecurity.entity.UserEntity;
import SpringSecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userRepository.findUByUsername(username);
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();

        if (userEntity == null) {
            throw new UsernameNotFoundException("User not found");
        }

        User userDetails = null;
        if (userEntity.getRol().equals("ADMIN")) {
            grantedAuthorities.add(new SimpleGrantedAuthority("ADMIN"));
            userDetails = new User(userEntity.getUsername(), passwordEncoder.encode(userEntity.getPassword()), grantedAuthorities);

        }
        if (userEntity.getRol().equals("USER")) {
            grantedAuthorities.add(new SimpleGrantedAuthority("USER"));
            userDetails = new User(userEntity.getUsername(), passwordEncoder.encode(userEntity.getPassword()), grantedAuthorities);
        }
        return userDetails;
    }
}
