package com.socialfunnel.ui.components;

import java.io.File;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class Logo extends VerticalLayout implements View {
	private static final long serialVersionUID = 1L;
	private Label lblWerbespruch = new Label("Mit Social Funnel hast du die Möglichkeit deine Freunde zu stalken");
	private Image imgLogo;
	
	public Logo() {
		String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();
		imgLogo = new Image("", new FileResource(new File(basepath + "/WEB-INF/images/logo.png")));
		imgLogo.setWidth("300px");
		imgLogo.setHeight("300px");
		
		this.addComponent(imgLogo);
		this.addComponent(lblWerbespruch);
	}

	@Override
	public void enter(ViewChangeEvent event) {

	}
}
