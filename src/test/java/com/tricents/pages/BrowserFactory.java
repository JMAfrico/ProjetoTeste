package com.tricents.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	public static WebDriver getChromeDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/libs/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://sampleapp.tricentis.com/101/app.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().getPageLoadTimeout();
		return driver;
	}

	public static void exitChromeDriver(WebDriver driver) {
		if (driver != null){
			driver.quit();	
		}
	}
}
