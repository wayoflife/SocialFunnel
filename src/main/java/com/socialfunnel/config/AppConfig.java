package com.socialfunnel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.social.facebook.api.Facebook;

import com.socialfunnel.auth.AuthManager;
import com.socialfunnel.service.UserService;
import com.socialfunnel.ui.LoginFormListener;
import com.socialfunnel.ui.LogoutListener;
import com.socialfunnel.ui.RegisterFormListener;

@Configuration
@ComponentScan(basePackages = { "com.socialfunnel.ui", "com.socialfunnel.auth", "com.socialfunnel.service", "facebookConnect" })
public class AppConfig {
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
}
