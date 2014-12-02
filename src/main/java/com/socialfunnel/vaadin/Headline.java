package com.socialfunnel.vaadin;

import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;

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
