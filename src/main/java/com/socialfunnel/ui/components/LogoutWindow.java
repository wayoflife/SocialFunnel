package com.socialfunnel.ui.components;

import com.socialfunnel.ui.LogoutListener;
import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.themes.Reindeer;

public class LogoutWindow extends Window {

	private GridLayout layout = null;
	private Button cancel = null;
	private Button logout = null;
	
	public LogoutWindow() {
		this.setModal(true);
		this.setResizable(false);
		this.setStyleName(Reindeer.WINDOW_BLACK);
		
		layout = new GridLayout(2, 1);
		layout.setSizeFull();
		this.setContent(layout);
		
		init();
		
		layout.addComponent(cancel, 1, 0);
		layout.addComponent(logout, 0, 0);
		
		layout.setComponentAlignment(cancel, Alignment.MIDDLE_CENTER);
		layout.setComponentAlignment(logout, Alignment.MIDDLE_CENTER);
		
		this.setWidth("200px");
		this.setHeight("100px");
	}

	private void init() {
		cancel = new Button("cancel", new Button.ClickListener() {
			private static final long serialVersionUID = -5326625991944420831L;

			@Override
			public void buttonClick(ClickEvent event) {
				getUI().removeWindow(LogoutWindow.this);
			}
		});
		cancel.setClickShortcut(KeyCode.ESCAPE, null);
		
		logout = new Button("logout", new LogoutListener());
		logout.setClickShortcut(KeyCode.ENTER, null);
	}
}
