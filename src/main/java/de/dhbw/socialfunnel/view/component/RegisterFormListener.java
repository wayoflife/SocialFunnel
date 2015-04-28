package de.dhbw.socialfunnel.view.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.socialfunnel.todo.AuthManager;
import com.vaadin.ui.Button;

@Component
public class RegisterFormListener implements Button.ClickListener {
	@Autowired
	private AuthManager authManager;
	
	@Override
	public void buttonClick(Button.ClickEvent event) {
		
	}
}
