package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwitterIcon {

WebDriver driver;
	
	public TwitterIcon(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Twitter')]") WebElement Twitter;
	public void twitter() {
	
	Twitter.isEnabled();
	}
}
