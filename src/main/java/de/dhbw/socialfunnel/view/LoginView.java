package de.dhbw.socialfunnel.view;

import javax.annotation.PostConstruct;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import de.dhbw.socialfunnel.view.component.LoginForm;
import de.dhbw.socialfunnel.view.component.Logo;

@SpringView(name = LoginView.VIEW_NAME)
public class LoginView extends HorizontalLayout implements View {
	
	public final static String VIEW_NAME = "";
	
	private Button btnRegister = new Button("Registrieren");
	private Label lblKeinAccount = new Label("Noch keinen Account?");
	
	private VerticalLayout vl_left = new VerticalLayout();
	private VerticalLayout vl_right = new VerticalLayout();
	
	@PostConstruct
	void init() {
		setSizeFull();
		setMargin(true);
		setSpacing(true);
		
		vl_left.setWidth("50%");
		addComponent(vl_left);
		addComponent(vl_right);
		
		btnRegister.addClickListener(new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("register");
			}
		});
		btnRegister.setId("btnRegistrieren");
		
		vl_left.addComponent(new LoginForm());
		vl_left.addComponent(lblKeinAccount);
		vl_left.addComponent(btnRegister);
		vl_right.addComponent(new Logo());
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		//
	}
};