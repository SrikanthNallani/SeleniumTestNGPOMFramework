package example.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import example.example.factory.PageinstancesFactory;
import example.example.pages.AmazonLoginPage;
import example.example.pages.FacebookLoginPage;

/**
 * The Class AmazonLoginTest.
 *
 * @author Bharathish
 */
@Test(testName = "Amazon Login Test", description = "Amazon Login Test")
public class AmazonLoginTest extends BaseTest {

	@Test
	public void amazonLoginTest() {
		driver.get("https://www.amazon.com/");
		AmazonLoginPage amazonloginpage = PageinstancesFactory.getInstance(AmazonLoginPage.class);
		amazonloginpage.dropdown();
		amazonloginpage.signin();
		

	}
}
