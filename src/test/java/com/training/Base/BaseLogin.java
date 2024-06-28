package com.training.Base;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.training.Utilities.Constants;
import com.training.Utilities.Log4j2Utility;
import com.training.Utilities.PropertyUtility;

public class BaseLogin extends BaseTest{
	Logger mylogger=Log4j2Utility.getLogger(BaseLogin.class);
	@Parameters("browserName")
	@BeforeMethod
	public void beforeMethodStart(@Optional("chrome") String BrowserName) {
		Log4j2Utility.logInfo("-------BeforeMethodStart-----");
		launchBrowser(BrowserName);
		String url=PropertyUtility.readDataFromFile(Constants.SalesForce_Application, "url");
		getUrl(url);
	}
	
	@AfterMethod
	public void afterMethodEnds() {
		Log4j2Utility.logInfo("--------AfterMethodsEnds------");
		closeAllTheBrowsers();
	}
	
	@BeforeTest
	public void beforeTest() {
		Log4j2Utility.logInfo("This is before test.");
	}
	
	@AfterTest
	public void afterTest() {
		Log4j2Utility.logInfo("This is after test.");
	}
	
	public void login_salesForce() {
		String usernameData=PropertyUtility.readDataFromFile(Constants.SalesForce_Application, "username");
		String passwordData=PropertyUtility.readDataFromFile(Constants.SalesForce_Application, "password");
		implicitWait(10);
		
		WebElement username=driver.findElement(By.cssSelector("input#username"));
		enterData(username, usernameData, "Username");
		
		WebElement password=driver.findElement(By.cssSelector("input#password"));
		enterData(password, passwordData, "Password");
		
		WebElement clickOnLoginButton=driver.findElement(By.id("Login"));
		clickOnButtonOrBoxes(clickOnLoginButton, "clickOnLoginButton");
	}
}
