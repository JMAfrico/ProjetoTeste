package com.tricents.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Classe responsável por localizar os elementos da guia Insurant Data
 */
public class InsurantDataPage {

	WebDriver driver;
	
	public InsurantDataPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@name='Enter Insurant Data']//ancestor::li[@class='idealsteps-step-active']")
	private WebElement menuEnterInsurantActive;
	
	@FindBy(xpath = "//input[@id='firstname']")
	private WebElement txtFirstName;
	
	@FindBy(xpath = "//input[@id='lastname']")
	private WebElement txtLastName;

	@FindBy(xpath = "//input[@id='birthdate']")
	private WebElement txtDateofBirth;

	@FindBy(xpath = "(//label[@class='ideal-radiocheck-label']//ancestor::label)[3]")
	private WebElement rdbGenderMale;
	
	@FindBy(xpath = "//input[@id='streetaddress']")
	private WebElement txtStreetAddress;

	@FindBy(xpath = "//select[@id='country']")
	private WebElement selectCountry;

	@FindBy(xpath = "//input[@id='zipcode']")
	private WebElement txtZipCode;

	@FindBy(xpath = "//input[@id='city']")
	private WebElement txtCity;

	@FindBy(xpath = "//select[@id='occupation']")
	private WebElement selectOccupation;

	@FindBy(xpath = "((//p[@class='group'])[3])//following::label[@class='ideal-radiocheck-label'][4]")
	private WebElement rdbHobbies;

	@FindBy(xpath = "((//p[@class='group'])[3])//following::label[@class='ideal-radiocheck-label'][5]")
	private WebElement rdbHobbies2;

	@FindBy(xpath = "//input[@id='website']")
	private WebElement txtWebsite;

	@FindBy(xpath = "//button[@id='open']")
	private WebElement Picture;
	
	@FindBy(xpath = "//button[@id='nextenterproductdata']")
	private WebElement btnNextEnterProductData;
	
	public WebElement getBtnNextEnterProductData() {
		return btnNextEnterProductData;
	}

	public void getMenuEnterInsurantIsActive() {
		Assert.assertTrue(menuEnterInsurantActive.isDisplayed());
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtDateofBirth() {
		return txtDateofBirth;
	}

	public WebElement getRdbGenderMale() {
		return rdbGenderMale;
	}

	public WebElement getTxtStreetAddress() {
		return txtStreetAddress;
	}

	public WebElement getSelectCountry() {
		return selectCountry;
	}

	public WebElement getTxtZipCode() {
		return txtZipCode;
	}

	public WebElement getTxtCity() {
		return txtCity;
	}

	public WebElement getSelectOccupation() {
		return selectOccupation;
	}

	public WebElement getRdbHobbies() {
		return rdbHobbies;
	}

	public WebElement getRdbHobbies2() {
		return rdbHobbies2;
	}

	public WebElement getTxtWebsite() {
		return txtWebsite;
	}

	public WebElement getPicture() {
		return Picture;
	}
}
