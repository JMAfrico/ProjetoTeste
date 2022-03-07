package com.tricents.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendQuotePage {

	private WebDriver driver;
	
	public SendQuotePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@name='Send Quote']//ancestor::li[@class='idealsteps-step-active']")
	private WebElement menuSendQuoteActive;

	public WebElement getMenuSendQuoteActive() {
		return menuSendQuoteActive;
	}
}
