package de.dhbw.socialfunnel.view.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vaadin.ui.Button;

import de.dhbw.socialfunnel.todo.AuthManager;

@Component
public class RegisterFormListener implements Button.ClickListener {
	@Autowired
	private AuthManager authManager;
	
	@Override
	public void buttonClick(Button.ClickEvent event) {
		
	}
}
