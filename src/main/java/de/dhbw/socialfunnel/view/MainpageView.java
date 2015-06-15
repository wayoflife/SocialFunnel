package de.dhbw.socialfunnel.view;

import javax.annotation.PostConstruct;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import de.dhbw.socialfunnel.view.component.SC_Menubar;

@SpringView(name = MainpageView.VIEW_NAME)
public class MainpageView extends VerticalLayout implements View{
	
	public final static String VIEW_NAME = "main";
	
	private VerticalLayout vlLeft = new VerticalLayout();
	private VerticalLayout vlRight = new VerticalLayout();
	private VerticalLayout vlCenter = new VerticalLayout();
	private HorizontalLayout vlPosts = new HorizontalLayout();
	private PostList postlist = new PostList();
	
	@PostConstruct
	void init() {
		addComponent(new SC_Menubar());
		
		addComponent(vlPosts);
		vlPosts.setSizeFull();
		vlPosts.addComponent(vlLeft);
		vlPosts.addComponent(vlCenter);
		vlCenter.setSizeFull();
		vlPosts.setExpandRatio(vlCenter, 1.0f);
		vlPosts.addComponent(vlRight);
		
		vlLeft.setWidth("200px");
//		vlCenter.setWidth("60%");
		vlRight.setWidth("200px");
		
		vlLeft.addComponent(new Label("Hier ist das linke Feld!"));
		vlCenter.addComponent(postlist);
		vlRight.addComponent(new Label("Hier ist das rechte Feld!"));
	}

	@Override
	public void enter(ViewChangeEvent event) {
		
	}
}
