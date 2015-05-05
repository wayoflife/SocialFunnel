package de.dhbw.socialfunnel.security;

import javax.servlet.annotation.WebServlet;

import com.vaadin.spring.server.SpringVaadinServlet;

@WebServlet(urlPatterns = {"/ui/*", "/VAADIN/*"}, asyncSupported = true)
public class SocialFunnelServlet extends SpringVaadinServlet {
	
}
