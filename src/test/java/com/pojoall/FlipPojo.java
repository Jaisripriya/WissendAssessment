package com.pojoall;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipPojo extends BaseClass{

	public FlipPojo() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//span[text()= 'Login']")
	private WebElement logMouseHover;
	
	@FindBy(xpath = "//*[text()='Logout']")
	private WebElement logoutFlip;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement enterPhoneNoBox;
	
	@FindBy(xpath = "//button[text()='Request OTP']")
	private WebElement otpButton;
	
	@FindBy(xpath = "//span[text()='Account']")
	private WebElement accountButonClick;
	
	@FindBy(xpath = "//span[text()='priya']")
	private WebElement priyaUserClick;
	

	@FindBy(xpath = "//*[text()='My Profile']")
	private WebElement myProfileClick;
	
	@FindBy(xpath = "//span[text()='Edit']")
	private WebElement editOptionClick;
	
	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement firstNameText;
	
	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement lastNameText;
	
	@FindBy(xpath = "(//div[@class ='qsHXPi'])[2]")
	private WebElement ButtonClick;
	
	
	@FindBy(xpath = "(//button[@type ='submit'])[2]")
	private WebElement saveButtonClick;
	
	@FindBy(xpath = "(//a[text() ='Edit'])[1]")
	private WebElement emailEditButton;
	
	
	@FindBy(xpath = "//*[@name='email']")
	private WebElement emailBoxValue;
	
	@FindBy(xpath = "//button[text()='SAVE']")
	private WebElement emailSaveButtonClick;
	
	@FindBy(xpath = "(//*[text()='Edit'])[2]")
	private WebElement pnoneNoEditButtonClick;
	
	
	@FindBy(xpath = "//*[@name='mobileNumber']")
	private WebElement mobileNoValueEnter;
	
	@FindBy(xpath = "(//*[text()='SAVE'])[2]")
	private WebElement mobileNoSaveButton;
	
	
	public WebElement getPriyaUserClick() {
		return priyaUserClick;
	}

	
	
	
	public WebElement getLogoutFlip() {
		return logoutFlip;
	}


	public WebElement getEmailBoxValue() {
		return emailBoxValue;
	}

	public WebElement getEmailSaveButtonClick() {
		return emailSaveButtonClick;
	}

	public WebElement getPnoneNoEditButtonClick() {
		return pnoneNoEditButtonClick;
	}

	public WebElement getMobileNoValueEnter() {
		return mobileNoValueEnter;
	}

	public WebElement getMobileNoSaveButton() {
		return mobileNoSaveButton;
	}

	public WebElement getMyProfileClick() {
		return myProfileClick;
	}

	public WebElement getEditOptionClick() {
		return editOptionClick;
	}

	public WebElement getFirstNameText() {
		return firstNameText;
	}

	public WebElement getLastNameText() {
		return lastNameText;
	}

	public WebElement getButtonClick() {
		return ButtonClick;
	}

	public WebElement getSaveButtonClick() {
		return saveButtonClick;
	}

	public WebElement getEmailEditButton() {
		return emailEditButton;
	}

	public WebElement getAccountButonClick() {
		return accountButonClick;
	}

	public WebElement getOtpButton() {
		return otpButton;
	}

	public WebElement getLogMouseHover() {
		return logMouseHover;
	}

	public WebElement getEnterPhoneNoBox() {
		return enterPhoneNoBox;
	}
	
	
	
}
