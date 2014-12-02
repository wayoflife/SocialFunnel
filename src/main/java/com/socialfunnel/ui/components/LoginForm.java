package com.socialfunnel.ui.components;


import org.springframework.context.ApplicationContext;

import softwarengineering.SocialFunnel.MyVaadinUI;

import com.socialfunnel.ui.LoginFormListener;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public class LoginForm extends VerticalLayout {
	private TextField txtLogin = new TextField("Login: ");
	private PasswordField txtPassword = new PasswordField("Password: ");
	private Button btnLogin = new Button("Login");
	private Label lblAnmelden = new Label("Anmelden");
	private Link lnkPasswortVergessen = new Link("Passwort vergessen?", new ExternalResource(""));

	public LoginForm() {
		lblAnmelden.setStyleName("h1");
		addComponent(lblAnmelden);
		addComponent(txtLogin);
		addComponent(txtPassword);
		addComponent(lnkPasswortVergessen);
		addComponent(btnLogin);
		
		LoginFormListener loginFormListener = getLoginFormListener();
		btnLogin.addClickListener(loginFormListener);
	}

	public LoginFormListener getLoginFormListener() {
		MyVaadinUI ui = (MyVaadinUI) UI.getCurrent();
		ApplicationContext context = ui.getApplicationContext();
		return context.getBean(LoginFormListener.class);
	}

	public TextField getTxtLogin() {
		return txtLogin;
	}

	public PasswordField getTxtPassword() {
		return txtPassword;
	}
}
