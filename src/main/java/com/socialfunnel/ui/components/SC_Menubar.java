package com.socialfunnel.ui.components;

import com.vaadin.navigator.Navigator;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.UI;

public class SC_Menubar extends MenuBar{
	
	public SC_Menubar() {
		final Navigator navi = UI.getCurrent().getNavigator();
		this.setWidth("100%");
		
		MenuBar.Command menucommand = new MenuBar.Command() {
			
			@Override
			public void menuSelected(MenuItem selectedItem) {
				switch (selectedItem.getText()) {
				case "Startseite" : navi.navigateTo("mainpage"); break;
				case "Neuer Post" : navi.navigateTo("newpost"); break;
				case "Meine Netzwerke" : navi.navigateTo("mynetworks"); break;
				case "Einstellungen" : navi.navigateTo("mainpage"); break;
				case "Hilfe" : navi.navigateTo("mainpage"); break;
				case "Abmelden" : getUI().addWindow(new LogoutWindow()); break;
				default: navi.navigateTo("mainpage"); break;
				}
			}
		};
		
		this.addItem("Startseite", menucommand);
		this.addItem("Neuer Post", menucommand);
		this.addItem("Meine Netzwerke", menucommand);
		this.addItem("Einstellungen", menucommand);
		this.addItem("Hilfe", menucommand);
		this.addItem("Abmelden", menucommand);
	}
}
