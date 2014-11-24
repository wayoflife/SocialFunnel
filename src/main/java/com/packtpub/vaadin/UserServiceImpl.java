package com.packtpub.vaadin;

public class UserServiceImpl implements UserService {
	  @Override
	  public User getUser() {
	    User user = new User();
	    user.setName("Adela");
	    return user;
	  }
	}
