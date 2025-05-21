package com.oranghrm.test;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage;
import com.report.ExtentReportUtils;



public class HomePageTest extends BaseTest{
	
	LoginPage login;
    HomePage homepage;
    
    @BeforeSuite
    public void setupSuite() {
        ExtentReportUtils.setUpReport(); 
    }
	
	@BeforeMethod
    public void doLogin(Method method) throws IOException {
		ExtentReportUtils.createTest(method.getName());
         login = new LoginPage(driver);
        login.loginWithValidUserNamePassword("Admin", "admin123");
        homepage=new HomePage(driver); //initalize HomePage after Login
    }
	
	@Test
	public void logOutFromApplication() throws IOException
	{
	 homepage.ClickonLogoutButton();
	Assert.assertTrue(driver.getCurrentUrl().contains("auth/login"), "Logout failed or login page not reached");
	}

}
