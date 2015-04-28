package de.dhbw.socialfunnel.view;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;

import de.dhbw.socialfunnel.view.component.Logo;
import de.dhbw.socialfunnel.view.component.RegisterForm;

public class RegisterView extends HorizontalLayout implements View {
	
	private VerticalLayout vl_left = new VerticalLayout();
	private VerticalLayout vl_right = new VerticalLayout();
	
    public RegisterView() {
    	super();
		
		setSizeFull();
		setMargin(true);
		setSpacing(true);
		
		
		addComponent(vl_left);
		addComponent(vl_right);
		
		vl_left.addComponent(new RegisterForm());
		vl_right.addComponent(new Logo());
	}

	@Override
	public void enter(ViewChangeEvent event) {
	}
}
