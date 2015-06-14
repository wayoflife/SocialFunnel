package de.dhbw.socialfunnel.view.component;

import com.vaadin.navigator.Navigator;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.UI;

import de.dhbw.socialfunnel.view.DatabaseTest;
import de.dhbw.socialfunnel.view.ErrorView;
import de.dhbw.socialfunnel.view.HelpView;
import de.dhbw.socialfunnel.view.LoginView;
import de.dhbw.socialfunnel.view.MainpageView;
import de.dhbw.socialfunnel.view.NetworkView;
import de.dhbw.socialfunnel.view.NewPostView;
import de.dhbw.socialfunnel.view.RegisterView;
import de.dhbw.socialfunnel.view.UserView;

public class SC_Menubar extends MenuBar{
	
	private static final long serialVersionUID = 1L;

	public SC_Menubar() {
		final Navigator navi = UI.getCurrent().getNavigator();
		this.setWidth("100%");
		
		MenuBar.Command menucommand = new MenuBar.Command() {
			
			private static final long serialVersionUID = 1L;

			@Override
			public void menuSelected(MenuItem selectedItem) {
				switch (selectedItem.getText()) {
				case "Startseite" : navi.navigateTo(MainpageView.VIEW_NAME); break;
				case "Neuer Post" : navi.navigateTo(NewPostView.VIEW_NAME); break;
				case "Meine Netzwerke" : navi.navigateTo(NetworkView.VIEW_NAME); break;
				case "Einstellungen" : navi.navigateTo(MainpageView.VIEW_NAME); break;
				case "Hilfe" : navi.navigateTo(HelpView.VIEW_NAME); break;
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
