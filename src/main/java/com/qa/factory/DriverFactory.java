package com.qa.factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;

	public static ThreadLocal<WebDriver>tl_driver = new ThreadLocal();

	public WebDriver init_driver (String browser){
		

		if (browser.equalsIgnoreCase("chrome")){

			WebDriverManager.chromedriver().setup();

			tl_driver.set( new ChromeDriver());
		}else if (browser.equalsIgnoreCase("firefox")){

			WebDriverManager.firefoxdriver().setup();

			tl_driver.set( new FirefoxDriver());

		}else if (browser.equalsIgnoreCase("safari")){

			tl_driver.set( new SafariDriver());
		}else
		{
			System.out.println("please pass the correct browser value" + browser);
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		getDriver().manage().window().maximize();
		
		return getDriver();
	}
	public static WebDriver getDriver(){
		return tl_driver.get();
	}
	
}	