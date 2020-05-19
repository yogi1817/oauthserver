package com.hmhs.authentication.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
public class AuthenticationWebSecurityConfigurer extends WebSecurityConfigurerAdapter{

	/**
	 * This will configure /auth/oauth/token service
	 */
	@Override
	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception {
		// TODO Auto-generated method stub
		return super.authenticationManagerBean();
	}

	/**
	 * This will configure /auth/user service
	 */
	@Override
	@Bean
	public UserDetailsService userDetailsServiceBean() throws Exception {
		// TODO Auto-generated method stub
		return super.userDetailsServiceBean();
	}

	/**
	 * If you are not using any password encoder, you have to add {noop} 
	 * telling spring that password is not secured by any do you try to decode it.
	 */
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("yogesh.sharma")
				.password("{noop}Computer1")
				.roles("USER")
		.and()
			.withUser("csp")
			.password("{noop}Computer1")
			.roles("USER","ADMIN");
			
	}
}