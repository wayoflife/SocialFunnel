package de.dhbw.socialfunnel.view.component;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.ui.Button;

@SpringComponent
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