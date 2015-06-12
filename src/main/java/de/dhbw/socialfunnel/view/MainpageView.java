package de.dhbw.socialfunnel.view;

import java.io.File;

import javax.annotation.PostConstruct;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import de.dhbw.socialfunnel.view.component.Headline;
import de.dhbw.socialfunnel.view.component.SC_Menubar;

@SpringView(name = MainpageView.VIEW_NAME)
public class MainpageView extends VerticalLayout implements View{
	
	public final static String VIEW_NAME = "main";
	
	private Headline headline = new Headline();
	private SC_Menubar menubar = new SC_Menubar();
	private VerticalLayout vlLeft = new VerticalLayout();
	private VerticalLayout vlRight = new VerticalLayout();
	private VerticalLayout vlCenter = new VerticalLayout();
	private PostList postlist = new PostList();
	
	@PostConstruct
	void init() {
//		addComponent(headline);
		addComponent(menubar);
		File file = new File("~");
		addComponent(new Label(file.getAbsolutePath()));
		addComponent(postlist);
		
		
	}

	@Override
	public void enter(ViewChangeEvent event) {
		
	}
}
