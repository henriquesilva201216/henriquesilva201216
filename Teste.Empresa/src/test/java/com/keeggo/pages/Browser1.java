package com.keeggo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser1 {
	
	
	
	
	
	
	
	private static WebDriver driver;
	
	public WebDriver lDriver() {
		return driver;
	}

	public void navegadorLogin(String site) {
		try {

			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(site);
			driver.manage().window().maximize();
			
		} catch (Exception e) {
			System.out.println("------ error ao tentar abrir o site ------- " + e);
		}

	}


}
