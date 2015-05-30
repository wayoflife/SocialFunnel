package de.dhbw.socialfunnel.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;
import org.vaadin.spring.sample.security.VaadinSpringSocialConfigurer;


@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	DataSource dataSource;

	@Autowired
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("guest").password("password").roles("USER");
		super.configure(auth);
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		//Ignoring static resources
		web.ignoring().antMatchers("/VAADIN/**");
	}
	
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		LoginUrlAuthenticationEntryPoint authenticationEntryPoint = new LoginUrlAuthenticationEntryPoint("/ui/signin");
		
		http.csrf().disable().authorizeRequests().antMatchers("**").permitAll();
		http
		.authorizeRequests()								
			.antMatchers("/auth", "/ui/signin", "/ui/signup", "/ui/UIDL/**").permitAll()				
			.antMatchers("/**").authenticated()
			.and()			
		.exceptionHandling()
			.authenticationEntryPoint(authenticationEntryPoint)
			.and()
		.apply(new VaadinSpringSocialConfigurer().signupUrl("/ui/signup").postLoginUrl("/ui/").postFailureUrl("/ui/signin"))
			.and()
		.logout()
			.logoutSuccessUrl("/ui/signin")
			.deleteCookies("JSESSIONID")
			.and()
		.csrf().disable();
	}
	
}
