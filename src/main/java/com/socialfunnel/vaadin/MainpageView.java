package com.socialfunnel.vaadin;

import com.socialfunnel.ui.components.Headline;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.VerticalLayout;

public class MainpageView extends VerticalLayout implements View{
	Headline headline = new Headline();
	private VerticalLayout vlLeft = new VerticalLayout();
	
	
	public MainpageView() {
	// TODO Auto-generated constructor stub

		addComponent(headline);
	
	}


	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}
