package com.socialfunnel.ui.components;

import com.vaadin.ui.CheckBox;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class NetworkChangeForm extends VerticalLayout {

	private ComboBox cbbNetzwerke = new ComboBox("Netzwerk");
	private TextField txtLogin = new TextField("Login");
	private PasswordField pwdPasswort = new PasswordField("Passwort");
	private CheckBox chbAktiv = new CheckBox("Aktiv");
	private HorizontalLayout hl1 = new HorizontalLayout();
	private HorizontalLayout hl2 = new HorizontalLayout();

	public NetworkChangeForm() {
		hl1.addComponent(cbbNetzwerke);
		hl1.addComponent(txtLogin);
		hl1.addComponent(pwdPasswort);

		hl2.addComponent((Component) chbAktiv);

		addComponent(hl1);
		addComponent(hl2);

		cbbNetzwerke.addItem("Facebook");
		cbbNetzwerke.addItem("Twitter");
		cbbNetzwerke.setId("listNetwork");
	}
}
