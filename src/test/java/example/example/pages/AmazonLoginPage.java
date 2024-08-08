package example.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonLoginPage  extends BasePage{
	public AmazonLoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//*[contains(@class,'nav-icon nav-arrow')]")
	private WebElement dropdown;
	@FindBy(xpath = "//*[contains(@class,'nav-action-inner')]")
	private WebElement signin;
	public void dropdown() {
		dropdown.click();
		
		
	}
	
	public void signin() {
		signin.click();
		
		
	}
	
	

}
