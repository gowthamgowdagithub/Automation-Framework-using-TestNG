package com.training.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.training.Base.BaseLogin;
@Listeners(com.training.Utilities.TestListeners.class)
public class SalesForceAutomationTestCasesForContacts extends BaseLogin {

	@Test
	public void TestCase25() {
		login_salesForce();
		
		WebElement contacts=driver.findElement(By.xpath("//a[text()='Contacts']"));
		explicitWait(contacts, 10);
		clickOnButtonOrLinks(contacts, "Contacts");
		getPageTitle("Contacts Page");
		
		WebElement newButton=driver.findElement(By.xpath("//input[@value=' New ']"));
		explicitWait(newButton, 10);
		clickOnButtonOrBoxes(newButton, "New button");
		
		WebElement lastName=driver.findElement(By.cssSelector("#name_lastcon2"));
		explicitWait(lastName, 10);
		enterData(lastName, "karthi", "Last name");
		
		WebElement accountName=driver.findElement(By.cssSelector("#con4"));
		explicitWait(accountName, 10);
		enterData(accountName, "May2024", "Account Name");
		
		WebElement save=driver.findElement(By.xpath("//input[@title='Save']"));
		explicitWait(save, 10);
		clickOnButtonOrBoxes(save, "Save");
		
		WebElement newlyCreatedAccount=driver.findElement(By.xpath("//h2[contains(text(),'karthi')]"));
		explicitWait(newlyCreatedAccount, 10);
		verifyElementIsDisplay(newlyCreatedAccount, " karthi ", "Newly Created Account Name");
		identifyRequiredElementFound(newlyCreatedAccount, "karthi");
		getPageTitle("Newly Created Account Page");
	}
	
	@Test
	public void TestCase26() {
		login_salesForce();
		
		WebElement contacts=driver.findElement(By.xpath("//a[text()='Contacts']"));
		explicitWait(contacts, 10);
		clickOnButtonOrLinks(contacts, "Contacts");
		getPageTitle("Contacts Page");
		
		WebElement clickOnNew=driver.findElement(By.xpath("//a[text()='Create New View']"));
		explicitWait(clickOnNew, 10);
		clickOnButtonOrLinks(clickOnNew, "Click on view");
		getPageTitle("New View Page");
		WebElement pageName=driver.findElement(By.cssSelector(".pageDescription"));
		explicitWait(pageName, 10);
		getVisibleText(pageName);
		
		WebElement viewName=driver.findElement(By.xpath("//input[@id='fname']"));
		explicitWait(viewName, 10);
		enterData(viewName, "Amar", "View Name");
		
		WebElement uniqueName=driver.findElement(By.xpath("//input[@id='devname']"));
		explicitWait(uniqueName, 10);
		enterData(uniqueName, "Amar", "Unique Name");
		
		WebElement save=driver.findElement(By.xpath("//input[@title='Save']"));
		explicitWait(save, 20);
		clickOnButtonOrLinks(save, "Save");
		
		WebElement contactsDropdown=driver.findElement(By.xpath("//select[@id='00BIU00000CKTTn_listSelect']"));
		explicitWait(contactsDropdown, 60);
		clickOnButtonOrBoxes(contactsDropdown, "Contacts");
		getVisibleText(contactsDropdown);
		getSelectedOption(contactsDropdown);
	}
	
	@Test
	public void TestCase27() {
		login_salesForce();
		
		WebElement contacts=driver.findElement(By.xpath("//a[text()='Contacts']"));
		explicitWait(contacts, 10);
		clickOnButtonOrLinks(contacts, "Contacts");
		getPageTitle("Contacts Page");
		
		WebElement recentlyCreated=driver.findElement(By.cssSelector("#hotlist_mode"));
		explicitWait(recentlyCreated, 10);
		selectDataFromDropDownByVisibleText(recentlyCreated, "Recently Created");
		getVisibleText(recentlyCreated);
	}
	
	@Test
	public void TestCase28() {
		login_salesForce();
		
		WebElement contacts=driver.findElement(By.xpath("//a[text()='Contacts']"));
		explicitWait(contacts, 10);
		clickOnButtonOrLinks(contacts, "Contacts");
		getPageTitle("Contacts Page");
		
		WebElement contactsDropDown=driver.findElement(By.xpath("//select[@id='fcf']"));
		explicitWait(contactsDropDown, 10);
		selectDataFromDropDownByVisibleText(contactsDropDown, "My Contacts");
		
		getPageTitle("My contacts page");
		getSelectedOption(contactsDropDown);
	}
	
