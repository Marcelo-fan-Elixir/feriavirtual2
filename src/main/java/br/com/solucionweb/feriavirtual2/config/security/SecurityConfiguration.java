package br.com.solucionweb.feriavirtual2.config.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
 
	// Configuraciones de autenticación
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
	}
	
	//Configuraciones de Autorización
	@Override
	
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers(HttpMethod.GET,  "/usuario").permitAll()
		.antMatchers(HttpMethod.GET,  "/usuario/*").permitAll()
		.antMatchers(HttpMethod.GET,  "/empleado").permitAll()
		.antMatchers(HttpMethod.GET,  "/empleado/*").permitAll()
		.antMatchers(HttpMethod.GET,  "/producto").permitAll()
		.antMatchers(HttpMethod.GET,  "/producto/*").permitAll()
		.antMatchers(HttpMethod.GET,  "/transporte").permitAll()
		.antMatchers(HttpMethod.GET,  "/transporte/*").permitAll()
		.antMatchers(HttpMethod.GET,  "/pedido").permitAll()
		.antMatchers(HttpMethod.GET,  "/pedido/*").permitAll();
	}
	
	//Configuraciones de recursos estaticos(js, css, imagens)
	@Override
	public void configure(WebSecurity web) throws Exception {
		
	} 
	
}
