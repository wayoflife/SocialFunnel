package com.socialfunnel.ui;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.vaadin.navigator.Navigator;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;

@Component
public class LogoutListener implements Button.ClickListener {
	
	@Override
	public void buttonClick(Button.ClickEvent clickEvent) {
		SecurityContextHolder.clearContext();
		for(Window w : UI.getCurrent().getWindows()) {UI.getCurrent().removeWindow(w);}
		UI.getCurrent().close();
		Navigator navigator = UI.getCurrent().getNavigator();
		navigator.navigateTo("login");
	}
}