package de.dhbw.socialfunnel.view;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;

import de.dhbw.socialfunnel.view.component.Logo;
import de.dhbw.socialfunnel.view.component.RegisterForm;

@UIScope
@SpringView(name = RegisterView.VIEW_NAME)
public class RegisterView extends HorizontalLayout implements View {
	
	public final static String VIEW_NAME = "register";
	
	private VerticalLayout vl_left = new VerticalLayout();
	private VerticalLayout vl_right = new VerticalLayout();

	@Autowired
	private RegisterForm registerForm;

	private Logo logo;
	
	@PostConstruct
    void init() {
		setSizeFull();
		setMargin(true);
		setSpacing(true);
		
		addComponent(vl_left);
		addComponent(vl_right);
		
		vl_left.addComponent(registerForm);
		logo = new Logo();
		vl_right.addComponent(logo);
	}

	@Override
	public void enter(ViewChangeEvent event) {
	}
}
