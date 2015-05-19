package de.dhbw.socialfunnel.view.component;

import java.io.File;

import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Image;

public class LogoImage extends Image implements LogoApi{

	public LogoImage() {		
		super("", 
			new FileResource(new File(
				VaadinService.getCurrent()
								 .getBaseDirectory()
								 .getAbsolutePath() 
								 + "/WEB-INF/images/logo.png")));
	}
}
