package com.training.Test;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.training.Base.BaseLogin;
import com.training.Utilities.Log4j2Utility;
@Listeners(com.training.Utilities.TestListeners.class)
public class SalesForceAutomationTestCaseForUserMenu extends BaseLogin{
Logger mylogger=Log4j2Utility.getLogger(SalesForceAutomationTestCaseForUserMenu.class);
	@Test
	public void TestCase5() {
		login_salesForce();
		WebElement userMenu=driver.findElement(By.id("userNavLabel"));
		explicitWait(userMenu, 10);
		verifyElementIsDisplay(userMenu, "Gowtham Gowda ka...", "Username");
		clickOnButtonOrBoxes(userMenu, "User Menu");
		
		WebElement userMenuDropDownText=driver.findElement(By.xpath("//div[@id='userNavMenu']"));
		explicitWait(userMenuDropDownText, 10);
		getVisibleText(userMenuDropDownText);
	}
	
	@Test
	public void TestCase6(){
		login_salesForce();
		
		WebElement userMenu=driver.findElement(By.id("userNavLabel"));
		explicitWait(userMenu, 10);
		verifyElementIsDisplay(userMenu, "Gowtham Gowda ka...", "Username");
		clickOnButtonOrBoxes(userMenu, "User Menu");
		
		WebElement userMenuDropDownText=driver.findElement(By.xpath("//div[@id='userNavMenu']"));
		explicitWait(userMenuDropDownText, 10);
		getVisibleText(userMenuDropDownText);
		
		WebElement myProfile=driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
		explicitWait(myProfile, 10);
		clickOnButtonOrBoxes(myProfile, "My profile");
		
		WebElement clickOnEdit=driver.findElement(By.xpath("//img[@title='Edit Profile']"));
		explicitWait(clickOnEdit, 10);
		clickOnButtonOrLinks(clickOnEdit, "Click on edit");
		
		WebElement contactInfo=driver.findElement(By.id("contactInfoContentId"));
		explicitWait(contactInfo, 10);
		handleOuterFrame(contactInfo, "contact info");
		
		WebElement clickOnAbout=driver.findElement(By.xpath("//a[contains(text(),'About')]"));
		explicitWait(clickOnAbout, 10);
		clickOnButtonOrLinks(clickOnAbout, "click on about");
		
		WebElement lastname=driver.findElement(By.xpath("//input[@id='lastName']"));
		explicitWait(lastname, 10);
		enterData(lastname, "Katteri Puttaraju", "Last Name");
		
		WebElement saveall=driver.findElement(By.xpath("//input[@value='Save All']"));
		explicitWait(saveall, 10);
		clickOnButtonOrLinks(saveall, "Save all");
		
		WebElement nameConfimation=driver.findElement(By.id("tailBreadcrumbNode"));
		explicitWait(nameConfimation, 10);
		verifyElementIsDisplay(nameConfimation, "Gowtham Gowda Katteri Puttaraju", "Name confirmation");
		
		WebElement post=driver.findElement(By.xpath("//span[text()='Post']"));
		explicitWait(post, 20);
		clickOnButtonOrBoxes(post, "Post");
		
		WebElement clickOnPost=driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		explicitWait(clickOnPost, 10);
		handleOuterFrame(clickOnPost, "click on post");
		
		WebElement enterText=driver.findElement(By.xpath("//body[contains(text(),'Share an update, @mention someone...')]"));
		explicitWait(enterText, 10);
		enterData(enterText, "This is katte gowda", "Entered text");
		getBackToDOM();
		
		WebElement clickOnShare=driver.findElement(By.xpath("//input[@title='Share']"));
		explicitWait(clickOnShare, 10);
		clickOnButtonOrBoxes(clickOnShare, "Share");
		
		WebElement visibleText=driver.findElement(By.xpath("//p[text()='This is katte gowda']"));
		explicitWait(visibleText, 20);
		verifyElementIsDisplay(visibleText, "This is katte gowda", "Entered Data");
		
		WebElement file=driver.findElement(By.xpath("//span[text()='File']"));
		explicitWait(file, 20);
		clickOnButtonOrLinks(file, "File");
		
		WebElement clickOnUploadFile=driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']"));
		explicitWait(clickOnUploadFile, 30);
		clickOnButtonOrLinks(clickOnUploadFile, "Click on the upload file from computer");
		
		WebElement chooseFile=driver.findElement(By.xpath("//input[@id='chatterFile']"));
		explicitWait(chooseFile, 40);
		fileUpload(chooseFile, "C:\\Users\\Gowtham\\Downloads\\SFDC 37 Testcases.xlsx");
		
		WebElement share=driver.findElement(By.xpath("//input[@value='Share']"));
		explicitWait(share, 40);
		clickOnButtonOrBoxes(share, "Share button");
		
		WebElement addPhoto=driver.findElement(By.xpath("//a[text()='Add Photo']"));
		explicitWait(addPhoto, 30);
		performAction(addPhoto, "Add Photo");
		clickOnButtonOrLinks(addPhoto, "Add photo");
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@id='uploadPhotoContentId']"));
		explicitWait(frame, 30);
		handleOuterFrame(frame, "Frame");
		
