package com.ATGAutomation.Tests;

import org.testng.annotations.Test;

import com.ATGAutomation.Pages.HomePage;
import com.aventstack.extentreports.Status;

public class CreateCouponTest extends BaseTest{
	@Test
	public void createCoupon() throws InterruptedException
	{
		//reportUtils.createATestCase("createCoupon");
		//reportUtils.addTestLog(Status.INFO, "performingLog");
		HomePage homePage = new HomePage(driver);
		
		homePage.acceptAlertCookies();
		homePage.clickOnSpelaLink();
		homePage.scrolDown();
		homePage.clickOnV4Link();
		homePage.clickOnV41Btn();
		homePage.clickOnV42Btn();
		homePage.clickOnV43Btn();
		homePage.clickOnV4AllBtn();
		homePage.clickOnNewCouponBtn();
		homePage.clickOnBlankCouponBtn();	
		
	}


}
