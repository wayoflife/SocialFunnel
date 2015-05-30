package de.dhbw.socialfunnel.view.component;

import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class Logo extends VerticalLayout implements LogoApi{
	private static final long serialVersionUID = 1L;
	private Label lblWerbespruch;
	private Image imgLogo;
	
	public Logo(){
		this.setSpacing(true);
		this.setMargin(true);
		lblWerbespruch = new Label("Mit Social Funnel hast du die Möglichkeit, <br>"
				+ "auf mehrere Soziale Netzwerke gleichzeitig <br>"
				+ "zuzugreifen und deinen Freunden Neuigkeiten <br>"
				+ "mitzuteilen", ContentMode.HTML);
		imgLogo = new LogoImage();
		imgLogo.setWidth("300px");
		imgLogo.setHeight("300px");
		this.addComponent(imgLogo);
		this.addComponent(lblWerbespruch);
	}
	
	@Override
	public void setHeight(String height) {
		if(imgLogo==null)imgLogo = new LogoImage();
		imgLogo.setHeight(height);
	}
	
	@Override
	public void setId(String id) {
		if(imgLogo==null)imgLogo = new LogoImage();
		imgLogo.setId(id);
	}
	
	@Override
	public void setWidth(String width) {
		if(imgLogo==null)imgLogo = new LogoImage();
		imgLogo.setWidth(width);
	}
}
