package example.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import example.example.factory.PageinstancesFactory;
import example.example.pages.FacebookLoginPage;
import example.example.pages.Guru99Loginpage;

/**
 * The Class Guru99Logintest.
 *
 * @author Nikhila
 */
@Test(testName = "Guru99 login test", description = "Guru99 login test")
public class Guru99Logintest extends BaseTest {

	@Test
	public void Guru99Logintest() {
		driver.get("https://demo.guru99.com/v4/");
		Guru99Loginpage guru99loginpage =  PageinstancesFactory.getInstance(Guru99Loginpage.class);
		guru99loginpage.username("Nikhila");
		guru99loginpage.password("abcd");
		guru99loginpage.clicklogin();
		
		/*
		 * FacebookLoginPage facebookLoginPage =
		 * PageinstancesFactory.getInstance(FacebookLoginPage.class);
		 * facebookLoginPage.enterEmail("abc").enterPassword("abc").clickSignIn();
		 * Assert.assertFalse(false, "Login Sucess");
		 */
	}
}
