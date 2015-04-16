package com.socialfunnel.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.socialfunnel.hibernate.PWCrypt;
import com.socialfunnel.security.AuthManager;
import com.socialfunnel.ui.components.LoginForm;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;

@Component
public class LoginFormListener implements Button.ClickListener {
	@Autowired
	private AuthManager authManager;

	@Override
	public void buttonClick(Button.ClickEvent event) {
		try {
			Button source = event.getButton();
			LoginForm parent = (LoginForm) source.getParent();
			String username = parent.getTxtLogin().getValue();
			String password =  PWCrypt.getInstance().encrypt(parent.getTxtPassword().getValue());
			UsernamePasswordAuthenticationToken request = new UsernamePasswordAuthenticationToken(
					username, password);
			Authentication result = authManager.authenticate(request);
			SecurityContextHolder.getContext().setAuthentication(result);
			//navigieren auf user
		} catch (AuthenticationException e) {
			Notification.show("Authentication failed: " + e.getMessage());
		} catch (Exception e) {
			Notification.show("Authentication failed: Unknown error");
		}
	}
}
