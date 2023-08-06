package com.amarjeet.spring.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Service;

@Service 
public class SecurityConfig {
	@Autowired
	private AuthenticationManager authenticationManager;
	@Bean
	     void filterChain(HttpSecurity http) throws Exception {
	        http
	            .authorizeHttpRequests((authz) -> {
					try {
						authz
						    .anyRequest().authenticated().and().oauth2Login();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});
	            
	    }
}
