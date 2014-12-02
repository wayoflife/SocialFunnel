package com.socialfunnel.vaadin;

import java.io.File;

import com.socialfunnel.ui.components.RegisterForm;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class RegisterView extends HorizontalLayout implements View {
	private Label lblWerbespruch = new Label("Mit Social Funnel hast du die Möglichkeit...");
	private Image imgLogo;
	
	private VerticalLayout vl_left = new VerticalLayout();
	private VerticalLayout vl_right = new VerticalLayout();
	
	public RegisterView() {
		setSizeFull();
		setMargin(true);
		setSpacing(true);
		
		addComponent(vl_left);
		addComponent(vl_right);
		
		String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();
		imgLogo = new Image("", new FileResource(new File(basepath + "/WEB-INF/images/logo.png")));
		imgLogo.setWidth("300px");
		imgLogo.setHeight("300px");
		RegisterForm RegisterForm = new RegisterForm();
		vl_left.addComponent(RegisterForm);
		vl_right.addComponent(imgLogo);
		vl_right.addComponent(lblWerbespruch);
	}

	@Override
	public void enter(ViewChangeListener.ViewChangeEvent event) {
	}
};