package example.example.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Guru99Loginpage extends BasePage{
	public Guru99Loginpage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(name = "uid")
	private WebElement username;
	@FindBy(name= "password")
	private WebElement password;
	public void username(String id) {
		username.sendKeys(id);
		
		
	}
	public void password(String pass) {
		password.sendKeys(pass);
		
		
	}
	

}