	@Test
	public void TestCase29() {
		login_salesForce();
		
		WebElement contacts=driver.findElement(By.xpath("//a[text()='Contacts']"));
		explicitWait(contacts, 10);
		clickOnButtonOrLinks(contacts, "Contacts");
		getPageTitle("Contacts Page");
		
		WebElement clickOnContactName=driver.findElement(By.xpath("//table[@class='list']/tbody/tr[2]/th/a[text()='karthi']"));
		explicitWait(clickOnContactName, 10);
		clickOnButtonOrLinks(clickOnContactName, "Contact name");
		
		WebElement pagename=driver.findElement(By.xpath("//h2[@class='topName']"));
		explicitWait(pagename, 10);
		verifyElementIsDisplay(pagename, "karthi", "page name");
		getPageTitle("contact page of a selected account");
		
	}
	
	@Test
	public void TestCase30() {
		login_salesForce();
		
		WebElement contacts=driver.findElement(By.xpath("//a[text()='Contacts']"));
		explicitWait(contacts, 10);
		clickOnButtonOrLinks(contacts, "Contacts");
		getPageTitle("Contacts Page");
		
		WebElement clickOnNew=driver.findElement(By.xpath("//a[text()='Create New View']"));
		explicitWait(clickOnNew, 10);
		clickOnButtonOrLinks(clickOnNew, "Click on view");
		getPageTitle("New View Page");
		
		WebElement uniqueName=driver.findElement(By.xpath("//input[@id='devname']"));
		explicitWait(uniqueName, 10);
		enterData(uniqueName, "EFGH", "Unique Name");
		
		WebElement save=driver.findElement(By.xpath("//input[@title='Save']"));
		explicitWait(save, 20);
		clickOnButtonOrLinks(save, "Save");
		
		WebElement errorMessage=driver.findElement(By.xpath("//div[text()=' You must enter a value']"));
		explicitWait(errorMessage, 10);
		getErrorMessageDisplayed(errorMessage, "Error: You must enter a value");
	}
	
	@Test
	public void TestCase31() {
		login_salesForce();
		
		WebElement contacts=driver.findElement(By.xpath("//a[text()='Contacts']"));
		explicitWait(contacts, 10);
		clickOnButtonOrLinks(contacts, "Contacts");
		getPageTitle("Contacts Page");
		
		WebElement clickOnNew=driver.findElement(By.xpath("//a[text()='Create New View']"));
		explicitWait(clickOnNew, 10);
		clickOnButtonOrLinks(clickOnNew, "Click on view");
		getPageTitle("New View Page");
		
		WebElement viewName=driver.findElement(By.xpath("//input[@id='fname']"));
		explicitWait(viewName, 10);
		enterData(viewName, "ABCD", "View Name");
		
		WebElement uniqueName=driver.findElement(By.xpath("//input[@id='devname']"));
		explicitWait(uniqueName, 10);
		enterData(uniqueName, "EFGH", "Unique Name");
		
		WebElement cancel=driver.findElement(By.xpath("//input[@value='Cancel']"));
		explicitWait(cancel, 10);
		clickOnButtonOrBoxes(cancel, "Cancel");
		
		WebElement contactsPage=driver.findElement(By.xpath("//select[@id='fcf']"));
		explicitWait(contactsPage, 10);
		getVisibleText(contactsPage);
		identifyRequiredElementFound(contactsPage, "ABCD");	
	}
	
	@Test
	public void TestCase32() {
		login_salesForce();
		
		WebElement contacts=driver.findElement(By.xpath("//a[text()='Contacts']"));
		explicitWait(contacts, 10);
		clickOnButtonOrLinks(contacts, "Contacts");
		getPageTitle("Contacts Page");
		
		WebElement newButton=driver.findElement(By.xpath("//input[@value=' New ']"));
		explicitWait(newButton, 10);
		clickOnButtonOrBoxes(newButton, "New button");
		
		WebElement lastName=driver.findElement(By.cssSelector("#name_lastcon2"));
		explicitWait(lastName, 10);
		enterData(lastName, "Indian", "Last name");
		
		WebElement accountName=driver.findElement(By.cssSelector("#con4"));
		explicitWait(accountName, 10);
		enterData(accountName, "Global Media", "Account Name");
		
		WebElement clickSaveAndNew=driver.findElement(By.xpath("//input[@value='Save & New']"));
		explicitWait(clickSaveAndNew, 10);
		clickOnButtonOrBoxes(clickSaveAndNew, "Save and New button");
	}
}
