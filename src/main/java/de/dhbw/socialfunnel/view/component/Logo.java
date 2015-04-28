package de.dhbw.socialfunnel.view.component;

import java.io.File;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.VerticalLayout;

public class Logo extends VerticalLayout implements View {
	private static final long serialVersionUID = 1L;
	private Label lblWerbespruch;
	private Image imgLogo;
	
	public Logo() {
		this.setSpacing(true);
		this.setMargin(true);
		lblWerbespruch = new Label("Mit Social Funnel hast du die Möglichkeit, <br>"
				+ "auf mehrere Soziale Netzwerke gleichzeitig <br>"
				+ "zuzugreifen und deinen Freunden Neuigkeiten <br>"
				+ "mitzuteilen", ContentMode.HTML);
		String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();
		imgLogo = new Image("", new FileResource(new File(basepath + "/WEB-INF/images/logo.png")));
		imgLogo.setWidth("300px");
		imgLogo.setHeight("300px");
		
		this.addComponent(imgLogo);
		this.addComponent(lblWerbespruch);
	}

	@Override
	public void enter(ViewChangeEvent event) {

	}
}
