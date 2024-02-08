package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LDIcon {

WebDriver driver;
	
	public LDIcon(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[contains(text(),'LinkedIn')]") WebElement LinkedIn;
	public void LinkedIn() {
	
		LinkedIn.isEnabled();
	}
}
