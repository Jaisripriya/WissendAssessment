package com.pojoall;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipSearchPojo extends BaseClass {

	public FlipSearchPojo() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement searchBoxValue;
	
	@FindBy(xpath = "(//*[@type='submit'])[1]")
	private WebElement searchButtonClick;
	
	@FindBy(xpath = "//*[contains(text(),'CHUWI Intel Celeron Dual Core 10th')]")
	private WebElement lapProductClick;
	
	@FindBy(xpath = "//*[text()='Add to cart']")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "//*[text()='All questions']//ancestor::div[@class='ttP6QY']//a")
	private WebElement scrollDownElement;
	

	@FindBy(xpath="//*[text()='Cart']")
	private WebElement addcartButtonClick;
	
	public WebElement getSearchBoxValue() {
		return searchBoxValue;
	}

	public WebElement getScrollDownElement() {
		return scrollDownElement;
	}
	
	public WebElement getSearchButtonClick() {
		return searchButtonClick;
	}

	public WebElement getLapProductClick() {
		return lapProductClick;
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

	public WebElement getAddcartButtonClick() {
		return addcartButtonClick;
	}

	
	
	
	
	
	
	
	
}
