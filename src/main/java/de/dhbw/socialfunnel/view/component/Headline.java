package de.dhbw.socialfunnel.view.component;

import java.io.File;

import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class Headline extends HorizontalLayout {
	
	private Button btnStartseite = new Button("Startseite");
	private Button btnNeuerPost = new Button("Neuer Post");
	private Button btnNetzwerke = new Button("Meine Netzwerke");
	private Button btnEinstellungen = new Button("Einstellungen");
	private Button btnHilfe = new Button("Hilfe");
	private Button btnAbmelden = new Button("Abmelden");
	private Image imgLogo = new Image();
	private Label lblName = new Label("Social Funnel");
	private VerticalLayout vl = new VerticalLayout();
	private HorizontalLayout hl1 = new HorizontalLayout();
	private HorizontalLayout hl2 = new HorizontalLayout();
	
	public Headline() {
	
		lblName.setStyleName("h1");
		hl1.addComponent(btnStartseite);
		hl1.addComponent(btnNeuerPost);
		hl1.addComponent(btnNetzwerke);
		hl1.addComponent(btnEinstellungen);
		hl1.addComponent(btnHilfe);
		hl1.addComponent(btnAbmelden);
		
		String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();
		imgLogo = new Image("", new FileResource(new File(basepath + "/WEB-INF/images/logo.png")));
		imgLogo.setWidth("100px");
		imgLogo.setHeight("100px");
		
		hl2.addComponent(imgLogo);
		hl2.addComponent(lblName);
		
		vl.addComponent(hl1);
		vl.addComponent(hl2);
		
		addComponent(vl);
		
		//TODO die clicklistener implementieren
//		btnStartseite.addClickListener(null);
//		btnNetzwerke.addClickListener(null);
//		btnNeuerPost.addClickListener(null);
//		btnAbmelden.addClickListener(null);
	}
}
