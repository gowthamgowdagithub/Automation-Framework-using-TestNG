package com.training.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.training.Base.BaseLogin;
@Listeners(com.training.Utilities.TestListeners.class)
public class SalesForceAutomationTestCasesForRandomScenarios extends BaseLogin{

	@Test
	public void TestCase33() {
		login_salesForce();
		
		WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));
		explicitWait(home, 10);;
		clickOnButtonOrBoxes(home, "Home");
		getPageTitle("Home Page");
		
		WebElement name=driver.findElement(By.xpath("//h1[@class='currentStatusUserName']/a[text()='Gowtham Gowda Katteri Puttaraju']"));
		explicitWait(name, 10);
		verifyElementIsDisplay(name, "Gowtham Gowda Katteri Puttaraju", "Account holder name");
		identifyItIsLinkOrNot(name, "Account holder name");
		clickOnButtonOrLinks(name, "Profile Name");
		
		WebElement profileOwnerName=driver.findElement(By.xpath("//span[@id='tailBreadcrumbNode']"));
		explicitWait(profileOwnerName, 10);
		verifyElementIsDisplay(profileOwnerName, "Gowtham Gowda Katteri Puttaraju ", "Profile Owner Name");
		
		String profileOwnerPageTitle=driver.getTitle();
		System.out.println("This is profile Owner page title: "+profileOwnerPageTitle);
		
		WebElement userMenu=driver.findElement(By.id("userNavLabel"));
		explicitWait(userMenu, 10);
		verifyElementIsDisplay(userMenu, "Gowtham Gowda ka...", "Username");
		clickOnButtonOrBoxes(userMenu, "User Menu");
		
		WebElement myProfile=driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
		explicitWait(myProfile, 10);
		clickOnButtonOrBoxes(myProfile, "My profile");
		
		String myProfilePageTitle=driver.getTitle();
		System.out.println("This is myProfile page title: "+myProfilePageTitle);
		if(profileOwnerPageTitle.equals(myProfilePageTitle)) {
			System.out.println("The both page and page title are same.");
		}
		else {
			System.out.println("The both page and page title page are not same.");
		}
	}
	
	@Test
	public void TestCase34() {
		login_salesForce();
		
		WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));
		explicitWait(home, 10);;
		clickOnButtonOrBoxes(home, "Home");
		getPageTitle("Home Page");
		
		WebElement name=driver.findElement(By.xpath("//h1[@class='currentStatusUserName']/a[text()='Gowtham Gowda Katteri Puttaraju']"));
		explicitWait(name, 10);
		verifyElementIsDisplay(name, "Gowtham Gowda Katteri Puttaraju", "Account holder name");
		clickOnButtonOrLinks(name, "Profile Name");
		
		WebElement edit=driver.findElement(By.xpath("//img[@title='Edit Profile']"));
		explicitWait(edit, 10);
		clickOnButtonOrBoxes(edit, "Edit");
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']"));
		explicitWait(iframe, 10);
		handleOuterFrame(iframe, "iframe");
		
		WebElement about=driver.findElement(By.xpath("//a[contains(text(),'About')]"));
		explicitWait(about, 10);
		clickOnButtonOrBoxes(about, "About");
		
		WebElement firstname=driver.findElement(By.xpath("//input[@id='firstName']"));
		explicitWait(firstname, 20);
		enterData(firstname, "Gowtham Gowda", "First Name");
		
		WebElement lastName=driver.findElement(By.xpath("//input[@id='lastName']"));
		explicitWait(lastName, 20);
		enterData(lastName, "Abcd", "Last Name");
		
		WebElement saveAll=driver.findElement(By.xpath("//input[@value='Save All']"));
		explicitWait(saveAll, 20);
		clickOnButtonOrBoxes(saveAll, "Save All");
	}
	
	@Test
	public void TestCase35() {
		login_salesForce();
		
		WebElement AllTab=driver.findElement(By.cssSelector(".allTabsArrow"));
		explicitWait(AllTab, 10);
		clickOnButtonOrBoxes(AllTab, "All Tabs");
		
		WebElement customizeMyTab=driver.findElement(By.cssSelector(".btnImportant"));
		explicitWait(customizeMyTab, 10);
		clickOnButtonOrBoxes(customizeMyTab, "Customize My tab");
		
		WebElement select=driver.findElement(By.xpath("//select[@id='duel_select_1']"));
		explicitWait(select, 10);
		selectDataFromDropDownByVisibleText(select, "Chatter");
		
		WebElement remove=driver.findElement(By.cssSelector(".leftArrowIcon"));
		explicitWait(remove, 10);
		clickOnButtonOrBoxes(remove, "Remove");
		
		WebElement save=driver.findElement(By.xpath("//input[@class='btn primary']"));
		explicitWait(save, 10);
		clickOnButtonOrBoxes(save, "Save");
		
		WebElement userMenu=driver.findElement(By.id("userNavLabel"));
		explicitWait(userMenu, 10);
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
	}
	
	@Test
	public void TestCase36() throws AWTException {
		login_salesForce();
		
		WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));
		explicitWait(home, 10);
		clickOnButtonOrBoxes(home, "Home");
		
		WebElement date=driver.findElement(By.xpath("//a[text()='Tuesday 18 June 2024']"));
		explicitWait(date, 10);
		clickOnButtonOrBoxes(date, "Date");
		
		WebElement event=driver.findElement(By.xpath("//a[contains(text(),'8:00 pm')]"));
		explicitWait(event, 10);
		clickOnButtonOrBoxes(event, "Event");
		
