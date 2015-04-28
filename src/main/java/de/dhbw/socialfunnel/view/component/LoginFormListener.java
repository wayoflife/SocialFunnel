package de.dhbw.socialfunnel.view.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vaadin.ui.Button;

@Component
public class LoginFormListener implements Button.ClickListener {
	
//	@Autowired
//	private AuthManager authManager;

	@Override
	public void buttonClick(Button.ClickEvent event) {
//		try {
//			Button source = event.getButton();
//			LoginForm parent = (LoginForm) source.getParent();
//			String username = parent.getTxtLogin().getValue();
//			String password =  PWCrypt.getInstance().encrypt(parent.getTxtPassword().getValue());
//			UsernamePasswordAuthenticationToken request = new UsernamePasswordAuthenticationToken(
//					username, password);
//			Authentication result = authManager.authenticate(request);
//			SecurityContextHolder.getContext().setAuthentication(result);
//			MyVaadinUI current = (MyVaadinUI) UI.getCurrent();
//			Navigator navigator = current.getNavigator();
//			navigator.navigateTo("user");
//		} catch (AuthenticationException e) {
//			Notification.show("Authentication failed: " + e.getMessage());
//		} catch (Exception e) {
//			Notification.show("Authentication failed: Unknown error");
//		}
	}
}
