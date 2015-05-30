package de.dhbw.socialfunnel.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


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
		http.csrf().disable().authorizeRequests().antMatchers("**").permitAll();
//		http
//		.exceptionHandling()
//        .accessDeniedPage( "/403" )
//        .and()
//
//	    .authorizeRequests()
//	        .antMatchers( "/login**" ).permitAll()
//	        .antMatchers( "/admin/**" ).hasRole( "ADMIN" )
//	        .anyRequest().authenticated()
//	        .and()
//	    .requiresChannel()
//	        .anyRequest().requiresSecure()
//	        .and()	
//	    
//	    .formLogin()
//	        .loginPage( "/login" )
//	        .loginProcessingUrl( "/login.do" )
//	        .defaultSuccessUrl( "/" )
//	        .failureUrl( "/login?err=1" )
//	        .usernameParameter( "username" )
//	        .passwordParameter( "password" )
//	        .and()
//	   
//	    .logout()
//	        .logoutRequestMatcher( new AntPathRequestMatcher( "/logout" ) )
//	        .logoutSuccessUrl( "/login?out=1" )
//	        .deleteCookies( "JSESSIONID" )
//	        .invalidateHttpSession( true )
//	        .and()
//	   
//	    .sessionManagement()
//	        .invalidSessionUrl( "/login?time=1" )
//	        .maximumSessions( 1 );
	
	}
}
