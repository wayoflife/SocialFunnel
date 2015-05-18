package de.dhbw.socialfunnel.view.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.vaadin.navigator.Navigator;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;

import de.dhbw.socialfunnel.security.AuthManager;
import de.dhbw.socialfunnel.todo.PWCrypt;

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
			UI.getCurrent().getNavigator().navigateTo("user");
		} catch (AuthenticationException e) {
			Notification.show("Authentication failed: " + e.getMessage());
		} catch (Exception e) {
			Notification.show("Authentication failed: Unknown error");
		}
	}
}
