package com.socialfunnel.ui.components;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.DateField;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class RegisterForm extends VerticalLayout {
	private TextField txtFirstName = new TextField("Vorname: ");
	private TextField txtSecondName = new TextField("Nachname: ");
	private TextField txtEmail = new TextField("Emailadresse: ");
	private PasswordField txtPassword = new PasswordField("Passwort: ");
	private PasswordField txtPassword2 = new PasswordField("Passwort wiederholen: ");
	private DateField txtGeburtstag = new DateField("Geburtstag: ");
	private Button btnRegistrieren = new Button("Registrieren");
	private CheckBox chbAkzeptieren = new CheckBox("Ich akzeptiere die Nutzungsbedingungen");
	private Label lblRegistrieren = new Label("Registrieren");
	private Link lnkNutzungsbedingungen = new Link("Nutzungsbedingungen", new ExternalResource(""));

	public RegisterForm() {
		lblRegistrieren.setStyleName("h1");
		addComponent(lblRegistrieren);
		addComponent(txtFirstName);
		addComponent(txtSecondName);
		addComponent(txtEmail);
		addComponent(txtPassword);
		addComponent(txtPassword2);
		addComponent(txtGeburtstag);
		
		addComponent(lnkNutzungsbedingungen);
		addComponent(chbAkzeptieren);
		addComponent(btnRegistrieren);
		
//		RegisterFormListener RegisterFormListener = getRegisterFormListener();
//		btnRegistrieren.addClickListener(null);
	}

//	public RegisterFormListener getRegisterFormListener() {
////		MyVaadinUI ui = (MyVaadinUI) UI.getCurrent();
////		ApplicationContext context = ui.getApplicationContext();
////		return context.getBean(RegisterFormListener.class);
//	}

	public TextField getTxtFirstName() {
		return txtFirstName;
	}

	public TextField getTxtSecondName() {
		return txtSecondName;
	}

	public TextField getTxtEmail() {
		return txtEmail;
	}

	public PasswordField getTxtPassword() {
		return txtPassword;
	}

	public PasswordField getTxtPassword2() {
		return txtPassword2;
	}

	public DateField getTxtGeburtstag() {
		return txtGeburtstag;
	}
}
