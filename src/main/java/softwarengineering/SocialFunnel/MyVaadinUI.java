package softwarengineering.SocialFunnel;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.packtpub.vaadin.User;
import com.packtpub.vaadin.UserService;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.WrappedHttpSession;
import com.vaadin.server.WrappedSession;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * The Application's "main" class
 */
@SuppressWarnings("serial")
public class MyVaadinUI extends UI {

	private ApplicationContext context;

	@Override
	protected void init(VaadinRequest request) {
		UserService service = getUserService(request);
		User user = service.getUser();
		String name = user.getName();
		Label lblUserName = new Label("Hi " + name + " !");
		VerticalLayout layout = new VerticalLayout();
		layout.setMargin(true);
		setContent(layout);
		layout.addComponent(lblUserName);
	}

	private UserService getUserService(VaadinRequest request) {
		WrappedSession session = request.getWrappedSession();
		HttpSession httpSession = ((WrappedHttpSession) session)
				.getHttpSession();
		ServletContext servletContext = httpSession.getServletContext();
		context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(servletContext);
		return (UserService) context.getBean("userService");
	}

}
