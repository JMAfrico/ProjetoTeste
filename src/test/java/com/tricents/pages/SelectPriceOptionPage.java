package com.tricents.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPriceOptionPage {

	private WebDriver driver;
	
	public SelectPriceOptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@name='Select Price Option']//ancestor::li[@class='idealsteps-step-active']")
	private WebElement menuSelectPriceOptionActive;

	public WebElement getMenuSelectPriceOptionActive() {
		return menuSelectPriceOptionActive;
	}
}