package com.socialfunnel.ui.views;

import com.socialfunnel.ui.components.Headline;
import com.socialfunnel.ui.components.NetworkChangeForm;
import com.socialfunnel.ui.components.SC_Menubar;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.VerticalLayout;

public class NetworkChangeView extends VerticalLayout implements View{

	private Headline headline = new Headline();
	private SC_Menubar menubar = new SC_Menubar();
	private Button btnNewNetwork = new Button("+ neues Netzwerk");
	NetworkChangeForm changeform = new NetworkChangeForm();
	
	public NetworkChangeView() {
		// TODO Auto-generated constructor stub
//	addComponent(headline);
	addComponent(menubar);
	addComponent(btnNewNetwork);
	addComponent(changeform);
	
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
