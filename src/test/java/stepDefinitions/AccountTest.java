package stepDefinitions;




import java.util.List;
import java.util.Map;

import com.qa.config.configReader;
import com.qa.factory.DriverFactory;
import com.qa.pages.AccountPage;
import com.qa.pages.LoginPage;
import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class AccountTest {
	
	LoginPage logpage = new LoginPage(DriverFactory.getDriver());
	configReader pro = new configReader();
	AccountPage accpage = new AccountPage(DriverFactory.getDriver());
	
	
	@Given("user ready login into the application")
	public void user_ready_login_into_the_application(DataTable dataTable) {
		
		
		List<Map<String, String>> credlist =	dataTable.asMaps();
		String usernames = credlist.get(0).get("username");
		String pssword = credlist.get(0).get("password");
		DriverFactory.getDriver().get(pro.init_pro().getProperty("accpageurl"));
		logpage.dologin(usernames, pssword);
		
		
	}
	
	@Given("user is on Account page")
	public void user_is_on_account_page() {
	  
		accpage.gettitle();
	}

	@Then("user gets the account section")
	public void user_gets_the_account_section(DataTable dataTable) {
		
		List<String> Expectedlist = dataTable.asList();
		System.out.println("Expectedlist--"+Expectedlist);
		List<String> actuallist	= accpage.accountsection();
		System.out.println("Actuallist--"+actuallist);
		Assert.assertTrue(Expectedlist.containsAll(actuallist));
		
	   
	}


}
