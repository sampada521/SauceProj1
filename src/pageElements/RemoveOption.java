package pageElements;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveOption {

WebDriver driver;
	
	public RemoveOption(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="remove-sauce-labs-onesie") WebElement remove;
	public void remove() {
		remove.isEnabled();
		remove.click();
		TakesScreenshot s2= (TakesScreenshot)driver;
		File src= s2.getScreenshotAs(OutputType.FILE);
		File desti= new File("C:\\Users\\atamboli\\Desktop\\Excelr\\Selenium Testing\\sdemo2.jpeg");
		System.out.println("Screenshot2 taken");
	}
}
