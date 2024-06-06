package com.ss.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Autowired
	private UserDetailsService userDetailsService;


	
	  @Bean 
	  AuthenticationProvider authProvider() { DaoAuthenticationProvider
	  provider=new DaoAuthenticationProvider();
	  provider.setUserDetailsService(userDetailsService);
	  provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance()); return
	  provider; }
	 
	
	
	
	
	
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		http.csrf(customizer -> customizer.disable())
				.authorizeHttpRequests(request -> request.anyRequest().authenticated())
				.formLogin(Customizer.withDefaults())
				.httpBasic(Customizer.withDefaults())
				.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

		return http.build();
	}

}
//	
//	
//
//
//
//
//
//	
//	
////	
////	  @Bean 
////	  UserDetailsService userDetailsService() {
////	  
////	  UserDetails user=User.withDefaultPasswordEncoder() .username("Magesh")
////	  .password("M@123") .roles("USER") .build();
////	  
////	  UserDetails admin=User.withDefaultPasswordEncoder() .username("admin")
////	  .password("admin@789") .roles("ADMIN") .build();
////	  
////	  return new InMemoryUserDetailsManager(user,admin); }
////	 
//	
//}	
