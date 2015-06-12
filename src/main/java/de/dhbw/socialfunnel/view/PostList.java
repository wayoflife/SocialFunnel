package de.dhbw.socialfunnel.view;

import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class PostList extends VerticalLayout {
	
	public PostList() {
		// TODO Auto-generated constructor stub
		String content= "Hey Leute, heute Party im Ago. Drinks und Bier für nur <b>1 Euro</b> . Alle Mädels kriegen bis 12 kostenlosen Eintitt! Wer hat Bock?";
		
		for (int i = 0; i < 5; i++) {
			Label post = new Label(content, ContentMode.HTML);
			this.addStyleName(" background-color: #98FB98");
			post.setWidth("50%");
			addComponent(post);
		}
		
	}
}
