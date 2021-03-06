package de.dhbw.socialfunnel.view;

import java.util.Collection;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import de.dhbw.socialfunnel.view.component.LogoutListener;
import de.dhbw.socialfunnel.view.component.SC_Menubar;

@SpringView(name = UserView.VIEW_NAME)
public class UserView extends VerticalLayout implements View {
	
	public final static String VIEW_NAME = "user";
	
	private SC_Menubar menubar = new SC_Menubar();
	
	public void enter(ViewChangeListener.ViewChangeEvent event) {
		removeAllComponents();
		addComponent(menubar);
		SecurityContext context = SecurityContextHolder.getContext();
		Authentication authentication = context.getAuthentication();
		if (authentication != null && authentication.isAuthenticated()) {
			String name = authentication.getName();
			Label labelLogin = new Label("Username: " + name);
			addComponent(labelLogin);
			Collection<? extends GrantedAuthority> authorities = authentication
					.getAuthorities();
			for (GrantedAuthority ga : authorities) {
				String authority = ga.getAuthority();
				if ("ADMIN".equals(authority)) {
					Label lblAuthority = new Label(
							"You are  the administrator. ");
					addComponent(lblAuthority);
				} else {
					Label lblAuthority = new Label(
							"Granted         Authority: " + authority);
					addComponent(lblAuthority);
				}
			}
			Button logout = new Button("Logout");
			LogoutListener logoutListener = new LogoutListener();
			logout.addClickListener(logoutListener);
			addComponent(logout);
		} else {
			Navigator navigator = UI.getCurrent().getNavigator();
			navigator.navigateTo("login");
		}
	}
}