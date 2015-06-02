package de.dhbw.socialfunnel.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;

import com.vaadin.spring.server.SpringVaadinServlet;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public SpringVaadinServlet springVaadinServlet() {
		return new SocialFunnelServlet();
	}
	
	@Bean
	public ServletRegistrationBean dispatcherRegistration(DispatcherServlet dispatcherServlet) {
	    ServletRegistrationBean registration = new ServletRegistrationBean(
	            dispatcherServlet);
//	    registration.addUrlMappings("/", "/ui/*");
	    return registration;
	}

}
