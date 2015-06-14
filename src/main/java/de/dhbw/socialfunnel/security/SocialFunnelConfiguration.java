package de.dhbw.socialfunnel.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.vaadin.spring.annotation.EnableVaadin;

import de.dhbw.socialfunnel.view.component.LogoutListener;
import de.dhbw.socialfunnel.view.component.RegisterFormListener;

@Configuration
@EnableVaadin
@ComponentScan(basePackages = {"de.dhbw.socialfunnel.security", "de.dhbw.socialfunnel.view", "de.dhbw.socialfunnel.dao"})
public class SocialFunnelConfiguration {
	

	
	@Bean
	public RegisterFormListener registerFormListener() {
		return new RegisterFormListener();
	}
	
	@Bean
	public LogoutListener logoutListener() {
		return new LogoutListener();
	}
	
	@Bean
	public AuthManager authManager() {
		AuthManager res = new AuthManager();
		return res;
	}

	@Bean
	public UserService userService() {
		UserService res = new UserService();
		return res;
	}
}