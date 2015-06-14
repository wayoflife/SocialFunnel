package de.dhbw.socialfunnel.view;

import javax.annotation.PostConstruct;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

import de.dhbw.socialfunnel.view.component.ConnectionInfo;
import de.dhbw.socialfunnel.view.component.FormSender;

@UIScope
@SpringView(name = SocialView.VIEW_NAME)
public class SocialView extends CustomComponent implements ClickListener, View  {

	public final static String VIEW_NAME = "social";
	
	private VerticalLayout content;
	
	private Label caption;
	
	private ConnectionInfo facebookConnectionInfo;
	private ConnectionInfo googleConnectionInfo;
	
	private FormSender formSender;
	
	@PostConstruct
	public void init() {	
		setSizeFull();
						
		content = new VerticalLayout();
		content.setSpacing(true);
		content.setMargin(true);
		setCompositionRoot(content);
		content.setDefaultComponentAlignment(Alignment.TOP_CENTER);
								
		caption = new Label("My social networks connections", ContentMode.HTML);
		caption.addStyleName(ValoTheme.LABEL_H1);
		caption.addStyleName(ValoTheme.LABEL_NO_MARGIN);
		caption.setSizeUndefined();
		content.addComponent(caption);
		
		facebookConnectionInfo = new ConnectionInfo("Facebook");
//		facebookConnectionInfo.addConnectionInfoEventListener(this);
		
		googleConnectionInfo = new ConnectionInfo("Google");
//		googleConnectionInfo.addConnectionInfoEventListener(this);
		content.addComponents(facebookConnectionInfo, googleConnectionInfo);
		
		formSender = new FormSender();
		content.addComponent(formSender);
								
	}
	
	
	public void setConnectionInfo(String providerName, boolean connected,
			String displayName, String profileUrl, String profileImageUrl) {
		
		if (providerName.equals("Facebook")) {
			facebookConnectionInfo.setConnected(connected);
			facebookConnectionInfo.setDisplayName(displayName);
			facebookConnectionInfo.setProfileUrl(profileUrl);
			facebookConnectionInfo.setProfileImageUrl(profileImageUrl);
			facebookConnectionInfo.update();
		} else {
			googleConnectionInfo.setConnected(connected);
			googleConnectionInfo.setDisplayName(displayName);
			googleConnectionInfo.setProfileUrl(profileUrl);
			googleConnectionInfo.setProfileImageUrl(profileImageUrl);
			googleConnectionInfo.update();
		}
	}

	public FormSender getFormSender() {	
		return formSender;
	}
	
	@Override
	public void buttonClick(ClickEvent event) {
				
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
	}

}
