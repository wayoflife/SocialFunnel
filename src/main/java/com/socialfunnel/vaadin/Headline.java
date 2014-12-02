package com.socialfunnel.vaadin;

import org.springframework.context.ApplicationContext;

import softwarengineering.SocialFunnel.MyVaadinUI;

import com.google.gwt.user.datepicker.client.DateBox;
import com.vaadin.data.validator.EmailValidator;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public class Headline extends HorizontalLayout {
	//kmmentar
	private Button btnStartseite = new Button("Startseite");
	private Button btnNeuerPost = new Button("Neuer Post");
	private Button btnNetzwerke = new Button("Meine Netzwerke");
	private Button btnEinstellungen = new Button("Einstellungen");
	private Button btnHilfe = new Button("Hilfe");
	private Button btnAbmelden = new Button("Abmelden");
	
	public Headline() {
		// TODO Auto-generated constructor stub
	
		addComponent(btnStartseite);
		addComponent(btnNeuerPost);
		addComponent(btnNetzwerke);
		addComponent(btnEinstellungen);
		addComponent(btnHilfe);
		addComponent(btnAbmelden);
		
		//btnAbmelden.addClickListener(LogoutListener);
		//btnEinstellungen.addClickListener(EinstellungenListener);
	
	}
	
}
