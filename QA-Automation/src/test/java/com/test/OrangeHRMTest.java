package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class OrangeHRMTest {
	
	ChromeDriver driver ;
	
	@Test
	public void Login()
	
	{
		//open chromebrowser 
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//open login page
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//enter user name
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//Enter password
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//Click on login button
		
		driver.findElement(By.cssSelector(".orangehrm-login-button")).click();	
	}
	
	@Test
	public void testAdmin()
		
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Admin']")));
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		
		boolean adminDisplay=driver.findElement(By.xpath("//*[text()='System Users']")).isDisplayed();
		
		Assert.assertTrue(adminDisplay);
	}
	
	@Test
	public void testLogout()
	
	
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".oxd-userdropdown-img")));
		
		driver.findElement(By.cssSelector(".oxd-userdropdown-img")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Logout']")));
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		
		boolean logInDisplay=driver.findElement(By.cssSelector(".orangehrm-login-title")).isDisplayed();
		Assert.assertTrue(logInDisplay);
	}
	
	


}
