package de.dhbw.socialfunnel.view.component;

import org.springframework.stereotype.Component;

import com.vaadin.ui.Button;

@Component
public class LogoutListener implements Button.ClickListener {
	
	@Override
	public void buttonClick(Button.ClickEvent clickEvent) {
//		SecurityContextHolder.clearContext();
//		for(Window w : UI.getCurrent().getWindows()) {UI.getCurrent().removeWindow(w);}
//		UI.getCurrent().close();
//		Navigator navigator = UI.getCurrent().getNavigator();
//		navigator.navigateTo("login");
	}
}