		WebElement chooseFile1=driver.findElement(By.xpath("//input[@class='fileInput']"));
		explicitWait(chooseFile1, 40);
		fileUpload(chooseFile1, "C:\\Users\\Gowtham\\Desktop\\IMG_20210805_222821.jpg");
		
		WebElement clickOnSave=driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:save' and @name='j_id0:uploadFileForm:save']"));
		explicitWait(clickOnSave, 60);
		clickOnButtonOrBoxes(clickOnSave, "Clicked on save");
		
		WebElement click=driver.findElement(By.xpath("//input[@name='j_id0:j_id7:save']"));
		explicitWait(click, 60);
		clickOnButtonOrBoxes(click, "clicked");
		
		getBackToDOM();
	}
	
	@Test
	public void TestCase7() {
		login_salesForce();
		
		WebElement userMenu=driver.findElement(By.id("userNavLabel"));
		explicitWait(userMenu, 10);
		verifyElementIsDisplay(userMenu, "Gowtham Gowda ka...", "Username");
		clickOnButtonOrBoxes(userMenu, "User Menu");
		
		WebElement userMenuDropDownText=driver.findElement(By.xpath("//div[@id='userNavMenu']"));
		explicitWait(userMenuDropDownText, 10);
		getVisibleText(userMenuDropDownText);
		
		WebElement mySettings=driver.findElement(By.xpath("//a[text()='My Settings']"));
		explicitWait(mySettings, 10);
		clickOnButtonOrLinks(mySettings, "My settings");
		
		WebElement personal=driver.findElement(By.xpath("//span[@id='PersonalInfo_font']"));
		explicitWait(personal, 10);
		clickOnButtonOrLinks(personal, "Personal Link");
		
		WebElement loginHistory=driver.findElement(By.xpath("//span[@id='LoginHistory_font']"));
		explicitWait(loginHistory, 10);
		clickOnButtonOrBoxes(loginHistory, "Login History");
		
		WebElement DownloadloginHistory=driver.findElement(By.xpath("//a[contains(text(),'Download login history')]"));
		explicitWait(DownloadloginHistory, 10);
		clickOnButtonOrLinks(DownloadloginHistory, "Downlaod Login History");
		getPageTitle("Login History");
		
		WebElement DisplayAndLayout=driver.findElement(By.xpath("//span[text()='Display & Layout']"));
		explicitWait(DisplayAndLayout, 10);
		clickOnButtonOrBoxes(DisplayAndLayout, "Display and Layout");
		
		WebElement customizeMyTab=driver.findElement(By.xpath("//span[@id='CustomizeTabs_font']"));
		explicitWait(customizeMyTab, 10);
		clickOnButtonOrLinks(customizeMyTab, "Customize my tab");
		
		WebElement select=driver.findElement(By.xpath("//select[@id='duel_select_0']"));
		explicitWait(select, 10);
		selectDataFromDropDownByVisibleText(select, "Chatter");
		
		WebElement clickOnAdd=driver.findElement(By.xpath("//img[@title='Add']"));
		explicitWait(clickOnAdd, 10);
		clickOnButtonOrBoxes(clickOnAdd, "Clicked On Add");
		
		WebElement save=driver.findElement(By.xpath("//input[@class='btn primary']"));
		explicitWait(save, 10);
		clickOnButtonOrBoxes(save, "Save");
		
		WebElement chatter=driver.findElement(By.xpath("//a[text()='Chatter']"));
		explicitWait(chatter, 10);
		verifyElementIsDisplay(chatter, "Chatter", "Chatter");
		
		WebElement email=driver.findElement(By.xpath("//span[@id='EmailSetup_font']"));
		explicitWait(email, 10);
		clickOnButtonOrLinks(email, "Email");
		
		WebElement emailSettings=driver.findElement(By.xpath("//span[@id='EmailSettings_font']"));
		explicitWait(emailSettings, 10);
		clickOnButtonOrLinks(emailSettings, "My email settins");
		
		WebElement emailName=driver.findElement(By.xpath("//input[@name='sender_name']"));
		explicitWait(emailName, 10);
		enterData(emailName, "Gowtham Gowda Katteri Puttaraju", "Email Name");
		
		WebElement emailAddress=driver.findElement(By.xpath("//input[@name='sender_email']"));
		explicitWait(emailAddress, 10);
		enterData(emailAddress, "gowthamgowda2000@gmail.com", "Email Address");
		
		WebElement AutomaticBCC=driver.findElement(By.xpath("//label[text()='Yes']"));
		explicitWait(AutomaticBCC, 10);
		clickOnButtonOrBoxes(AutomaticBCC, "Automatic BCC");
		
		WebElement saveall=driver.findElement(By.xpath("//input[@name='save']"));
		explicitWait(saveall, 10);
		clickOnButtonOrLinks(saveall, "Save");
		
		getPageTitle("Email My Settings");
		
		WebElement calendar=driver.findElement(By.id("CalendarAndReminders_font"));
		explicitWait(calendar, 10);
		clickOnButtonOrLinks(calendar, "calendar");
		
		WebElement ActivityRemainder=driver.findElement(By.xpath("//span[text()='Activity Reminders']"));
		explicitWait(ActivityRemainder, 10);
		clickOnButtonOrBoxes(ActivityRemainder, "Activity Remainder");
		
		WebElement openTestRemainder=driver.findElement(By.xpath("//input[@title='Open a Test Reminder']"));
		explicitWait(openTestRemainder, 10);
		clickOnButtonOrBoxes(openTestRemainder, "Open a test remainder");
		
		getPageTitle("Pop-up page");
	}
	
	@Test
	public void TestCase8() {
		login_salesForce();
		
		WebElement userMenu=driver.findElement(By.id("userNavLabel"));
		explicitWait(userMenu, 10);
		verifyElementIsDisplay(userMenu, "Gowtham Gowda ka...", "Username");
		clickOnButtonOrBoxes(userMenu, "User Menu");
		
		WebElement userMenuDropDownText=driver.findElement(By.xpath("//div[@id='userNavMenu']"));
		explicitWait(userMenuDropDownText, 10);
		getVisibleText(userMenuDropDownText);
		
		WebElement developerConsole=driver.findElement(By.xpath("//a[contains(text(),'Developer Console')]"));
		explicitWait(developerConsole, 10);
		clickOnButtonOrLinks(developerConsole, "Developer console");
		
		getPageTitle("Developer console");
	}
	
	@Test
	public void TestCase9() {
		login_salesForce();
		
		WebElement userMenu=driver.findElement(By.id("userNavLabel"));
		explicitWait(userMenu, 10);
		verifyElementIsDisplay(userMenu, "Gowtham Gowda ka...", "Username");
		clickOnButtonOrBoxes(userMenu, "User Menu");
		
		WebElement userMenuDropDownText=driver.findElement(By.xpath("//div[@id='userNavMenu']"));
		explicitWait(userMenuDropDownText, 10);
		getVisibleText(userMenuDropDownText);
		
		WebElement logout=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		explicitWait(logout, 10);
		clickOnButtonOrBoxes(logout, "Logout");
		
		getPageTitle("Login Page");
		getCurrentURL("https://login.salesforce.com/");
	}
	
}
