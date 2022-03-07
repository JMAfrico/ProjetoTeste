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

	@FindBy(xpath = "//table[@id='priceTable']//following::input[@id='selectgold']//ancestor::label")
	private WebElement rdbSelectPriceOption;
	
	@FindBy(xpath = "//button[@id='nextsendquote']")
	private WebElement btnNextSendQuote;
	
	public WebElement getMenuSelectPriceOptionActive() {
		return menuSelectPriceOptionActive;
	}
	
	public WebElement getRdbSelectPriceOption() {
		return rdbSelectPriceOption;
	}

	public WebElement getBtnNextSendQuote() {
		return btnNextSendQuote;
	}

}