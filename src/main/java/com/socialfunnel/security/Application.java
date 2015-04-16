package com.socialfunnel.security;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseFactory;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.jdbc.datasource.init.DatabasePopulator;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.social.connect.jdbc.JdbcUsersConnectionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.vaadin.spring.sample.security.account.JdbcAccountRepository;
import org.vaadin.spring.servlet.SpringAwareVaadinServlet;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application  {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public SpringAwareVaadinServlet springAwareVaadinServlet() {
		return new CustomVaadinServlet();
	}
	
	
	/**
	 * Controller for redirecting / to VaadinServlet mapped at /ui.
	 * 
	 */
	@Controller	
	public static class RootController {
		
		@RequestMapping(value="/", method=RequestMethod.GET)
		public String redirectToUi() {
			return "redirect:/SocialFunnel";
		}
	}
	
}
