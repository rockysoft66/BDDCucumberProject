package stepDefinitions;

import com.qa.config.configReader;
import com.qa.factory.DriverFactory;
import com.qa.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;


public class LoginTest {
	LoginPage loginpage = new LoginPage(DriverFactory.getDriver());
	configReader reader = new configReader();
	String Title;
	@Given("User on the Login page")
	public void user_on_the_login_page() {
		DriverFactory.getDriver().get(reader.init_pro().getProperty("url"));
	}

	@Given("User get the title of the page")
	public void user_get_the_title_of_the_page() {
		 Title = loginpage.getTitle();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String pagetitle) {
	    Assert.assertEquals(pagetitle, Title);
	}

	@Then("Forgot password Link should be displayed")
	public void forgot_password_link_should_be_displayed() {
		Assert.assertTrue(loginpage.forgotpasswordlink());
	    
	}
	
	@When("User enter username {string}")
	public void user_enter_username(String username) {
		loginpage.enterUserName(username);
	}

	@When("User enter password {string}")
	public void user_enter_password(String passwod) {
	   loginpage.enterPassword(passwod);
	}

	@When("User Clik on Sigin Button")
	public void user_clik_on_sigin_button() {
		loginpage.clickOnSignButton();
		 
	}

	

	
	

}
