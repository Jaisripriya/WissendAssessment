package com.pojoall;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDetailsPojo extends BaseClass {
public UserDetailsPojo() {
	PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath = "//*[text()='Place Order']")
	private WebElement placeOrderButtonClick;
	
	@FindBy (xpath = "//*[@name= 'name']")
	private WebElement nameEnter;
	
	@FindBy(xpath = "//*[@name= 'phone']")
	private WebElement phoneNoEnter;
	
	@FindBy(xpath = "//*[@name= 'pincode']")
	private WebElement pinCodeEnter;
	
	@FindBy(xpath = "//*[text()='Locality']")
	private WebElement loacalityEnter;
	
	@FindBy(xpath = "//*[@name='addressLine1']")
	private WebElement addressEnter;
	
	
	@FindBy(xpath = "//*[@name='city']")
	private WebElement cityEnter;
	
	@FindBy(xpath = "//*[@name='state']")
	private WebElement dropdownStateSelect;
	
	@FindBy(xpath = "(//*[@class='qsHXPi'])[2]")
	private WebElement homeDeliveryOption;
	
	@FindBy(xpath = "//*[text()='Save and Deliver Here']")
	private WebElement saveAndDeliveryButton;
	
	public WebElement getPlaceOrderButtonClick() {
		return placeOrderButtonClick;
	}

	public WebElement getNameEnter() {
		return nameEnter;
	}

	public WebElement getPhoneNoEnter() {
		return phoneNoEnter;
	}

	public WebElement getPinCodeEnter() {
		return pinCodeEnter;
	}

	public WebElement getLoacalityEnter() {
		return loacalityEnter;
	}

	public WebElement getAddressEnter() {
		return addressEnter;
	}

	public WebElement getCityEnter() {
		return cityEnter;
	}

	public WebElement getDropdownStateSelect() {
		return dropdownStateSelect;
	}

	public WebElement getHomeDeliveryOption() {
		return homeDeliveryOption;
	}

	public WebElement getSaveAndDeliveryButton() {
		return saveAndDeliveryButton;
	}
	

}
