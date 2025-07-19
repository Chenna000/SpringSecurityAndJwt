package com.securityy.Security.service;

import com.securityy.Security.CustomUserDetails;
import com.securityy.Security.entity.User;
import com.securityy.Security.repo.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Objects;
@Component
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User  user = userRepository.findByUserName(username);
        if(Objects.isNull(user)){
            System.out.println("User Not Available");
            throw new UsernameNotFoundException("User not Available");
        }
        return new CustomUserDetails(user);
    }
}
