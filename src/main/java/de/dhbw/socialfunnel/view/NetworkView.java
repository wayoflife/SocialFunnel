package de.dhbw.socialfunnel.view;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.facebook.api.Facebook;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.Page;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@SpringView(name = NetworkView.VIEW_NAME)
public class NetworkView extends VerticalLayout implements View {

	public final static String VIEW_NAME = "netzuebersicht";
	
	@Autowired
	private Facebook facebook;
	
	@PostConstruct
	void init(){
		addComponent(new Label("hier sollte facebook verbunden werden, und das niemals angezeigt werden"));
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		if(facebook.isAuthorized()){
			addComponent(new Label(facebook.userOperations().getUserProfile().getFirstName()));
		} else {
			Page.getCurrent().setLocation("/auth/facebook");
		}
	}
}
