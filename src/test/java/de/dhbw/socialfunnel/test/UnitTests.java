package de.dhbw.socialfunnel.test;

import static org.junit.Assert.*;

import org.junit.Test;

import de.dhbw.socialfunnel.todo.PWCrypt;

public class UnitTests {
	
	@Test
	public void testEncryption() throws Exception {
		PWCrypt crypt = PWCrypt.getInstance();
		String input = "socialfunnel";
		assertNotEquals(null, input, crypt.encrypt(input));
	}
	
	@Test
	public void testDecryption() throws Exception {
		PWCrypt crypt = PWCrypt.getInstance();
		String input = "socialfunnel";
		String encrypted = crypt.encrypt(input);
		assertNotEquals(null, input, encrypted);
		assertEquals(input, crypt.decrypt(encrypted));
	}
	
	@Test
	public void testDataConnection() throws Exception {
		
	}
	
	@Test
	public void testAuthentificationService() throws Exception {
		
	}
	
	@Test
	public void authenticationFailure() throws Exception {
		
	}
	
	@Test
	public void authenticationSuccess() throws Exception {
		
	}
	
	@Test
	public void loginLogic() throws Exception {
		
	}
	
	@Test
	public void databaseMarkup() throws Exception {
		
	}
	
	@Test
	public void dbUser() throws Exception {
		
	}	
}
