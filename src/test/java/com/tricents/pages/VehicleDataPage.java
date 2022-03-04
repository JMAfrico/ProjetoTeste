package com.tricents.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleDataPage {

	private WebDriver driver;
	
	public VehicleDataPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@name='Enter Vehicle Data']//ancestor::li[@class='idealsteps-step-active']")
	private WebElement menuEnterVehicleDataActive;
	
	@FindBy(xpath = "//a[@name='Enter Insurant Data']//ancestor::li[@class='idealsteps-step-active']")
	private WebElement menuEnterInsurantActive;
	
	@FindBy(xpath = "//a[@name='Enter Product Data']//ancestor::li[@class='idealsteps-step-active']")
	private WebElement menuEnterProductDataActive;
	
	@FindBy(xpath = "//a[@name='Select Price Option']//ancestor::li[@class='idealsteps-step-active']")
	private WebElement menuSelectPriceOptionActive;
	
	@FindBy(xpath = "//a[@name='Send Quote']//ancestor::li[@class='idealsteps-step-active']")
	private WebElement menuSendQuoteActive;
	
	@FindBy(xpath = "//select[@id='make']")
	private WebElement selectMake;
	
	@FindBy(xpath = "//select[@id='model']")
	private WebElement selectModel;
	
	@FindBy(xpath = "//input[@id='cylindercapacity']")
	private WebElement txtCylinderCapacity;
	
	@FindBy(xpath = "//input[@id='engineperformance']")
	private WebElement txtEnginePerform;
	
	@FindBy(xpath = "//input[@id='dateofmanufacture']")
	private WebElement txtDateofManufacture;
	
	@FindBy(xpath = "//select[@id='numberofseats']")
	private WebElement selectNumberofSeats;
	
	@FindBy(xpath = "(//p[@class='group']//following::label)[1]")
	private WebElement selectRightHandDrive;
	
	@FindBy(xpath = "//select[@id='numberofseatsmotorcycle']")
	private WebElement selectNumberofSeatsMotorcycle;
	
	@FindBy(xpath = "//select[@id='fuel']")
	private WebElement selectFuelType;
	
	@FindBy(xpath = "//input[@id='payload']")
	private WebElement txtPayload;

	@FindBy(xpath = "//input[@id='totalweight']")
	private WebElement txtTotalWeight;
	
	@FindBy(xpath = "//input[@id='listprice']")
	private WebElement txtListPrice;
	
	@FindBy(xpath = "//input[@id='licenseplatenumber']")
	private WebElement txtLicensePlateNumber;
	
	@FindBy(xpath = "//input[@id='annualmileage']")
	private WebElement txtAnnualMileage;
	
	@FindBy(xpath = "//button[@id='nextenterinsurantdata']")
	private WebElement btnNext;
	
	public void navigateToHomePage() {
		driver.get("http://sampleapp.tricentis.com/101/app.php");
	}
	
	public void verificoQueEstouNoSiteDeCotacao() {
		Assert.assertEquals("http://sampleapp.tricentis.com/101/app.php",driver.getCurrentUrl());	
	}	
	
	public WebElement getSelectModel() {
		return selectModel;
	}

	public WebElement getMenuEnterVehicleDataActive() {
		return menuEnterVehicleDataActive;
	}

	public WebElement getMenuEnterInsurantActive() {
		return menuEnterInsurantActive;
	}

	public WebElement getMenuEnterProductDataActive() {
		return menuEnterProductDataActive;
	}

	public WebElement getMenuSelectPriceOptionActive() {
		return menuSelectPriceOptionActive;
	}

	public WebElement getMenuSendQuoteActive() {
		return menuSendQuoteActive;
	}

	public WebElement getTxtCylinderCapacity() {
		return txtCylinderCapacity;
	}

	public WebElement getSelectRightHandDrive() {
		return selectRightHandDrive;
	}

	public WebElement getSelectNumberofSeatsMotorcycle() {
		return selectNumberofSeatsMotorcycle;
	}

	public WebElement getTxtPayload() {
		return txtPayload;
	}

	public WebElement getTxtTotalWeight() {
		return txtTotalWeight;
	}

	public WebElement getBtnNext() {
		return btnNext;
	}

	public WebElement getTxtEnginePerform() {
		return txtEnginePerform;
	}

	public WebElement getTxtDateofManufacture() {
		return txtDateofManufacture;
	}

	public WebElement getSelectNumberofSeats() {
		return selectNumberofSeats;
	}

	public WebElement getSelectFuelType() {
		return selectFuelType;
	}

	public WebElement getTxtListPrice() {
		return txtListPrice;
	}

	public WebElement getTxtLicensePlateNumber() {
		return txtLicensePlateNumber;
	}

	public WebElement getTxtAnnualMileage() {
		return txtAnnualMileage;
	}

	public WebElement getSelectMake() {
		return selectMake;
	}
}
