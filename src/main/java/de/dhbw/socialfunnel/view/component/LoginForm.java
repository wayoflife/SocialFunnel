package de.dhbw.socialfunnel.view.component;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;

import com.vaadin.server.ExternalResource;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.Notification;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import de.dhbw.socialfunnel.security.AuthManager;
import de.dhbw.socialfunnel.todo.PWCrypt;

@UIScope
@SpringComponent
public class LoginForm extends VerticalLayout {
	
	@Autowired
	private AuthManager authManager;
	
	private TextField txtLogin = new TextField("Email: ");
	private PasswordField txtPassword = new PasswordField("Password: ");
	private Button btnLogin = new Button("Login");
	private Label lblAnmelden = new Label("Anmelden");
	private Link lnkPasswortVergessen = new Link("Passwort vergessen?", new ExternalResource(""));

	public LoginForm() {
		txtLogin.setId("txtEmail");
		txtPassword.setId("txtPassword");
		btnLogin.setId("btnLogin");
		lnkPasswortVergessen.setId("lnkPasswortVergessen");
		
		lblAnmelden.setStyleName("h1");
		addComponent(lblAnmelden);
		addComponent(txtLogin);
		addComponent(txtPassword);
		addComponent(lnkPasswortVergessen);
		addComponent(btnLogin);
		
		//TODO einen Loginform listener hinzufügen um das login abzuarbeiten
		//Seite sollte umgebaut werden, ist so ziemlicher bullshit
		
		btnLogin.addClickListener(new Button.ClickListener() {
		    public void buttonClick(ClickEvent event) {
		    	try {
					String username = txtLogin.getValue();
					String password = txtPassword.getValue();
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
		});
	}
	
	public TextField getTxtLogin() {
		return txtLogin;
	}
	
	public PasswordField getTxtPassword() {
		return txtPassword;
	}
}
