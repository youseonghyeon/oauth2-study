package io.security.oauth2.infrunsecurityoauth2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain1(HttpSecurity http) throws Exception {
        System.out.println("SecurityFilterChain initialized1");
        http
                .authorizeHttpRequests(req -> req.anyRequest().authenticated())
                .httpBasic(httpBasic -> httpBasic
                        .authenticationEntryPoint(new CustomAuthenticationEntryPoint()));
        return http.build();
    }

}
