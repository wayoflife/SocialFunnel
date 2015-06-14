package de.dhbw.socialfunnel.view.component;

import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class Logo extends VerticalLayout implements LogoApi{
	private static final long serialVersionUID = 1L;
	private Label lblWerbespruch;
	private LogoImage imgLogo;
	
	public Logo(){
		this.setSpacing(true);
		this.setMargin(true);
		lblWerbespruch = new Label("Mit Social Funnel hast du die Möglichkeit, <br>"
				+ "auf mehrere Soziale Netzwerke gleichzeitig <br>"
				+ "zuzugreifen und deinen Freunden Neuigkeiten <br>"
				+ "mitzuteilen", ContentMode.HTML);
		this.addComponent(imgLogo);
		this.addComponent(lblWerbespruch);
		
	}
	
	@Override
	public void display() {
		System.out.println("Bild angefordert");
		if(imgLogo==null)imgLogo = new LogoImage();
		imgLogo.display();
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
	public void setWidth(String width){
		if(imgLogo==null)imgLogo = new LogoImage();
		imgLogo.setWidth(width);
	}
}
