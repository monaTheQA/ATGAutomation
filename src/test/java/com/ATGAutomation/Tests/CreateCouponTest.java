package com.ATGAutomation.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.ATGAutomation.Pages.HomePage;
import com.aventstack.extentreports.Status;

public class CreateCouponTest extends BaseTest{
	@Test
	public void createCoupon() throws InterruptedException
	{
		reportUtils.createATestCase("createCoupon");
		reportUtils.addTestLog(Status.INFO, "performingLog");
		HomePage homePage = new HomePage(driver);
		System.out.println("HomePage");
		homePage.acceptAlertCookies();	
		System.out.println("AlertCookies");
		homePage.clickOnSpelaLink();	
		System.out.println("SpelaLink");
		homePage.scrolDown();		
		System.out.println("Scrolldown");
		homePage.clickOnV4Link();
		homePage.clickOnV41Btn();
		homePage.clickOnV42Btn();
		homePage.clickOnV43Btn();
		homePage.clickOnV4AllBtn();
		homePage.clickOnNewCouponBtn();
		homePage.clickOnBlankCouponBtn();	
		
	}


}
