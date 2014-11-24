package com.socialfunnel.vaadin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.
  annotation.ComponentScan;
import org.springframework.context.
  annotation.Configuration;
import org.springframework.context.
  annotation.Scope;
@Configuration
@ComponentScan(basePackages = {"com.app.ui" , 
  "com.app.auth", "com.app.service"})
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
  @Bean
  public LoginFormListener loginFormListener() {
    return new LoginFormListener();
  }
}
