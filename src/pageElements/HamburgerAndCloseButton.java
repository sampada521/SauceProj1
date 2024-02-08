package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HamburgerAndCloseButton {

WebDriver driver;
	
	public HamburgerAndCloseButton(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="react-burger-menu-btn") WebElement hamburgerButton;
	@FindBy(id="react-burger-cross-btn") WebElement hamburgerCloseButton;
	public void validateBurgerButton() {
		if(hamburgerButton.isEnabled()) {
			System.out.println("Hamburger button is enabled");
		}
		else {
			System.out.println("Hamburger button is not enabled");
		}
	}
	
	public void burgerCloseButton() {
		if(hamburgerCloseButton.isEnabled()) {
			System.out.println("Hamburger Close button is enabled");
		}
		else {
			System.out.println("Hamburger Close button is not enabled");
		}
	}
	
	
}
