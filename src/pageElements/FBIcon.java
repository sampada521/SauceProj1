package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBIcon {

WebDriver driver;
	
	public FBIcon(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Facebook')]") WebElement Facebook;
	public void facebook() {
	
		Facebook.isEnabled();
	}
}
