package de.dhbw.socialfunnel.security;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI
public class SocialFunnelUI extends UI {
	
	@Autowired
	private HelloBean hello;
	
	@Autowired
	private SpringViewProvider viewProvider;

    @Override
    protected void init(VaadinRequest request) {
        
        final VerticalLayout root = new VerticalLayout();
        root.setSizeFull();
        root.setMargin(true);
        root.setSpacing(true);
        setContent(root);
        
        Button button = new Button("Click Me");
        button.addClickListener(new Button.ClickListener() {
        	public void buttonClick(ClickEvent event) {
        		root.addComponent(new Label(hello.getMessage()));
        	}
        });
        root.addComponent(button);

        final Panel viewContainer = new Panel();
        viewContainer.setSizeFull();
        root.addComponent(viewContainer);
        root.setExpandRatio(viewContainer, 1.0f);
        
        Navigator navigator = new Navigator(this, viewContainer);
        navigator.addProvider(viewProvider);
    }
}