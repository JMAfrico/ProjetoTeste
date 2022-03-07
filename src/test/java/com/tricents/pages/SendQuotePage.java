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
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement txtEMail;
	
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement txtPhone;
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement txtUsername;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement txtPassword;
	
	@FindBy(xpath = "//input[@id='confirmpassword']")
	private WebElement txtConfirmPassword;
	
	@FindBy(xpath = "//textarea[@id='Comments']")
	private WebElement txtComments;
	
	@FindBy(xpath = "//button[@id='sendemail']")
	private WebElement btnSendEmail;
	
	@FindBy(xpath = "//h2[contains(text(),'Sending e-mail success!')]")
	private WebElement lblEmailSendSucess;

	public WebElement getMenuSendQuoteActive() {
		return menuSendQuoteActive;
	}

	public WebElement getTxtEMail() {
		return txtEMail;
	}

	public WebElement getTxtPhone() {
		return txtPhone;
	}

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getTxtConfirmPassword() {
		return txtConfirmPassword;
	}

	public WebElement getTxtComments() {
		return txtComments;
	}

	public WebElement getBtnSendEmail() {
		return btnSendEmail;
	}

	public WebElement getLblEmailSenhSucess() {
		return lblEmailSendSucess;
	}
}
