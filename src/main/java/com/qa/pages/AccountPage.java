package com.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {
	
	private WebDriver driver;
	By accountsection  = By.xpath("//*[@id='center_column']/div/div/ul/li/a/span");
	
	
	
	
	
	public AccountPage (WebDriver driver){
		
		this.driver =driver;
	}
	
	public String gettitle(){
		
		return driver.getTitle();
	}
	
	public List<String> accountsection(){
		List<String> accoutlist = new ArrayList<String>();
		List<WebElement>accsectionlist = driver.findElements(accountsection);
		for (WebElement e1: accsectionlist){
			accoutlist.add(e1.getText());
		}
		
		return accoutlist;
	}
	

}
