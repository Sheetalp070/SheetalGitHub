package com.orangehrm.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeavePage {
WebDriver driver;
	
	@FindBy(xpath="//span[text()='Leave']")
	public  WebElement leaveLink;
	
	@FindBy(css=".oxd-topbar-header-breadcrumb-module")
	public WebElement leaveHeader;
	
	
	public LeavePage(WebDriver driver )
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

	public void ClickOnLeaveLink() {
	    new WebDriverWait(driver, Duration.ofSeconds(10))
	        .until(ExpectedConditions.elementToBeClickable(leaveLink))
	        .click();
	}



	public boolean isLeavePageDisplayed() {
        return new WebDriverWait(driver, Duration.ofSeconds(10))
            .until(ExpectedConditions.visibilityOf(leaveHeader))
            .isDisplayed();
    }
}
