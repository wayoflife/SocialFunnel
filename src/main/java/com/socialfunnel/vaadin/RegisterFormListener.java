package com.socialfunnel.vaadin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import softwarengineering.SocialFunnel.MyVaadinUI;

import com.vaadin.navigator.Navigator;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;

@Component
public class RegisterFormListener implements Button.ClickListener {
	@Autowired
	private AuthManager authManager;
//kmmentar
	@Override
	public void buttonClick(Button.ClickEvent event) {
		try {
			Button source = event.getButton();
			RegisterForm parent = (RegisterForm) source.getParent();
			String username = parent.getTxtFirstName().getValue() + parent.getTxtSecondName().getValue();
			String password = parent.getTxtPassword().getValue();
			UsernamePasswordAuthenticationToken request = new UsernamePasswordAuthenticationToken(
					username, password);
			Authentication result = authManager.authenticate(request);
			SecurityContextHolder.getContext().setAuthentication(result);
			MyVaadinUI current = (MyVaadinUI) UI.getCurrent();
			Navigator navigator = current.getNavigator();
			navigator.navigateTo("user");
		} catch (AuthenticationException e) {
			Notification.show("Authentication failed: " + e.getMessage());
		}
	}
}
