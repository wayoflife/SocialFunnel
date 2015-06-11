package de.dhbw.socialfunnel.view;

import javax.annotation.PostConstruct;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@UIScope
@SpringView(name = ErrorView.VIEW_NAME)
public class ErrorView extends VerticalLayout implements View {
	
	public static final String VIEW_NAME = "error";
	
	@PostConstruct
	void init() {
		setSizeFull();
		setMargin(true);
		setSpacing(true);
		
		addComponent(new Label("Error"));
	}

	@Override
	public void enter(ViewChangeEvent event) {

	}

}
