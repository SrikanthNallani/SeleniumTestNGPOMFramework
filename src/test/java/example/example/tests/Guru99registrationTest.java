package example.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import example.example.factory.PageinstancesFactory;
import example.example.pages.FacebookLoginPage;
import example.example.pages.Guru99Loginpage;
import example.example.pages.Guru99registrationpage;

/**
 * The Class Guru99Logintest.
 *
 * @author Nikhila
 */
@Test(testName = "Guru99registration login test", description = "Guru99registration login test")
public class Guru99registrationTest extends BaseTest {

	@Test
	public void Guru99registrationLogintest() {
		driver.get("https://demo.guru99.com/v4/");
		Guru99Loginpage guru99loginpage =  PageinstancesFactory.getInstance(Guru99Loginpage.class);
		
		guru99loginpage.username("mngr583941");
		guru99loginpage.password("zUsUzEr");
		guru99loginpage.clicklogin();
		Guru99registrationpage registration = PageinstancesFactory.getInstance(Guru99registrationpage.class);
		registration.clickNewcust();
		/*
		 * FacebookLoginPage facebookLoginPage =
		 * PageinstancesFactory.getInstance(FacebookLoginPage.class);
		 * facebookLoginPage.enterEmail("abc").enterPassword("abc").clickSignIn();
		 * Assert.assertFalse(false, "Login Sucess");
		 */
	}
}
