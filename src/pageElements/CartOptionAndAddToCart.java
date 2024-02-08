package pageElements;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CartOptionAndAddToCart {
	
	WebDriver driver;
	
	public CartOptionAndAddToCart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@class='shopping_cart_link']") WebElement cartLink;
	public void validateBurgerButton() {
		if(cartLink.isEnabled()) {
			System.out.println("cartLink is enabled");
		}
		else {
			System.out.println("cartLink is not enabled");
		}
		cartLink.click();
		String title=driver.getTitle();
		System.out.println("The title of current page is "+title);
		Assert.assertEquals(title, "Your Cart");
	}
	
	@FindBy (id="add-to-cart-sauce-labs-onesie") WebElement addOnesie;
	public void addProductToCart() throws InterruptedException {
		addOnesie.isEnabled();
		addOnesie.click();
		
		TakesScreenshot sc=(TakesScreenshot) driver;
		Thread.sleep(3000);
		File source= sc.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\atamboli\\Desktop\\Excelr\\Selenium Testing\\sd.jpeg");
		System.out.println("Screenshot taken");
	}
	
	@FindBy (id="checkout") WebElement checkout;
	@FindBy (name="firstName") WebElement firstName;
	@FindBy (name="lastName") WebElement lastName;
	@FindBy (name="postalCode") WebElement postalCode;
	@FindBy (name="continue") WebElement continueBtn;
	public void validateCheckoutOption() {
		cartLink.click();
		checkout.isEnabled();
		checkout.click();
		firstName.sendKeys("Sam");
		lastName.sendKeys("P");
		postalCode.sendKeys("50090");
		continueBtn.click();
		}
		
	
}
