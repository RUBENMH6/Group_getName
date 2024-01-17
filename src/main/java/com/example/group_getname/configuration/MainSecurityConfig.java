package com.example.group_getname.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class MainSecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {

        UserDetails ruben = User.builder()
                .username("ruben")
                .password("{noop}test123")
                .roles("STUDENT")
                .build();

        UserDetails pedro = User.builder()
                .username("pedro")
                .password("{noop}test123")
                .roles("STUDENT","TEACHER")
                .build();


        return new InMemoryUserDetailsManager(ruben, pedro);
    }


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests(configurer ->
                        configurer
                                .requestMatchers("/").hasRole("STUDENT")
                                .requestMatchers("/students/**").hasRole("STUDENT")
                                .requestMatchers("/teachers/**").hasRole("TEACHER")
                                .anyRequest().authenticated()
                ).exceptionHandling(configurer ->
                        configurer
                                .accessDeniedPage("/access-denied"))
                .formLogin(form ->
                        form
                                .loginPage("/login")
                                .loginProcessingUrl("/authenticateTheUser")
                                .permitAll()
                )
                .logout(logout -> logout.permitAll()
                );
        return http.build();
    }

}
