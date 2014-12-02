package softwarengineering.SocialFunnel;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.socialfunnel.ui.views.LoginView;
import com.socialfunnel.ui.views.MainpageView;
import com.socialfunnel.ui.views.NetworkChangeView;
import com.socialfunnel.ui.views.NewPostView;
import com.socialfunnel.ui.views.RegisterView;
import com.socialfunnel.ui.views.UserView;
import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.WrappedHttpSession;
import com.vaadin.server.WrappedSession;
import com.vaadin.ui.UI;

@PreserveOnRefresh
@Theme("mytheme")
public class MyVaadinUI extends UI {
	private ApplicationContext applicationContext;

	@Override
	protected void init(VaadinRequest request) {
		WrappedSession session = request.getWrappedSession();
		HttpSession httpSession = ((WrappedHttpSession) session).getHttpSession();
		ServletContext servletContext = httpSession.getServletContext();
		applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);
		Navigator navigator = new Navigator(this, this);
		navigator.addView("", LoginView.class);
		navigator.addView("login", LoginView.class);
		navigator.addView("register", RegisterView.class);
		navigator.addView("user", UserView.class);
		navigator.addView("mainpage", MainpageView.class);
		navigator.addView("newpost", NewPostView.class);
		navigator.addView("mynetworks", NetworkChangeView.class);
		navigator.navigateTo("login");
		setNavigator(navigator);
	}

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}
}
