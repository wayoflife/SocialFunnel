package com.packtpub.vaadin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {
@Bean(name="userService") public UserService helloWorld() {
    return new UserServiceImpl();
  }
}
