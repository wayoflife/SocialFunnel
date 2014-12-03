package com.socialfunnel.ui.components;



import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

public class NetworkChangeForm extends VerticalLayout{
	
	private ComboBox cbbNetzwerke = new ComboBox("Netzwerk");
	private TextField txtLogin = new TextField("Login");
	private PasswordField pwdPasswort = new PasswordField("Passwort");
	private CheckBox chbAktiv = new CheckBox("Aktiv");
	private Button btnDelete = new Button("Netzwerk entfernen");
	private HorizontalLayout hl1 = new HorizontalLayout();
	private HorizontalLayout hl2 = new HorizontalLayout();
	
	
public NetworkChangeForm() {
	// TODO Auto-generated constructor stub

	hl1.addComponent(cbbNetzwerke);
	hl1.addComponent(txtLogin);
	hl1.addComponent(pwdPasswort);
	
	hl2.addComponent((Component) chbAktiv);
	hl2.addComponent(btnDelete);
	
	addComponent(hl1);
	addComponent(hl2);
	
	cbbNetzwerke.addItem("Facebook");
	cbbNetzwerke.addItem("Twitter");
	
	btnDelete.addClickListener(new ClickListener() {
		
		@Override
		public void buttonClick(ClickEvent event) {
			// TODO Auto-generated method stub
			removeComponent(btnDelete.getParent().getParent());
		}
	});
	

}
}
