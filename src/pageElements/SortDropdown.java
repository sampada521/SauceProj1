package pageElements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SortDropdown {
	
	WebDriver driver;
	
	@FindBy(xpath="//select[@class='product_sort_container']")  WebElement sortBtn;
	@FindBy(xpath="//div[@class='inventory_item_name ']") List<WebElement> sortOptions;
	
	public SortDropdown(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	public void validSortBtn() {
		sortBtn.isEnabled();
	}
	
	public void verifyDropdownButton() {
		
	}
	
	public List<WebElement> productNamesZtoA(){
		System.out.println("+++======Sort Z To A======+++");
		System.out.println("Number of products:" +sortOptions.size());
		for(WebElement ZtoA: sortOptions) {
			System.out.println("List- " +((WebElement) sortOptions).getText());
		}
		return sortOptions;
	}
	
	public List<WebElement> priceLowToHigh(){
		System.out.println("+++======Low to High======+++");
		System.out.println("Number of products:" +sortOptions.size());
		for(WebElement LowToHigh: sortOptions) {
			System.out.println("List- " +((WebElement) sortOptions).getText());
		}
		return sortOptions;
	}
		public List<WebElement> priceHighToLow(){
			System.out.println("+++======High to Low======+++");
			System.out.println("Number of products:" +sortOptions.size());
			for(WebElement HighToLow: sortOptions) {
				System.out.println("List- " +((WebElement) sortOptions).getText());
			}
			return sortOptions;
	}
		
	
}
