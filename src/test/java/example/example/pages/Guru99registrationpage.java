package example.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Guru99registrationpage  extends BasePage {
	public Guru99registrationpage  (WebDriver driver) {
		super(driver);
		
	}
	@FindBy(linkText = "New Customer")
	private WebElement Newcustlink;
	public void clickNewcust() {
	Newcustlink.click();
	}


}
