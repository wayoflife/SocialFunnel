package de.dhbw.socialfunnel.view;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Button;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.VerticalLayout;

import de.dhbw.socialfunnel.view.component.Headline;
import de.dhbw.socialfunnel.view.component.SC_Menubar;

@SpringView(name = NewPostView.VIEW_NAME)
public class NewPostView extends VerticalLayout implements View{
	
	public final static String VIEW_NAME = "post";
	
	private Headline headline = new Headline();
	private SC_Menubar menubar = new SC_Menubar();
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
		setSizeFull();
//		addComponent(headline);
		addComponent(menubar);
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
