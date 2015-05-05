package de.dhbw.socialfunnel.security;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.core.env.Environment;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.social.config.annotation.EnableSocial;
import org.springframework.social.connect.ConnectionFactoryLocator;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.connect.jdbc.JdbcUsersConnectionRepository;
import org.springframework.social.connect.support.ConnectionFactoryRegistry;
import org.springframework.social.facebook.api.User;
import org.springframework.social.facebook.connect.FacebookConnectionFactory;

//@Configuration
//@EnableSocial
public class SocialConfiguration {

//	@Bean
//	public ConnectionFactoryLocator connectionFactoryLocator() {
//	    ConnectionFactoryRegistry registry = new ConnectionFactoryRegistry();
//	    registry.addConnectionFactory(new FacebookConnectionFactory(environment.getProperty("facebook.clientId"),
//	        environment.getProperty("facebook.clientSecret")));
//	    return registry;
//	}
//
//	@Inject
//	private Environment environment;
//	
//	@Bean
//	public UsersConnectionRepository usersConnectionRepository() {
//	    JdbcUsersConnectionRepository repository = new JdbcUsersConnectionRepository(dataSource, 
//	        connectionFactoryLocator(), Encryptors.noOpText());
////	    repository.setConnectionSignUp(new SimpleConnectionSignUp());
//	    return repository;
//	}
//
//	@Inject
//	private DataSource dataSource;
//	
//	@Bean
//	@Scope(value="request", proxyMode=ScopedProxyMode.INTERFACES)
//	public ConnectionRepository connectionRepository() {
////	    User user = SecurityContext.getCurrentUser();
////	    return usersConnectionRepository().createConnectionRepository(user.getId());
//		return null;
//	}
}
