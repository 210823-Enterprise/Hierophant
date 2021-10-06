package com.hierophant.config;

import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity; // might need to change back to this
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter implements ApplicationContextAware  {
	@Override
	public void configure(WebSecurity http) throws Exception {
//		http.authorizeRequests().antMatchers("/").permitAll().antMatchers("/h2-console/**").permitAll();
//
//		http.csrf().disable();
//		http.headers().frameOptions().disable();
		http.ignoring().antMatchers("/v2/api-docs",
                 "/configuration/ui",
                 "/swagger-resources/**",
                 "/configuration/security",
                 "/swagger-ui.html",
                 "/webjars/**",
                 "/h2-console/**",
                 "/users/**",
                 "/posts/**",
                 "/images/**",
                 "/comments/**"); // Main, login page will be ignore
	}
}
