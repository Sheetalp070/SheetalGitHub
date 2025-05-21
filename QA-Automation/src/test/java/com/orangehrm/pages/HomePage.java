package com.orangehrm.pages;

import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.oranghrm.test.BaseTest;
import com.report.ExtentReportUtils;


public class HomePage
{
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	//admin link
	@FindBy(linkText="Admin")
	public  WebElement adminLink;
	
	//profilePicture
	@FindBy(css=".oxd-userdropdown-img")
	public  WebElement ProfilePicture;
	
	//logout button
	@FindBy(xpath="//*[text()='Logout']")
	public  WebElement logOutButton;	
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 Logger log=LogManager.getLogger(LoginPage.class);
	
	public void ClickonLogoutButton() throws IOException
	{	
	    
	    wait.until(ExpectedConditions.elementToBeClickable(ProfilePicture)).click();
	    log.info("Clicked on profile picture");
	    ExtentReportUtils.addStep("click on profile picture");
	    
	    wait.until(ExpectedConditions.elementToBeClickable(logOutButton)).click();
	    log.info("Clicked on Logout button");
	    ExtentReportUtils.addStep("click on Logout button");
	    
		
	}

	
	public void ClickOnAdminLink() {
		    new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.elementToBeClickable(adminLink))
		        .click();
		}

	
	

}
