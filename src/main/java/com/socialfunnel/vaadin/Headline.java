package com.socialfunnel.vaadin;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Button.ClickEvent;

public class Headline extends HorizontalLayout {
	//kmmentar
	private Button btnStartseite = new Button("Startseite");
	private Button btnNeuerPost = new Button("Neuer Post");
	private Button btnNetzwerke = new Button("Meine Netzwerke");
	private Button btnEinstellungen = new Button("Einstellungen");
	private Button btnHilfe = new Button("Hilfe");
	private Button btnAbmelden = new Button("Abmelden");
	LogoutListener lgo = new LogoutListener();
	
	public Headline() {
		// TODO Auto-generated constructor stub
	
		addComponent(btnStartseite);
		addComponent(btnNeuerPost);
		addComponent(btnNetzwerke);
		addComponent(btnEinstellungen);
		addComponent(btnHilfe);
		addComponent(btnAbmelden);
		
		btnStartseite.addClickListener(new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("mainpage");
			}
		});

		btnNeuerPost.addClickListener(new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI.getCurrent().getNavigator().navigateTo("newpost");
			}
		});
		
		btnAbmelden.addClickListener(lgo);
		//btnEinstellungen.addClickListener(EinstellungenListener);
	
	}
	
}
