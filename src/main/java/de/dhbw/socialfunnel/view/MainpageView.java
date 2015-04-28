package de.dhbw.socialfunnel.view;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.VerticalLayout;

import de.dhbw.socialfunnel.view.component.Headline;
import de.dhbw.socialfunnel.view.component.SC_Menubar;

public class MainpageView extends VerticalLayout implements View{
	private Headline headline = new Headline();
	private SC_Menubar menubar = new SC_Menubar();
	private VerticalLayout vlLeft = new VerticalLayout();
	
	
	public MainpageView() {
	// TODO Auto-generated constructor stub

//		addComponent(headline);
		addComponent(menubar);
	
	}


	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}
