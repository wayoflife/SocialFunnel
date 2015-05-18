package de.dhbw.socialfunnel.view;

import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import de.dhbw.socialfunnel.dao.UserDao;
import de.dhbw.socialfunnel.model.User;

@SpringView(name = DatabaseTest.VIEW_NAME)
public class DatabaseTest extends VerticalLayout implements View {
		
		public final static String VIEW_NAME = "dbtest";
		static final Logger logger = LogManager.getLogger(DatabaseTest.class.getName());
		
		@Autowired
		private UserDao userDao;
		
		@PostConstruct
	    void init() {
			setSizeFull();
			setMargin(true);
			setSpacing(true);
			
			List<User> a = userDao.getAll();
			
			for (int i = 0; i < a.size(); i++) {
				VerticalLayout temp = new VerticalLayout();
				addComponent(temp);
				
				temp.addComponent(new Label(a.get(i).getUserId()+""));
				temp.addComponent(new Label(a.get(i).getName()));
				temp.addComponent(new Label(a.get(i).getEmail()));
				temp.addComponent(new Label(a.get(i).getDateOfBirth()));
			}
		}

		@Override
		public void enter(ViewChangeEvent event) {
		}
}
