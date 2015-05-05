package de.dhbw.socialfunnel.security;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

import de.dhbw.socialfunnel.view.DatabaseTest;
import de.dhbw.socialfunnel.view.ErrorView;
import de.dhbw.socialfunnel.view.LoginView;
import de.dhbw.socialfunnel.view.MainpageView;
import de.dhbw.socialfunnel.view.NetworkView;
import de.dhbw.socialfunnel.view.RegisterView;
import de.dhbw.socialfunnel.view.UserView;

@PreserveOnRefresh
@SpringUI
public class SocialFunnelUI extends UI {
	
	@Autowired
	private SpringViewProvider viewProvider;
	
    @Override
    protected void init(VaadinRequest request) {
        
        final VerticalLayout root = new VerticalLayout();
        root.setSizeFull();
        root.setMargin(true);
        root.setSpacing(true);
        setContent(root);
        
        final CssLayout navigationBar = new CssLayout();
        navigationBar.addStyleName(ValoTheme.LAYOUT_COMPONENT_GROUP);
        navigationBar.addComponent(createNavigationButton("View Login", LoginView.VIEW_NAME));
        navigationBar.addComponent(createNavigationButton("View Register", RegisterView.VIEW_NAME));
        navigationBar.addComponent(createNavigationButton("View Main", MainpageView.VIEW_NAME));
        navigationBar.addComponent(createNavigationButton("View User", UserView.VIEW_NAME));
        navigationBar.addComponent(createNavigationButton("View error", ErrorView.VIEW_NAME));
        navigationBar.addComponent(createNavigationButton("View facebook", NetworkView.VIEW_NAME));
        navigationBar.addComponent(createNavigationButton("database test", DatabaseTest.VIEW_NAME));
        root.addComponent(navigationBar);
        
        final Panel viewContainer = new Panel();
        viewContainer.setSizeFull();
        root.addComponent(viewContainer);
        root.setExpandRatio(viewContainer, 1.0f);
        
        Navigator navigator = new Navigator(this, viewContainer);
        navigator.addProvider(viewProvider);
//        viewProvider.setAccessDeniedViewClass(AccessDeniedView.class);
        navigator.setErrorView(ErrorView.class);
    }
    
    private Button createNavigationButton(String caption, final String viewName) {
        Button button = new Button(caption);
        button.addStyleName(ValoTheme.BUTTON_SMALL);
        button.addClickListener(new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				getUI().getNavigator().navigateTo(viewName);
				
			}
		});
        return button;
    }
}