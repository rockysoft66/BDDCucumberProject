package AppHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.config.configReader;
import com.qa.factory.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;



public class ApplicationHooks {

	private WebDriver driver;

	private DriverFactory driverFactory;
	Properties pro;

	@Before (order = 0)
	public void init_pro(){
		configReader reader = new configReader();
		pro =reader.init_pro();


	}
	@Before (order =1)
	public void lunchBrowser(){
		
		String Browser  = pro.getProperty("browser");
		driverFactory = new DriverFactory();
		driver=  driverFactory.init_driver(Browser);
	}
	@After(order =1)
	public void teardown(Scenario sc ){
		
		if (sc.isFailed()){
			String screenshotname =sc.getName();
			byte [] sourcepath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			sc.attach(sourcepath, "image/png", screenshotname);
		}
		
		
	}
	@After (order= 0)
	public void quitBrowser(){
		driver.quit();
		
		
	}

}
