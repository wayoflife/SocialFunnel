package de.dhbw.socialfunnel.view.component;


import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.server.ExternalResource;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

@UIScope
@SpringComponent
public class LoginForm extends VerticalLayout {
	
	@Autowired
	private LoginFormListener listener;
	
	private TextField txtLogin = new TextField("Login: ");
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
		//btnLogin.addClickListener(null);
	}
}
