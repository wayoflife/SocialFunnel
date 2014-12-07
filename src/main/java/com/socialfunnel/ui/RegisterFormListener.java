package com.socialfunnel.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.socialfunnel.auth.AuthManager;
import com.vaadin.ui.Button;

@Component
public class RegisterFormListener implements Button.ClickListener {
	@Autowired
	private AuthManager authManager;
	
	@Override
	public void buttonClick(Button.ClickEvent event) {
		
	}
}
