package com.socialfunnel.ui.views;

import java.io.File;

import org.springframework.ui.context.support.UiApplicationContextUtils;

import com.socialfunnel.ui.components.LoginForm;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

public class LoginView extends HorizontalLayout implements View {
	
	private Button btnRegister = new Button("Registrieren");
	private Label lblKeinAccount = new Label("Noch keinen Account?");
	private Label lblWerbespruch = new Label("Mit Social Funnel hast du die Möglichkeit deine Freunde zu stalken");
	private Image imgLogo;
	
	private HorizontalLayout layout = new HorizontalLayout();
	private VerticalLayout vl_left = new VerticalLayout();
	private VerticalLayout vl_right = new VerticalLayout();
	
	public LoginView() {
		setSizeFull();
		setMargin(true);
		setSpacing(true);
		
		addComponent(vl_left);
		addComponent(vl_right);
		
		btnRegister.addClickListener(new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				UI.getCurrent().getNavigator().navigateTo("register");
			}
		});
		
		String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();
		imgLogo = new Image("", new FileResource(new File(basepath + "/WEB-INF/images/logo.png")));
		imgLogo.setWidth("300px");
		imgLogo.setHeight("300px");
		LoginForm loginForm = new LoginForm();
		vl_left.addComponent(loginForm);
		vl_left.addComponent(lblKeinAccount);
		vl_left.addComponent(btnRegister);
		vl_right.addComponent(imgLogo);
		vl_right.addComponent(lblWerbespruch);
	}

	@Override
	public void enter(ViewChangeListener.ViewChangeEvent event) {
	}
};