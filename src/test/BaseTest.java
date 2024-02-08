package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageElements.HamburgerAndCloseButton;
import pageElements.Homepage;
import pageElements.Login;

public class BaseTest {
	
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	
	
	Login loginpage= new Login(driver);
	loginpage.placeholders();
	loginpage.validCredentials();
	loginpage.enterValidCredentials("standard_user","secret_sauce");
	loginpage.loginEnterKey();
	loginpage.invalidUnameValidPword();
	loginpage.validUnameinvalidPword();
	loginpage.loginButton();
	
	
	Homepage hp= new Homepage(driver);
	hp.validateHomepage();
	
	HamburgerAndCloseButton hburger= new HamburgerAndCloseButton(driver);
	hburger.validateBurgerButton();
	hburger.burgerCloseButton();
	}
	
	

}
