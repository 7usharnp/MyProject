package parallel;

import org.testng.Assert;

import com.pages.LandingPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LandingPageStep {
	
	LandingPage landingPage = new LandingPage(DriverFactory.getDriver());
	String actualTitle;
	@Given("user is on Landing page")
	public void user_is_on_landing_page() {
		DriverFactory.getDriver()
		.get("https://test-can-new-cybage.pantheonsite.io/user/login");
	}

	@Then("page title is {string}")
	public void page_title_is(String expectedTitle) {
	 actualTitle = landingPage.getLandingPageTitle();
	 Assert.assertEquals(expectedTitle, actualTitle);
	 
	}


}
