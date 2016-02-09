package it.pkg.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//public class SecurityConfiguration {}

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		System.out.println("Cargando configuracion de usuarios");
		auth.inMemoryAuthentication().withUser("edicson").password("bigfoot69").roles("ADMIN");
		auth.inMemoryAuthentication().withUser("michelle").password("bigfoot69").roles("USER");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		System.out.println("Cargando configuracion de seguridad");
		http.authorizeRequests()
		.antMatchers("/login").permitAll()
		.antMatchers("/db**").hasRole("USER")
		.antMatchers("/admin**").hasRole("ADMIN")
		.anyRequest().authenticated()
		.and().formLogin().loginPage("/login")		
		.and().formLogin().usernameParameter("username").passwordParameter("password")
		.and().formLogin().defaultSuccessUrl("/main")
		.and().csrf()
        .and().exceptionHandling().accessDeniedPage("/Access_Denied");
	}
	
}
