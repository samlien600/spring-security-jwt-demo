package com.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UserUtil {

    @Bean
    public UserDetails getDefaultAdminUser() {
        return User.withUsername("admin").password("1234")
                .passwordEncoder(str -> passwordEncoder().encode(str))
                .roles("ADMIN").build();
    }

    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
