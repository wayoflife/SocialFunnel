package de.dhbw.socialfunnel.view;

import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class PostList extends VerticalLayout {
	
	public PostList() {
		
		this.setSizeFull();
		setMargin(false);
		setSpacing(false);
		// TODO Auto-generated constructor stub
		String[] content= {"Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam .",
				"nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam ",
				"erat, sed diam voluptua. At vero eos et accusam et justo duo ",
				"dolores et ea rebum. Stet clita kasd gubergren, no sea takimata ",
				"sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet"};
		
		for (String s : content) {
			Label post = new Label(s, ContentMode.HTML);
			this.addStyleName(" background-color: #98FB98");
			post.setWidth("50%");
			addComponent(post);
		}
		
	}
}
