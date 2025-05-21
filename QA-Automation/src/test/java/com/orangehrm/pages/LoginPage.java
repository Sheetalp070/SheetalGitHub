package com.orangehrm.pages;

import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.oranghrm.test.BaseTest;
import com.report.ExtentReportUtils;

import jdk.internal.org.jline.utils.Log;

public class LoginPage {

	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	// user name
	@FindBy(name = "username")
	public WebElement userName;

	// Password
	@FindBy(name = "password")
	public WebElement passWord;

	// login button
	@FindBy(css = ".orangehrm-login-button")
	public WebElement loginButton;

	public LoginPage(WebDriver driver) 
	{
        this.driver=driver;
		PageFactory.initElements(driver, this);
	}
   
	 Logger log=LogManager.getLogger(LoginPage.class);

	/*
	 * public void loginToApplication() {
	 * 
	 * JavascriptExecutor js = (JavascriptExecutor) BaseTest.driver;
	 * js.executeScript("arguments[0].value='Admin'", username);
	 * js.executeScript("arguments[0].value='admin123'", password);
	 * js.executeScript("arguments[0].click()", loginButton);// TODO Auto-generated
	 * method stub
	 * 
	 * }
	 */		 

		public void loginWithValidUserNamePassword(String usernameValue, String passwordValue) throws IOException {
			// TODO Auto-generated method stub
			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    wait.until(ExpectedConditions.visibilityOf(userName)).sendKeys(usernameValue);
		    log.info("Username is entered in user name test box");
		    ExtentReportUtils.addStep("Username is entered");
		   
		    wait.until(ExpectedConditions.visibilityOf(passWord)).sendKeys(passwordValue);
		    log.info("Password is entered in user name test box");
		    ExtentReportUtils.addStep("Password is entered");
		    
		    wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
		    log.info("Clicked login button");
		    ExtentReportUtils.addStep("Login successful");
		    
		} 
	
}
