package de.dhbw.socialfunnel.view.component;

import java.io.File;

import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.Image;

public class LogoImage extends Image implements LogoApi{

	public LogoImage() {		
		//empty image
	}
	
	@Override
	public void display() {
		if(this.getSource() == null){
			if(null != VaadinService.getCurrent()){
				this.setSource(new FileResource(new File(
						VaadinService.getCurrent()
						.getBaseDirectory()
						.getAbsolutePath() 
						+ "/WEB-INF/images/logo.png")));
			} else {
				this.setSource(new FileResource(new File(
						"/src/main/webapp/WEB-INF/images/logo.png")));
			}
			System.out.println("Bild geladen");
			
			this.setWidth("300px");
			this.setHeight("300px");
		}
	}
	
	@Override
	public void setHeight(String height) {
		super.setHeight(height);
	}
	
	@Override
	public void setId(String id) {
		super.setId(id);
	}
	
	@Override
	public void setWidth(String width) {
		super.setWidth(width);
	}
}
