package de.dhbw.socialfunnel.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.socialfunnel.todo.AuthManager;
import com.socialfunnel.todo.UserService;
import com.vaadin.spring.annotation.EnableVaadin;

import de.dhbw.socialfunnel.view.component.LoginFormListener;
import de.dhbw.socialfunnel.view.component.LogoutListener;
import de.dhbw.socialfunnel.view.component.RegisterFormListener;

@Configuration
@EnableVaadin
@ComponentScan(basePackages = {"de.dhbw.socialfunnel.security"})
public class SocialFunnelConfiguration {
	
	@Bean
	public HelloBean helloBean(){
		return new HelloBean();
	}
	
	@Bean
	public LoginFormListener loginFormListener() {
		return new LoginFormListener();
	}
	
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
	
//	@Bean
//	public HelloController helloControler(){
//		return new HelloController(facebook);
//	}
}