package com.training.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.training.Base.BaseLogin;
@Listeners(com.training.Utilities.TestListeners.class)
public class SalesForceAutomationTestCasesForCreateAccount extends BaseLogin {
	
	@Test
	public void TestCase10() {
		login_salesForce();
		
		WebElement accounts=driver.findElement(By.xpath("//a[text()='Accounts']"));
		explicitWait(accounts, 10);
		clickOnButtonOrLinks(accounts, "Accounts");
		
		WebElement newButton=driver.findElement(By.xpath("//input[@name='new']"));
		explicitWait(newButton, 10);
		clickOnButtonOrBoxes(newButton, "New Button");
		
		WebElement accountName=driver.findElement(By.xpath("//input[@id='acc2']"));
		explicitWait(accountName, 10);
		enterData(accountName, "Gowda", "Account Name");
		
		WebElement type=driver.findElement(By.xpath("//select[@id='acc6']"));
		explicitWait(type, 10);
		selectDataFromDropDownByVisibleText(type, "Technology Partner");
		
		WebElement priority=driver.findElement(By.xpath("//select[@id='00NIU00000L2fom']"));
		explicitWait(priority, 10);
		selectDataFromDropDownUsingValue(priority, "High");
		
		WebElement save=driver.findElement(By.xpath("//input[@value=' Save ']"));
		explicitWait(save, 10);
		clickOnButtonOrBoxes(save, "Save");
		
		WebElement account=driver.findElement(By.xpath("//h2[@class='topName']"));
		explicitWait(account, 10);
		verifyElementIsDisplay(account, "Gowda", "Account Name");
		getPageTitle("Account created page");
	}
	
	@Test
	public void TestCase11() {
		login_salesForce();
		
		WebElement accounts=driver.findElement(By.xpath("//a[text()='Accounts']"));
		explicitWait(accounts, 10);
		clickOnButtonOrLinks(accounts, "Accounts");
		
		WebElement createNewView=driver.findElement(By.xpath("//a[text()='Create New View']"));
		explicitWait(createNewView, 10);
		clickOnButtonOrLinks(createNewView, "Create new view");
		
		WebElement viewName=driver.findElement(By.xpath("//input[@id='fname']"));
		explicitWait(viewName, 10);
		enterData(viewName, "katte", "View name");
		
		WebElement viewUniqueName=driver.findElement(By.xpath("//input[@id='devname']"));
		explicitWait(viewUniqueName, 10);
		enterData(viewUniqueName, "katte", "View Unique name");
		
		WebElement save=driver.findElement(By.xpath("//input[@value=' Save ']"));
		explicitWait(save, 10);
		clickOnButtonOrLinks(save, "Save");
		
		WebElement accountViewList=driver.findElement(By.xpath("//select[@id='fcf']"));
		explicitWait(accountViewList, 10);
		verifyElementIsDisplay(accountViewList, "katte", "Account view list");
	}
	
	@Test
	public void TestCase12() {
		login_salesForce();
		
		WebElement accounts=driver.findElement(By.xpath("//a[text()='Accounts']"));
		explicitWait(accounts, 10);
		clickOnButtonOrLinks(accounts, "Accounts");
		
		WebElement accountViewList=driver.findElement(By.xpath("//select[@id='fcf']"));
		explicitWait(accountViewList, 10);
		selectDataFromDropDownByVisibleText(accountViewList, "katte");
		
		WebElement edit=driver.findElement(By.xpath("//a[text()='Edit']"));
		explicitWait(edit, 10);
		clickOnButtonOrLinks(edit, "Edit");
		
		getPageTitle("Edit View page name");
		
		WebElement pageName=driver.findElement(By.className("pageDescription"));
		explicitWait(pageName, 10);
		verifyElementIsDisplay(pageName, "Edit View", "Edit");
		
		WebElement viewName=driver.findElement(By.xpath("//input[@id='fname']"));
		explicitWait(viewName, 10);
		enterData(viewName, "katteG", "View name");
		
		WebElement field=driver.findElement(By.xpath("//select[@id='fcol1']"));
		explicitWait(field, 10);
		selectDataFromDropDownByVisibleText(field, "Account Name");
		
		WebElement operator=driver.findElement(By.xpath("//select[@id='fop1']"));
		explicitWait(operator, 10);
		selectDataFromDropDownByVisibleText(operator, "contains");
		
		WebElement value=driver.findElement(By.xpath("//input[@id='fval1']"));
		explicitWait(value, 10);
		enterData(value, "a", "Value");
		
		WebElement save=driver.findElement(By.xpath("//input[@name='save']"));
		explicitWait(save, 10);
		clickOnButtonOrBoxes(save, "Save");
		
		WebElement viewname=driver.findElement(By.id("00BIU00000CKTNp_listSelect"));
		explicitWait(viewname, 10);
		verifyElementIsDisplay(viewname, "katteG", "View Name");
		
		WebElement tables=driver.findElement(By.xpath("//table[@class='x-grid3-row-table']"));
		handleTables(tables, "//table/tbody", "//tr/td");
	}
	 
