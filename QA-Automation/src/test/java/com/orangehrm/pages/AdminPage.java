package com.orangehrm.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.oranghrm.test.BaseTest;

public class AdminPage {
	WebDriver driver;
	
	@FindBy(xpath="//span[text()='Admin']")
	public  WebElement adminLink;
	
	@FindBy(css=".oxd-topbar-header-breadcrumb-module")
	public WebElement adminHeader;
	
	
	public AdminPage(WebDriver driver )
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

	public void ClickOnAdminLink() {
	    new WebDriverWait(driver, Duration.ofSeconds(10))
	        .until(ExpectedConditions.elementToBeClickable(adminLink))
	        .click();
	}



	public boolean isAdminPageDisplayed() {
        return new WebDriverWait(driver, Duration.ofSeconds(10))
            .until(ExpectedConditions.visibilityOf(adminHeader))
            .isDisplayed();
    }
	
	
	

}
