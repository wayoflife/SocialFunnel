package de.dhbw.socialfunnel.view.component;

import java.io.FileNotFoundException;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.data.Property.ReadOnlyException;
import com.vaadin.data.validator.EmailValidator;
import com.vaadin.data.validator.RegexpValidator;
import com.vaadin.data.validator.StringLengthValidator;
import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.server.ExternalResource;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.AbstractTextField.TextChangeEventMode;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.DateField;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.Notification;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import de.dhbw.socialfunnel.dao.UserDaoImpl;
import de.dhbw.socialfunnel.model.User;
import de.dhbw.socialfunnel.todo.DBHelper;

@UIScope
@SpringComponent
public class RegisterForm extends VerticalLayout {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private UserDaoImpl userDao;
	
	private TextField txtFirstName;
	private TextField txtSecondName;
	private TextField txtEmail;
	private PasswordField txtPassword;
	private PasswordField txtPassword2;
	private DateField txtGeburtstag = new DateField("Geburtstag: ");
	private Button btnRegistrieren = new Button("Registrieren");
	private CheckBox chbAkzeptieren = new CheckBox("Ich akzeptiere die Nutzungsbedingungen");
	private Label lblRegistrieren = new Label("Registrieren");
	private Link lnkNutzungsbedingungen = new Link("Nutzungsbedingungen", new ExternalResource(""));

	public RegisterForm() {
		initButtons();
		initFields();
		
		lblRegistrieren.setStyleName("h1");
		
		addComponent(lblRegistrieren);
		addComponent(txtEmail);
		addComponent(txtFirstName);
		addComponent(txtSecondName);
		addComponent(txtEmail);
		addComponent(txtPassword);
		addComponent(txtPassword2);
		addComponent(txtGeburtstag);
		
		addComponent(lnkNutzungsbedingungen);
		addComponent(chbAkzeptieren);
		addComponent(btnRegistrieren);
		
		chbAkzeptieren.setId("checkbox");
		btnRegistrieren.setId("btnRegistrieren");
		txtGeburtstag.setId("txtGeburtstag");
	}

	private void initFields() {
		txtEmail = new TextField();
		txtEmail.setCaption("Email (dies wird ihr Login)");
		txtEmail.addValidator(new EmailValidator("Keine gültige Email"));
		txtEmail.addValidator(new StringLengthValidator("Not empty, max 40 characters", 2, 50, false));
		txtEmail.setMaxLength(40);
		txtEmail.setId("txtEmail");
		txtEmail.setTextChangeEventMode(TextChangeEventMode.LAZY);
		
		txtFirstName = new TextField();
		txtFirstName.setCaption("Vorname");
		txtFirstName.addValidator(new StringLengthValidator("Atleast 2, max 30 characters", 2, 30, false));
		txtFirstName.addValidator(new RegexpValidator("\\p{Alpha}*", "Nur Zeichen des Alphabets"));
		txtFirstName.setMaxLength(30);
		txtFirstName.setId("txtFirstName");
		txtFirstName.setTextChangeEventMode(TextChangeEventMode.LAZY);
		
		txtSecondName = new TextField();
		txtSecondName.setCaption("Nachname");
		txtSecondName.addValidator(new StringLengthValidator("Atleast 2, max 30 characters", 2, 30, false));
		txtSecondName.addValidator(new RegexpValidator("\\p{Alpha}*", "Nur Zeichen des Alphabets"));
		txtSecondName.setMaxLength(30);
		txtSecondName.setId("txtSecondName");
		txtSecondName.setTextChangeEventMode(TextChangeEventMode.LAZY);
		
		txtPassword = new PasswordField();
		txtPassword.setCaption("Passwort");
		txtPassword.addValidator(new StringLengthValidator("Passwortlänge zwischen 6 und 20 Zeichen",
				6, 20, false));
		txtPassword.setMaxLength(20);
		txtPassword.setId("txtPassword");
		txtPassword.setTextChangeEventMode(TextChangeEventMode.LAZY);
		
		txtPassword2 = new PasswordField();
		txtPassword2.setCaption("Passwort wiederholen");
		txtPassword2.setMaxLength(20);
		txtPassword2.setId("txtPassword2");
		txtPassword2.setTextChangeEventMode(TextChangeEventMode.LAZY);
	}

	private void initButtons() {
		btnRegistrieren = new Button("Register", new Button.ClickListener() {

			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				if(registerPossible()){
					try {
						User user = new User(txtFirstName.getValue()+txtSecondName.getValue(), 
											txtEmail.getValue(), 
											txtPassword.getValue(), 
											txtGeburtstag.getValue().toString());
						userDao.save(user);
					} catch (ReadOnlyException e) {
						e.printStackTrace();
					} catch (Exception e) {
						Notification.show("Cannot connect to Database! Try again later.",
								Notification.Type.WARNING_MESSAGE);
						e.printStackTrace();
					}
				}
			}
        });		
		btnRegistrieren.setClickShortcut(KeyCode.ENTER, null);
		btnRegistrieren.setId("btnregister");
	}

	protected boolean registerPossible() {
		if(!(txtEmail.isValid() && txtFirstName.isValid() && txtSecondName.isValid() && txtPassword.isValid())){
			Notification.show("One or more fields contain invalid values! Fix it!", Notification.Type.WARNING_MESSAGE);
			return false;
		}
		if(!txtPassword.getValue().equals(txtPassword2.getValue())){
			Notification.show("Passwords do not match!", Notification.Type.WARNING_MESSAGE);
			return false;
		}
		//auf existenz überprüfen
		
//		for(User u : userDao.getAll()){
//			if(txtEmail.getValue() == u.getEmail()) {
//				Notification.show("This email is already registered!", Notification.Type.WARNING_MESSAGE);
//				return false;
//			}
//		}
		
		return true;
	}
}
