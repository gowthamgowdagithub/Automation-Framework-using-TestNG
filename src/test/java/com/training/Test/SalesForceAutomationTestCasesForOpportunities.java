package com.training.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.training.Base.BaseLogin;
@Listeners(com.training.Utilities.TestListeners.class)
public class SalesForceAutomationTestCasesForOpportunities extends BaseLogin{

	@Test
	public void TestCase15() {
		login_salesForce();
		
		WebElement opportunities=driver.findElement(By.xpath("//a[text()='Opportunities']"));
		explicitWait(opportunities, 10);
		clickOnButtonOrLinks(opportunities, "Opportunities");
		
		WebElement verifyOpportunities=driver.findElement(By.xpath("//select[@id='fcf']"));
		explicitWait(verifyOpportunities, 10);
		getVisibleText(verifyOpportunities);
		verifyElementIsDisplay(verifyOpportunities, "All Opportunities Closing Next Month My Opportunities New Last Week New This Week Opportunity Pipeline Private Recently Viewed Opportunities Won", "visible element");
	}
	
	@Test
	public void TestCase16() {
		login_salesForce();
		
		WebElement opportunities=driver.findElement(By.xpath("//a[text()='Opportunities']"));
		explicitWait(opportunities, 10);
		clickOnButtonOrLinks(opportunities, "Opportunities");
		
		WebElement newButton=driver.findElement(By.xpath("//input[@name='new']"));
		explicitWait(newButton, 10);
		clickOnButtonOrBoxes(newButton, "New Button");
		
		getPageTitle("Opportunities page title");
		
		WebElement oppName=driver.findElement(By.xpath("//input[@id='opp3']"));
		explicitWait(oppName, 10);
		enterData(oppName, "Gowda", "Opportunities name");
		
		WebElement accountName=driver.findElement(By.xpath("//input[@id='opp4']"));
		explicitWait(accountName, 10);
		enterData(accountName, "May2024", "Account name");
		
		WebElement closeDate=driver.findElement(By.xpath("//input[@id='opp9']"));
		explicitWait(closeDate, 10);
		clickOnButtonOrBoxes(closeDate, "Close Date");
		closeDate.clear();
		
		WebElement date=driver.findElement(By.xpath("//table[@class='calDays']/tbody/tr[5]/td[2]"));
		explicitWait(date, 10);
		clickOnButtonOrBoxes(date, "Date");
		
		WebElement stage=driver.findElement(By.xpath("//select[@id='opp11']"));
		explicitWait(stage, 10);
		selectDataFromDropDownByVisibleText(stage, "Qualification");
		
		WebElement probability=driver.findElement(By.xpath("//input[@id='opp12']"));
		explicitWait(probability, 10);
		enterData(probability, "10", "Probability");
		
		WebElement leadSource=driver.findElement(By.xpath("//select[@id='opp6']"));
		explicitWait(leadSource, 10);
		selectDataFromDropDownByVisibleText(leadSource, "Web");
		
		WebElement primaryCampaignSource=driver.findElement(By.xpath("//input[@id='opp17']"));
		explicitWait(primaryCampaignSource, 10);
		enterData(primaryCampaignSource, "", "Primary Campaign source");
		
		WebElement save=driver.findElement(By.xpath("//input[@name='save']"));
		explicitWait(save, 10);
		clickOnButtonOrBoxes(save, "Save");
		getPageTitle("Opportunity Page");
	}
	
	@Test
	public void TestCase17() {
		login_salesForce();
		
		WebElement opportunities=driver.findElement(By.xpath("//a[text()='Opportunities']"));
		explicitWait(opportunities, 10);
		clickOnButtonOrLinks(opportunities, "Opportunities");
		
		WebElement OppPipelineLink=driver.findElement(By.xpath("//a[text()='Opportunity Pipeline']"));
		explicitWait(OppPipelineLink, 10);
		clickOnButtonOrLinks(OppPipelineLink, "Opportunity pipeline link");
		
		WebElement text=driver.findElement(By.xpath("//h1[text()='Opportunity Pipeline']"));
		explicitWait(text, 10);
		getPageTitle("Opportunity pipeline page");
		verifyElementIsDisplay(text, "Opportunity Pipeline", "Opportunity pipeline");
	}
	
	@Test
	public void Testcase18() {
		login_salesForce();
		
		WebElement opportunities=driver.findElement(By.xpath("//a[text()='Opportunities']"));
		explicitWait(opportunities, 10);
		clickOnButtonOrLinks(opportunities, "Opportunities");
		
		WebElement stuckOpportunities=driver.findElement(By.xpath("//a[text()='Stuck Opportunities']"));
		explicitWait(stuckOpportunities, 10);
		clickOnButtonOrLinks(stuckOpportunities, "Stuck Opportunities");
		
		WebElement text=driver.findElement(By.xpath("//h1[text()='Stuck Opportunities']"));
		explicitWait(text, 10);
		getPageTitle("Stuck Opportunities page");
		verifyElementIsDisplay(text, "Stuck Opportunities", "Stuck Opportunities");
	}
	
	@Test
	public void TestCase19() {
		login_salesForce();
		
		WebElement opportunities=driver.findElement(By.xpath("//a[text()='Opportunities']"));
		explicitWait(opportunities, 10);
		clickOnButtonOrLinks(opportunities, "Opportunities");
		
		WebElement opportunitySummary=driver.findElement(By.xpath("//table[@class='opportunitySummary']"));
		explicitWait(opportunitySummary, 10);
		clickOnButtonOrBoxes(opportunitySummary, "Opportunity Summary");
		
		WebElement interval=driver.findElement(By.xpath(""));
		explicitWait(interval, 10);
		selectDataFromDropDownByVisibleText(interval, "Current and Next FQ");
		
		WebElement include=driver.findElement(By.xpath("//select[@id='open']"));
		explicitWait(include, 10);
		selectDataFromDropDownByVisibleText(include, "Open Opportunities");
	}
}
