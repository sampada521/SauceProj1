package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='app_logo']") WebElement appLogo;
	
	public void validateHomepage() {
		
		System.out.println(appLogo.getText());
		System.out.println("Landed to homepage");
		
	}

}


