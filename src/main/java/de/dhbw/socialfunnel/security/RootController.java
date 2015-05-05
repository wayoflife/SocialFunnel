package de.dhbw.socialfunnel.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RootController {
	
	@Autowired
	Facebook facebook;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String redirectToUi() {
		System.out.println("controller erfolgreich gestartet");
		return "redirect:/ui";
	}
	
	@RequestMapping(value="/index.html", method=RequestMethod.GET)
	public String redirectToUiFromIndex() {
		System.out.println("controller erfolgreich gestartet von index.html");
		return "redirect:/ui";
	}
	
	@RequestMapping(value="/facebook", method=RequestMethod.GET)
	public String redirectFacebook() {
		if(facebook != null && facebook.isAuthorized()){
			System.out.println("facebook authorisiert");
			return "redirect:/ui";
		} else {
			return "/auth/facebook";
		}
	}
}
