package de.dhbw.socialfunnel.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.core.env.Environment;
import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.social.UserIdSource;
import org.springframework.social.config.annotation.EnableSocial;
import org.springframework.social.config.annotation.SocialConfigurerAdapter;
import org.springframework.social.connect.ConnectionFactoryLocator;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.connect.jdbc.JdbcUsersConnectionRepository;
import org.springframework.social.connect.support.ConnectionFactoryRegistry;
import org.springframework.social.connect.web.ProviderSignInController;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.connect.FacebookConnectionFactory;

@Configuration
@EnableSocial
@PropertySource("classpath:application.properties")
public class SocialConfiguration extends SocialConfigurerAdapter{
	
	@Autowired
	private Environment environment;

	@Autowired
	private DataSource dataSource;
	
	@Bean
	public ConnectionFactoryLocator connectionFactoryLocator() {
	    ConnectionFactoryRegistry registry = new ConnectionFactoryRegistry();
	    registry.addConnectionFactory(new FacebookConnectionFactory(environment.getProperty("facebook.clientId"),
	        environment.getProperty("facebook.clientSecret")));
	    return registry;
	}
	
	@Bean
	UserIdSource userIdSource(){
		return new UserIdSource() {
			
			@Override
			public String getUserId() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	@Bean
	public UsersConnectionRepository usersConnectionRepository() {
	    JdbcUsersConnectionRepository repository = new JdbcUsersConnectionRepository(dataSource, 
	        connectionFactoryLocator(), Encryptors.noOpText());
//	    repository.setConnectionSignUp(new SimpleConnectionSignUp());
	    return repository;
	}

	@Bean
	@Scope(value="request", proxyMode=ScopedProxyMode.INTERFACES)
	public ConnectionRepository connectionRepository() {
//	    User user = SecurityContext.getCurrentUser();
//	    return usersConnectionRepository().createConnectionRepository(user.getId());
		return null;
	}
	
	@Bean
	@Scope(value="request", proxyMode=ScopedProxyMode.INTERFACES)   
	public Facebook facebook() {
	    return connectionRepository().getPrimaryConnection(Facebook.class).getApi();
	}
	
	@Bean
	public ProviderSignInController providerSignInController() {
//	    return new ProviderSignInController(connectionFactoryLocator(), usersConnectionRepository(),
//	        new SimpleSignInAdapter());
		return null;
	}
}
