package de.dhbw.socialfunnel.view;

import javax.annotation.PostConstruct;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.VerticalLayout;

import de.dhbw.socialfunnel.view.component.Headline;
import de.dhbw.socialfunnel.view.component.NetworkChangeForm;
import de.dhbw.socialfunnel.view.component.SC_Menubar;

@SpringView(name = NetworkChangeView.VIEW_NAME)
public class NetworkChangeView extends VerticalLayout implements View {

	public final static String VIEW_NAME = "netze";
	
	private Headline headline = new Headline();
	private SC_Menubar menubar = new SC_Menubar();
	private Button btnNewNetwork = new Button("+ neues Netzwerk");

	@PostConstruct
	void init() {
		// addComponent(headline);
		addComponent(menubar);
		addComponent(btnNewNetwork);

		btnNewNetwork.addClickListener(new ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				final NetworkChangeForm ncf = new NetworkChangeForm();
				addComponent(ncf);
				final Button remove = new Button("Netzwerk entfernen");
				remove.addClickListener(new Button.ClickListener() {

					@Override
					public void buttonClick(ClickEvent event) {
						NetworkChangeView.this.removeComponent(ncf);
						NetworkChangeView.this.removeComponent(remove);
					}
				});
				addComponent(remove);
			}
		});
		btnNewNetwork.setId("btnNeuesNetzwerk");
	}

	@Override
	public void enter(ViewChangeEvent event) {

	}
}
