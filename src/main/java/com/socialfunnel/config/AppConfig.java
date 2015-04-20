package com.socialfunnel.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.vaadin.spring.annotation.EnableVaadin;

@Configuration
@EnableVaadin
@ComponentScan(basePackages = { "com.socialfunnel.config" })
public class AppConfig {
	//hier die beans konfigurieren
	
//	@Bean
//	public AuthManager authManager() {
//		AuthManager res = new AuthManager();
//		return res;
//	}
}
