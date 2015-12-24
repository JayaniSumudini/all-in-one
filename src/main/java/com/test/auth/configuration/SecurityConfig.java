package com.test.auth.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.AntPathRequestMatcher;

/**
 * Created by dileepa on 12/24/15.
 */

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureUsers(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user").password("pwd").roles("USER")
                .and()
                .withUser("admin").password("admin_pwd").roles("USER", "ADMIN");
    }

    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .antMatchers("/time/user/**").hasRole("USER")
                .anyRequest().authenticated();

        http.formLogin().loginPage("/login").permitAll();


        AntPathRequestMatcher pathRequestMatcher = new AntPathRequestMatcher("/logout");
        http.logout().logoutRequestMatcher(pathRequestMatcher);
    }

}
