package com.tricents.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDataPage {

	private WebDriver driver;
	
	public ProductDataPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath = "//a[@name='Enter Product Data']//ancestor::li[@class='idealsteps-step-active']")
	private WebElement menuEnterProductDataActive;
	
	@FindBy(xpath = "//input[@id='startdate']")
	private WebElement txtStartDate;
	
	@FindBy(xpath = "//select[@id='insurancesum']")
	private WebElement selectInsuranceSum;
	
	@FindBy(xpath = "//select[@id='meritrating']")
	private WebElement selectMeritRating;
	
	@FindBy(xpath = "//select[@id='damageinsurance']")
	private WebElement selectDamageInsurance;
	
	@FindBy(xpath = "//input[@id='EuroProtection']//ancestor::div[@class='field idealforms-field idealforms-field-checkbox']")
	private WebElement rdbOptionalProducts;
	
	@FindBy(xpath = "//select[@id='courtesycar']")
	private WebElement selectCourtesyCar;
	
	@FindBy(xpath = "//button[@id='nextselectpriceoption']")
	private WebElement btnNextSelectPriceOption;
	
			
	public WebElement getMenuEnterProductDataActive() {
		return menuEnterProductDataActive;
	}

	public WebElement getTxtStartDate() {
		return txtStartDate;
	}

	public WebElement getSelectInsuranceSum() {
		return selectInsuranceSum;
	}

	public WebElement getSelectMeritRating() {
		return selectMeritRating;
	}

	public WebElement getSelectDamageInsurance() {
		return selectDamageInsurance;
	}

	public WebElement getRdbOptionalProducts() {
		return rdbOptionalProducts;
	}

	public WebElement getSelectCourtesyCar() {
		return selectCourtesyCar;
	}

	public WebElement getBtnNextSelectPriceOption() {
		return btnNextSelectPriceOption;
	}
}
