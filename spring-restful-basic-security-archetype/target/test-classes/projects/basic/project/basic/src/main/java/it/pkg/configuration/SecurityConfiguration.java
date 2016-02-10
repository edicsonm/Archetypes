package it.pkg.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
    @Autowired
    private HttpAuthenticationEntryPoint authenticationEntryPoint;
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		System.out.println("Cargando configuracion de usuarios");
		auth.inMemoryAuthentication().withUser("edicson").password("bigfoot69").roles("ADMIN");
		auth.inMemoryAuthentication().withUser("michelle").password("bigfoot69").roles("USER");
	}
	
	/*
	 * Importan to check this URL
	 * https://dzone.com/articles/secure-rest-services-using
	 */	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		System.out.println("Cargando configuracion de las restricciones");
		
		/*
		 * This configuration works propertly
		 */
		 http
	      .csrf().disable()
	      .exceptionHandling().authenticationEntryPoint(authenticationEntryPoint)
	      .and().authorizeRequests()
	        .antMatchers(HttpMethod.GET, "/api/**").authenticated()
	        .antMatchers(HttpMethod.POST, "/api/**").authenticated()
	        .antMatchers(HttpMethod.PUT, "/api/**").authenticated()
	        .antMatchers(HttpMethod.DELETE, "/api/**").authenticated()
	        .anyRequest().permitAll()
	      .and().httpBasic()
	      .and().formLogin().successHandler(new AuthSuccessHandler())
	      .and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	      
	}
	
}
