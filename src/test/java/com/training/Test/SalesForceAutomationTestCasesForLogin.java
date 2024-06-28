package com.training.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.training.Base.BaseLogin;
import com.training.Utilities.Constants;
import com.training.Utilities.PropertyUtility;
@Listeners(com.training.Utilities.TestListeners.class)
public class SalesForceAutomationTestCasesForLogin extends BaseLogin{
	

	@Test
	public void TestCase1() {
		String usernameData=PropertyUtility.readDataFromFile(Constants.SalesForce_Application, "username");
		WebElement username=driver.findElement(By.cssSelector("input#username"));
		enterData(username, usernameData, "username");
		
		WebElement password=driver.findElement(By.cssSelector("input#password"));
		enterData(password, "", "password");
		
		WebElement clickOnLoginButton=driver.findElement(By.id("Login"));
		clickOnButtonOrBoxes(clickOnLoginButton, "clickOnLoginButton");
		
		WebElement error=driver.findElement(By.cssSelector("div#error"));
		getErrorMessageDisplayed(error, "Please enter your password.");
	}
	
	@Test
	public void TestCase2() {
		login_salesForce();
	}
	
	@Test
	public void TestCase3() {
		
		String usernameData=PropertyUtility.readDataFromFile(Constants.SalesForce_Application, "username");
		String passwordData=PropertyUtility.readDataFromFile(Constants.SalesForce_Application, "password");
		
		WebElement username=driver.findElement(By.cssSelector("input#username"));
		explicitWait(username, 20);
		enterData(username, usernameData, "username");
		
		WebElement password=driver.findElement(By.cssSelector("input#password"));
		explicitWait(password, 20);
		enterData(password, passwordData, "password");
		
		WebElement rememberMe=driver.findElement(By.xpath("//label[text()='Remember me']"));
		explicitWait(rememberMe, 10);
		clickOnButtonOrBoxes(rememberMe, "rememberMe");
		
		WebElement clickOnLoginButton=driver.findElement(By.id("Login"));
		explicitWait(clickOnLoginButton, 30);
		clickOnButtonOrBoxes(clickOnLoginButton, "clickOnLoginButton");
		
		WebElement usermenu=driver.findElement(By.cssSelector("div[id=userNavButton]"));
		explicitWait(usermenu, 30);
		clickOnButtonOrBoxes(usermenu, "usermenu");
		
		WebElement logout=driver.findElement(By.xpath("//a[starts-with(@title,'Log')]"));
		explicitWait(logout, 40);
		clickOnButtonOrLinks(logout, "logout");
		
		WebElement userName=driver.findElement(By.xpath("//div[@id='username_container']/div"));
		explicitWait(userName, 60);
		verifyElementIsDisplay(userName, "katte@tekarch.com", "userName");
		
		WebElement rememberMeChecked=driver.findElement(By.cssSelector("input#rememberUn"));
		explicitWait(rememberMeChecked, 60);
		verifyCheckedElementAreSelected(rememberMeChecked, "rememberMeChecked");
	}
	
	@Test
	public void TestCase4() {
		String usernameData=PropertyUtility.readDataFromFile(Constants.SalesForce_Application, "username");
		WebElement username=driver.findElement(By.cssSelector("input#username"));
		enterData(username, usernameData, "username");
		
		WebElement forgetPasswordLink=driver.findElement(By.xpath("//a[text()='Forgot Your Password?']"));
		clickOnButtonOrLinks(forgetPasswordLink, "forgetPasswordLink");
		
		WebElement username1=driver.findElement(By.xpath("//input[@id='un']"));
		enterData(username1, "usernameData", "username1");
		
		WebElement submit=driver.findElement(By.xpath("//input[@id='continue']"));
		clickOnButtonOrLinks(submit, "submit");
		
		WebElement message=driver.findElement(By.xpath("//div[@class='message']"));
		explicitWait(message, 10);
		getErrorMessageDisplayed(message, "We’ve sent you an email with a link to finish resetting your password. Can’t find the email? Try checking your spam folder. If you still can’t log in, have us resend the email or contact your Salesforce administrator.");
		
	}
	
	@Test
	public void TestCase5() {
		launchBrowser("chrome");
		String url=PropertyUtility.readDataFromFile(Constants.SalesForce_Application, "url");
		getUrl(url);
		
		WebElement username=driver.findElement(By.cssSelector("input#username"));
		enterData(username, "123", "username");
		
		WebElement password=driver.findElement(By.cssSelector("input#password"));
		enterData(password, "22124", "password");
		
		WebElement clickOnLoginButton=driver.findElement(By.id("Login"));
		clickOnButtonOrBoxes(clickOnLoginButton, "clickOnLoginButton");
		
		WebElement error=driver.findElement(By.xpath("//div[@id='error']"));
		getErrorMessageDisplayed(error, "Please check your username and password. If you still can't log in, contact your Salesforce administrator.");
		
		explicitWait(error, 10);
		closeBrowser();
	}

}
