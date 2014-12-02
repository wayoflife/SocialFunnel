package com.socialfunnel.vaadin;

import com.google.gwt.user.client.ui.Image;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.VerticalLayout;

public class NewPostView extends VerticalLayout implements View{
	
	private Headline headline = new Headline();
	private TextArea ttaNachricht = new TextArea("Post Verfassen");
	private Button btnSichtbarkeit = new Button("Sichtbarkeit einstellen");
	private Button btnDateiAnhang = new Button("Datei hinzufügen");
	private Button btnPosten = new Button("Post veröffentlichen");
	private CheckBox chbFacebook = new CheckBox("Mein Facebook");
	private CheckBox chbTwitter = new CheckBox("Mein Twitter");
	private CheckBox chbGoogle = new CheckBox("Mein Google+");
	private CheckBox chbWordpress = new CheckBox("Mein Wordpress");
	private CheckBox chbInstagramm = new CheckBox("Mein Instagramm");
	private CheckBox chbStudivz = new CheckBox("Mein StudiVZ");
	private HorizontalLayout hl1 = new HorizontalLayout();
	private HorizontalLayout hl2 = new HorizontalLayout();
	private HorizontalLayout hl3 = new HorizontalLayout();
	private VerticalLayout vlChb = new VerticalLayout();
	
	public NewPostView() {
		// TODO Auto-generated constructor stub
		addComponent(headline);
		hl2.addComponent(ttaNachricht);
		vlChb.addComponent(chbFacebook);
		vlChb.addComponent(chbTwitter);
		vlChb.addComponent(chbGoogle);
		vlChb.addComponent(chbWordpress);
		vlChb.addComponent(chbInstagramm);
		vlChb.addComponent(chbStudivz);
		hl2.addComponent(vlChb);
		hl3.addComponent(btnSichtbarkeit);
		hl3.addComponent(btnDateiAnhang);
		hl3.addComponent(btnPosten);
		addComponent(hl1);
		addComponent(hl2);
		addComponent(hl3);
		
		
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}

}
