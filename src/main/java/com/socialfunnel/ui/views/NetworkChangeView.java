package com.socialfunnel.ui.views;

import com.socialfunnel.ui.components.Headline;
import com.socialfunnel.ui.components.NetworkChangeForm;
import com.socialfunnel.ui.components.SC_Menubar;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

public class NetworkChangeView extends VerticalLayout implements View {

	private Headline headline = new Headline();
	private SC_Menubar menubar = new SC_Menubar();
	private Button btnNewNetwork = new Button("+ neues Netzwerk");

	public NetworkChangeView() {
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
		btnNewNetwork.setId("NeuesNetzwerk");
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub

	}
}
