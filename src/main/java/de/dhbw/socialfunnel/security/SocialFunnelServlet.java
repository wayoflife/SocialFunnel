package de.dhbw.socialfunnel.security;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import org.jsoup.nodes.Element;

import com.vaadin.server.BootstrapFragmentResponse;
import com.vaadin.server.BootstrapListener;
import com.vaadin.server.BootstrapPageResponse;
import com.vaadin.server.ServiceException;
import com.vaadin.server.SessionInitEvent;
import com.vaadin.server.SessionInitListener;
import com.vaadin.spring.server.SpringVaadinServlet;

@WebServlet(urlPatterns = {"/ui/*", "/VAADIN/*"}, asyncSupported = true)
public class SocialFunnelServlet extends SpringVaadinServlet {
	
	@Override
	protected void servletInitialized() throws ServletException {	
		super.servletInitialized();
		getService().addSessionInitListener(new SessionInitListener() {
			
			@Override
			public void sessionInit(SessionInitEvent event) throws ServiceException {
				
				event.getSession().addBootstrapListener(new BootstrapListener() {
					
					@Override
					public void modifyBootstrapPage(BootstrapPageResponse response) {
						response.getDocument().body().attr("lang", "sr");
						response.getDocument().head().prependElement("meta").attr("name", "viewport").attr("content", "width=device-width, initial-scale=1");	
						
						Element head = response.getDocument().getElementsByTag("head").get(0);

						Element jquery = response.getDocument().createElement("script");						
						jquery.attr("src", "https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js");
						head.appendChild(jquery);
						
						Element formSender = response.getDocument().createElement("script");
						formSender.attr("src", "/VAADIN/form_sender.js");
						head.appendChild(formSender);
					}

					@Override
					public void modifyBootstrapFragment(
							BootstrapFragmentResponse response) {
						
					}
				});
				
			}
		});
	}
}
