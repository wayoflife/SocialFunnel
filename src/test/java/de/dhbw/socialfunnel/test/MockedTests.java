package de.dhbw.socialfunnel.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import de.dhbw.socialfunnel.dao.NetworksDaoImpl;
import de.dhbw.socialfunnel.dao.UserDaoImpl;
import de.dhbw.socialfunnel.model.Networks;
import de.dhbw.socialfunnel.model.User;

@RunWith(MockitoJUnitRunner.class)
public class MockedTests {
	
	@Mock private NetworksDaoImpl mockedNetworks;
	@Mock private UserDaoImpl mockedUsers;
	
	@Before
	public void setUp() {
		User mockedUser = new User("Otto", "otto@mail.com", "hallo", "11.01.1803");
		Networks mockedNetwork = new Networks("Facebook", "1", mockedUser);
		Mockito.when(mockedNetworks.findById(1)).thenReturn(mockedNetwork);
	}
	
	@Test
	public void getNetworkWithID1() throws Exception {
		assertEquals("Facebook", mockedNetworks.findById(1).getNetworkName());
		assertEquals("Otto", mockedNetworks.findById(1).getUser().getName());
		assertEquals("11.01.1803", mockedNetworks.findById(1).getUser().getDateOfBirth());
	}
	


	

	

	
	
}
