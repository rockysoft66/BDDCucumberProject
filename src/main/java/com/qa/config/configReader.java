package com.qa.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configReader {
	
	private Properties pro;
	public Properties init_pro(){
		
	
		try {
			FileInputStream	ip = new FileInputStream(new File("D:\\TestProject\\New workplace\\Freecrm\\src\\main\\java\\com\\qa\\utils\\config.properties"));
			 
			  pro = new Properties();
			 pro.load(ip);
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		 
		 
		return pro;
	}
	
	
	

}
