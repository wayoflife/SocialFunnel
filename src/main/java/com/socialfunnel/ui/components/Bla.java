package com.socialfunnel.ui.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.facebook.api.Facebook;

public class Bla {
	
	@Autowired
	Facebook facebook;
	
	
	public void testFacebook() {
		facebook.isAuthorized();
		
		//weiterleitung auf facebook
		
		facebook.feedOperations().getFeed();
	}

}
