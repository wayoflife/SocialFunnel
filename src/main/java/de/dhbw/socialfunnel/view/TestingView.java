package de.dhbw.socialfunnel.view;

import javax.annotation.PostConstruct;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@SpringView(name = TestingView.VIEW_NAME)
public class TestingView extends VerticalLayout implements View {

	public final static String VIEW_NAME = "testing";
	
	@PostConstruct
	void init() {
		setSizeFull();
		setMargin(true);
		setSpacing(true);
		
		addComponent(new Label("Access Denid"));
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub

	}

}
