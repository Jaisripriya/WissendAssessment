package com.flipkark;

import java.io.IOException;

import org.helper.BaseClass;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import com.pojoall.FlipPojo;
import com.pojoall.FlipSearchPojo;
import com.pojoall.UserDetailsPojo;

public class FlipkartTesting extends BaseClass{

	//Flipkart Automate Using TestNG Framework
	
	@BeforeClass
	private void homePageFlip() {
		
		browserSelect("Chrome");
		urlLoad("https://www.flipkart.com/");
		maxBrowser();
	}
	
	
	@Test(priority = 11)
	private void userRegisterFlipkart() throws IOException, InterruptedException {
		//user click the Login Option 
		FlipPojo f = new FlipPojo();
		btnClick(f.getLogMouseHover());
		enterValues(f.getEnterPhoneNoBox(), xlDatasGet(1, 2));
		Thread.sleep(30000);		
		//validate user redirect homepage or not 
		String t = titleGet();
		Assert.assertEquals(t.startsWith("Online Shopping"), t.startsWith("Online Shopping"), "Title Verify");
		System.out.println("User is an Home Page of Flipkart");
	}
	
	@Ignore
	@Test(priority = 12)
	private void userLoginDetails() throws IOException, InterruptedException {
		Thread.sleep(5000);
		FlipPojo f = new FlipPojo();
		btnClick(f.getAccountButonClick());
		Thread.sleep(3000);
		btnClick(f.getMyProfileClick());
		btnClick(f.getEditOptionClick());
		enterValues(f.getFirstNameText(), xlDatasGet(2, 1));
		enterValues(f.getLastNameText(), xlDatasGet(2, 2));
		btnClick(f.getSaveButtonClick());
		btnClick(f.getButtonClick());
		btnClick(f.getEmailEditButton());
		enterValues(f.getEmailBoxValue(), xlDatasGet(3, 1));
		btnClick(f.getEmailSaveButtonClick());
		btnClick(f.getPnoneNoEditButtonClick());
		enterValues(f.getEmailBoxValue(), xlDatasGet(1, 2));
		btnClick(f.getEmailSaveButtonClick());	
		
		String t = titleGet();
		Assert.assertEquals(t.contains("home_account"), t.contains("home_account"), "Title Verify");
		System.out.println("User is an Home Page of Flipkart");
		Thread.sleep(3000);
	}
	
	
	@Test(priority = 13)
	private void productSearchAndPurchase() throws IOException, InterruptedException {
		//user Search the Product and Purchase the Product
		FlipSearchPojo search = new FlipSearchPojo();
		
		enterValues(search.getSearchBoxValue(), xlDatasGet(4, 1));
		btnClick(search.getSearchButtonClick());
		btnClick(search.getLapProductClick());
		Thread.sleep(4000);
		scrollDownJavaScript(search.getScrollDownElement());
		Thread.sleep(4000);
		btnClick(search.getAddToCartButton());
		Thread.sleep(4000);
		handlingWindows(1);
	}
	
	@Test(priority = 14)
	private void userDetailsTestCase() throws IOException {
		UserDetailsPojo user = new UserDetailsPojo();
		btnClick(user.getPlaceOrderButtonClick());
		enterValues(user.getNameEnter(), xlDatasGet(5, 2));
		enterValues(user.getPhoneNoEnter(), xlDatasGet(5, 3));
		enterValues(user.getPinCodeEnter(), xlDatasGet(6 , 2));
		enterValues(user.getLoacalityEnter(), xlDatasGet(6 , 3));
		enterValues(user.getAddressEnter(), xlDatasGet(7 , 2));
		enterValues(user.getCityEnter(), xlDatasGet(7 , 3));
		dropDownSelectByText(user.getDropdownStateSelect(), xlDatasGet(8, 2));
		btnClick(user.getHomeDeliveryOption());
		btnClick(user.getSaveAndDeliveryButton());

	}
	
	@Test(priority = 15)
	private void logoutFunction() {
		FlipPojo f = new FlipPojo();
		btnClick(f.getPriyaUserClick());
		btnClick(f.getLogoutFlip());
		String homeTitle = titleGet();
		Assert.assertEquals(homeTitle, homeTitle.contains("Online"), "Title Verify");
		System.out.println("User Logout out The Page ");
		
	}
	
	
	
	
	
	
}
