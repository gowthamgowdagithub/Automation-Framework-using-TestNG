package com.training.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.training.Base.BaseLogin;
@Listeners(com.training.Utilities.TestListeners.class)
public class SalesForceAutomationTestCasesForLeads extends BaseLogin {

	
	@Test
	public void TestCase20() {
		login_salesForce();
		
		WebElement clickOnLeads=driver.findElement(By.xpath("//a[text()='Leads']"));
		explicitWait(clickOnLeads, 10);;
		clickOnButtonOrLinks(clickOnLeads, "Leads");
		
		WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));
		explicitWait(home, 10);
		clickOnButtonOrBoxes(home, "Home");
		
		WebElement userMenu=driver.findElement(By.id("userNavLabel"));
		explicitWait(userMenu, 10);
		verifyElementIsDisplay(userMenu, "Gowtham Gowda ka...", "Username");
		clickOnButtonOrBoxes(userMenu, "User Menu");
		
		WebElement logout=driver.findElement(By.xpath("//a[text()='Logout']"));
		explicitWait(logout, 10);
		clickOnButtonOrLinks(logout, "Logout");
	}
	
	@Test
	public void TestCase21() {
		login_salesForce();
		
		WebElement clickOnLeads=driver.findElement(By.xpath("//a[text()='Leads']"));
		explicitWait(clickOnLeads, 10);;
		clickOnButtonOrLinks(clickOnLeads, "Leads");
		
		WebElement listOfLead=driver.findElement(By.xpath("//select[@id='fcf']"));
		explicitWait(listOfLead, 10);
		clickOnButtonOrBoxes(listOfLead, "List of leads");
		getVisibleText(listOfLead);
	}
	
	@Test
	public void TestCase22() {
		login_salesForce();
		
		WebElement clickOnLeads=driver.findElement(By.xpath("//a[text()='Leads']"));
		explicitWait(clickOnLeads, 10);;
		clickOnButtonOrLinks(clickOnLeads, "Leads");
		
		WebElement listOfLead=driver.findElement(By.xpath("//select[@id='fcf']"));
		explicitWait(listOfLead, 10);
		selectDataFromDropDownByVisibleText(listOfLead, "Today's Leads");
		
		WebElement userMenu=driver.findElement(By.id("userNavLabel"));
		explicitWait(userMenu, 10);
		verifyElementIsDisplay(userMenu, "Gowtham Gowda ka...", "Username");
		clickOnButtonOrBoxes(userMenu, "User Menu");
		
		WebElement logout=driver.findElement(By.xpath("//a[text()='Logout']"));
		explicitWait(logout, 10);
		clickOnButtonOrLinks(logout, "Logout");
		
		WebElement email=driver.findElement(By.cssSelector("input#username"));
		explicitWait(email, 10);
		enterData(email, "katte@tekarch.com", "Email");		
		
		WebElement password=driver.findElement(By.cssSelector("input#password"));
		explicitWait(password, 10);
		enterData(password, "@dummu$G879", "Password");
		
		WebElement clickOnLoginButton=driver.findElement(By.id("Login"));
		clickOnButtonOrBoxes(clickOnLoginButton, "clickOnLoginButton");
		
		WebElement clickOnLeads1=driver.findElement(By.xpath("//a[text()='Leads']"));
		explicitWait(clickOnLeads1, 10);;
		clickOnButtonOrLinks(clickOnLeads1, "Leads");
		
		WebElement goButton=driver.findElement(By.xpath("//input[@value=' Go! ']"));
		explicitWait(goButton, 10);
		clickOnButtonOrBoxes(goButton, "Go Button");
		
		WebElement leadsLists=driver.findElement(By.id("00BIU00000CO0sY_listSelect"));
		explicitWait(leadsLists, 10);
		getPageTitle("Lead Page view");
		getSelectedOption(leadsLists);
	}
	
	@Test
	public void TestCase23() {
		login_salesForce();
		
		WebElement clickOnLeads=driver.findElement(By.xpath("//a[text()='Leads']"));
		explicitWait(clickOnLeads, 10);;
		clickOnButtonOrLinks(clickOnLeads, "Leads");
		
		WebElement listOfLead=driver.findElement(By.xpath("//select[@id='fcf']"));
		explicitWait(listOfLead, 10);
		selectDataFromDropDownByVisibleText(listOfLead, "Today's Leads");
		
		WebElement goButton=driver.findElement(By.xpath("//input[@value=' Go! ']"));
		explicitWait(goButton, 10);
		clickOnButtonOrBoxes(goButton, "Go Button");
		
		WebElement leadsLists=driver.findElement(By.id("00BIU00000CO0sY_listSelect"));
		explicitWait(leadsLists, 10);
		getPageTitle("Lead Page view");
		getSelectedOption(leadsLists);
	}
	
	@Test
	public void TestCase24() {
		login_salesForce();
		
		WebElement clickOnLeads=driver.findElement(By.xpath("//a[text()='Leads']"));
		explicitWait(clickOnLeads, 10);;
		clickOnButtonOrLinks(clickOnLeads, "Leads");
		
		WebElement clickOnNew=driver.findElement(By.xpath("//input[@value=' New ']"));
		explicitWait(clickOnNew, 10);
		clickOnButtonOrBoxes(clickOnNew, "New Button");
		
		getPageTitle("New Lead Creation page");
		
		WebElement lastName=driver.findElement(By.xpath("//input[@id='name_lastlea2']"));
		explicitWait(lastName, 10);
		enterData(lastName, "ABCD", "Last Name");
		getVisibleText(lastName);
		
		WebElement companyName=driver.findElement(By.xpath("//input[@id='lea3']"));
		explicitWait(companyName, 10);
		enterData(companyName, "ABCD", "Company Name");
		getVisibleText(companyName);
		
		WebElement save=driver.findElement(By.xpath("//input[@title='Save']"));
		explicitWait(save, 10);
		clickOnButtonOrBoxes(save, "Save Button");
		
		WebElement newLeadPage=driver.findElement(By.xpath("//h2[@class='topName']"));
		explicitWait(newLeadPage, 10);
		getVisibleText(newLeadPage);
		getPageTitle("Newly Created Lead Page");
	}
}
