package de.dhbw.socialfunnel.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vaadin.spring.annotation.EnableVaadin;

@Configuration
@EnableVaadin
public class SocialFunnelConfiguration {
	
	@Bean
	public HelloBean helloBean(){
		return new HelloBean();
	}
}