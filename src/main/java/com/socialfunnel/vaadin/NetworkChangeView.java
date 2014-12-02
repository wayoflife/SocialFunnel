package com.socialfunnel.vaadin;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.VerticalLayout;

public class NetworkChangeView extends VerticalLayout implements View{

	private Headline headline = new Headline();
	private Button btnNewNetwork = new Button("+ neues Netzwerk");
	NetworkChangeForm changeform = new NetworkChangeForm();
	
	public NetworkChangeView() {
		// TODO Auto-generated constructor stub
	addComponent(headline);
	addComponent(btnNewNetwork);
	//addComponent(changeform);
	
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
