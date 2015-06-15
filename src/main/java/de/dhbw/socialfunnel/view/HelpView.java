package de.dhbw.socialfunnel.view;

import java.io.File;

import javax.annotation.PostConstruct;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import de.dhbw.socialfunnel.view.component.SC_Menubar;

@SpringView(name = HelpView.VIEW_NAME)
public class HelpView extends VerticalLayout implements View{
	
	public final static String VIEW_NAME = "help";
	
	@PostConstruct
	void init() {
		addComponent(new SC_Menubar());
		addComponent(new Label("helpview"));
		File file = new File("~");
		addComponent(new Label(file.getAbsolutePath()));
	}

	@Override
	public void enter(ViewChangeEvent event) {
		
	}
}