	@Test
	public void TestCase13() {
		login_salesForce();
		
		WebElement accounts=driver.findElement(By.xpath("//a[text()='Accounts']"));
		explicitWait(accounts, 10);
		clickOnButtonOrLinks(accounts, "Accounts");
		
		WebElement merge=driver.findElement(By.xpath("//a[text()='Merge Accounts']"));
		explicitWait(merge, 10);
		clickOnButtonOrLinks(merge, "Merge");
		
		WebElement find=driver.findElement(By.xpath("//input[@id='srch']"));
		explicitWait(find, 10);
		enterData(find, "gowda", "Find Accounts");
		
		WebElement Findaccounts=driver.findElement(By.xpath("//input[@name='srchbutton']"));
		explicitWait(Findaccounts, 10);
		clickOnButtonOrBoxes(Findaccounts, "Find Accounts");
		
		WebElement table1row1=driver.findElement(By.xpath("//table[@class='list']/tbody/tr[2]/th"));
		explicitWait(table1row1, 10);
		clickOnButtonOrBoxes(table1row1, "Row1");
		
		WebElement table2row2=driver.findElement(By.xpath("//table[@class='list']/tbody/tr[3]/th"));
		explicitWait(table2row2, 10);
		clickOnButtonOrBoxes(table2row2, "Row2");
		
		WebElement next=driver.findElement(By.xpath("//input[@value=' Next ']"));
		explicitWait(next, 10);
		clickOnButtonOrBoxes(next, "Next");
		
		WebElement mergeAccounts=driver.findElement(By.xpath("//input[@value=' Merge ']"));
		explicitWait(mergeAccounts, 10);
		clickOnButtonOrBoxes(mergeAccounts, "Merge Accounts");
		
		windowAlert();
		
		WebElement recentView=driver.findElement(By.xpath("//select[@id='hotlist_mode']"));
		explicitWait(recentView, 10);
		selectDataFromDropDownByVisibleText(recentView, "Recently Viewed");	
	}
	
	@Test
	public void TestCase14() {
		login_salesForce();
		
		WebElement accounts=driver.findElement(By.xpath("//a[text()='Accounts']"));
		explicitWait(accounts, 10);
		clickOnButtonOrLinks(accounts, "Accounts");
		
		WebElement AccountHistory=driver.findElement(By.xpath("//a[text()='Accounts with last activity > 30 days']"));
		explicitWait(AccountHistory, 10);
		clickOnButtonOrLinks(AccountHistory, "Account History");
		
		getPageTitle("Unsaved Report Page");
		
		WebElement unsavedReport=driver.findElement(By.xpath("//h2[text()='Unsaved Report']"));
		explicitWait(unsavedReport, 10);
		verifyElementIsDisplay(unsavedReport, "Unsaved Report", "Unsaved Reports");
		
		WebElement from=driver.findElement(By.xpath("//img[@id='ext-gen152']"));
		explicitWait(from, 10);
		clickOnButtonOrLinks(from, "Form");
		
		WebElement date=driver.findElement(By.xpath("//table[@class='x-date-inner']/tbody/tr[3]/td[7]"));
		explicitWait(date, 10);
		clickOnButtonOrBoxes(date, "Date");
		
		WebElement to=driver.findElement(By.xpath("//img[@id='ext-gen154']"));
		explicitWait(to, 20);
		clickOnButtonOrBoxes(to, "To Date");
		
		WebElement clearToDate=driver.findElement(By.xpath("//input[@id='ext-comp-1045']"));
		explicitWait(clearToDate, 20);
		clearToDate.clear();
		clearToDate.sendKeys("15/06/2024");
		
		WebElement save=driver.findElement(By.xpath("//button[@id='ext-gen49']"));
		explicitWait(save, 20);
		clickOnButtonOrBoxes(save, "Save");
		
		WebElement reportName=driver.findElement(By.xpath("//input[@name='reportName']"));
		explicitWait(reportName, 30);
		enterData(reportName, "Report1", "Report Name");
		
		WebElement reportUnique=driver.findElement(By.xpath("//input[@name='reportDevName']"));
		explicitWait(reportUnique, 50);
		enterData(reportUnique, "ReportNew1", "Report unique name");
		
		WebElement saveButton=driver.findElement(By.xpath("//button[text()='Save and Run Report']"));
		explicitWait(saveButton, 100);
		clickOnButtonOrBoxes(saveButton, "Save button");
	}
}
