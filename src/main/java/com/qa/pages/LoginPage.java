package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;


	private By emailId = By.id("email");
	private By password = By.id("passwd");
	private By forgotpasswordlink = By.xpath("//a[contains(text(),'Forgot your password?')]");
	private By signButton = By.name("SubmitLogin");

	public LoginPage (WebDriver driver){
		this.driver = driver;
	}
	public String getTitle(){

		return driver.getTitle();
	}
	public void enterUserName(String username) {
		driver.findElement(emailId).sendKeys(username);
	}
	public void enterPassword(String passwod){
		driver.findElement(password).sendKeys(passwod);
	}
	public void clickOnSignButton(){

		driver.findElement(signButton).click();
	}
	public boolean forgotpasswordlink(){

		return driver.findElement(forgotpasswordlink).isEnabled();
	}



}
