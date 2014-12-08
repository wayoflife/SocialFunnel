package com.socialfunnel.bddtest;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumTest {

	private WebDriver driver;
	private String baseUrl;
	private String browserName;
	private String browserVersion;

	public void setUp() throws Exception {

		// driver = new HtmlUnitDriver();

		driver = new FirefoxDriver();

		// driver = new ChromeDriver();

		// driver = new InternetExplorerDriver ();

		// driver = new SafariDriver();

		baseUrl = "http://socialfunnel.it.dh-karlsruhe.de:8080/SocialFunnel";

		// note due to issue in wordpress the URL does not display properly
		// above. The URL should end with a forward slash, then quote marks,
		// then a semi colon.

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();

		browserName = caps.getBrowserName();

		browserVersion = caps.getVersion();

		System.out.println("Automated test run. Were running on " + browserName + " " + browserVersion);

	}

	public void tearDown() {

		driver.quit();

	}

	public void goToHomePage() {

		driver.get(baseUrl);

	}
	
	public void register(){
		
	}

	public void clickRegister() {
		driver.findElement(By.id("btnRegistrieren")).click();
	}
	public void enterpassword() {
		driver.findElement(By.id("txtPasswort")).sendKeys("test123");
	}

	public void enterpassword2() {
		driver.findElement(By.id("txtPasswort2")).sendKeys("test123");
	}

	public void checkbox() {
		driver.findElement(By.id("checkbox")).click();
	}

	public void wrongEntry() {
		driver.findElement(By.id("txtPasswort2")).sendKeys("falschesPasswort");
	}

	public void onPage(String string) {
		assertTrue(driver.getCurrentUrl().contains(string));
	}

	public void errorMessage() {
		assertTrue(driver.findElement(By.className("v-app mytheme v-overlay-container")) != null);
	}

	public void notloggedin() {
		onPage("login");
		onPage("register");
	}

	public void chooseNetwork() {
		driver.findElement(By.id("listNetwork")).click();
	}

	public void titleAsExpected() {
		assertTrue(driver.getTitle().equalsIgnoreCase("SocialFunnel"));
	}

	public void networkListCheck() {
		assertTrue(driver.findElement(By.className("v-slot")) != null);
	}

}
