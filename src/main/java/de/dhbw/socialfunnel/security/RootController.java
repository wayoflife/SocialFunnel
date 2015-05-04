package de.dhbw.socialfunnel.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RootController {
	
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
}