//		WebElement subjectCombo=driver.findElement(By.xpath("//a/img[@title='Subject Combo (New Window)']"));
//		explicitWait(subjectCombo, 30);
//		clickOnButtonOrBoxes(subjectCombo, "Subject combo icon");
		
		WebElement subject=driver.findElement(By.xpath("//input[@id='evt5']"));
		explicitWait(subject, 20);
		enterData(subject, "Other", "Subject");
		
		WebElement endTime=driver.findElement(By.xpath("//input[@id='EndDateTime_time']"));
		explicitWait(endTime, 10);
		clickOnButtonOrBoxes(endTime, "EndTime");
		
		WebElement time=driver.findElement(By.xpath("//div[@id='timePickerItem_42']"));
		explicitWait(time, 10);
		clickOnButtonOrBoxes(time, "End Time");
		
		WebElement save=driver.findElement(By.xpath("//input[@value=' Save ']"));
		explicitWait(save, 10);
		clickOnButtonOrBoxes(save, "save");
	}
	
	@Test
	public void TestCase37() {
		login_salesForce();
		
		WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));
		explicitWait(home, 10);
		clickOnButtonOrBoxes(home, "Home");
		
		WebElement date=driver.findElement(By.xpath("//a[text()='Tuesday 18 June 2024']"));
		explicitWait(date, 10);
		clickOnButtonOrBoxes(date, "Date");
		
		WebElement event=driver.findElement(By.xpath("//a[contains(text(),'4:00 pm')]"));
		explicitWait(event, 10);
		clickOnButtonOrLinks(event, "Event");
		
//		WebElement subjectCombo=driver.findElement(By.xpath("//a/img[@title='Subject Combo (New Window)']"));
//		explicitWait(subjectCombo, 30);
//		clickOnButtonOrBoxes(subjectCombo, "Subject combo icon");
		
		WebElement subject=driver.findElement(By.xpath("//input[@id='evt5']"));
		explicitWait(subject, 20);
		enterData(subject, "Other", "Subject");
		
		WebElement endTime=driver.findElement(By.xpath("//input[@id='EndDateTime_time']"));
		explicitWait(endTime, 10);
		clickOnButtonOrBoxes(endTime, "EndTime");
		
		WebElement requiredTime=driver.findElement(By.xpath("//div[@id='timePickerItem_38']"));
		explicitWait(requiredTime, 10);
		clickOnButtonOrBoxes(requiredTime, "Required Time");
		
		WebElement recurrence=driver.findElement(By.xpath("//input[@id='IsRecurrence']"));
		explicitWait(recurrence, 10);
		clickOnButtonOrBoxes(recurrence, "Recurrence");
		
		WebElement weekly=driver.findElement(By.xpath("//label[text()='Weekly']"));
		explicitWait(weekly, 10);
		clickOnButtonOrBoxes(weekly, "Weekly event");
		
		WebElement endDate=driver.findElement(By.xpath("//input[@id='RecurrenceEndDateOnly']"));
		explicitWait(endDate, 10);
		clickOnButtonOrBoxes(endDate, "End Date");
		
		WebElement selectdate=driver.findElement(By.xpath("//table[@class='calDays']/tbody/tr[7]/td[3]"));
		explicitWait(selectdate, 10);
		clickOnButtonOrBoxes(selectdate, "Selected date");
		
		WebElement save=driver.findElement(By.xpath("//input[@title='Save']"));
		explicitWait(save, 10);
		clickOnButtonOrBoxes(save, "Save button");
		
		WebElement monthlyView=driver.findElement(By.xpath("//span[@class='dwmIcons']/a[3]"));
		explicitWait(monthlyView, 40);
		clickOnButtonOrBoxes(monthlyView, "Monthly view icon");
	}
}
