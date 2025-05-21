package com.oranghrm.test;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangehrm.pages.LoginPage;
import com.report.ExtentReportUtils;
import com.report.PropertiesUtility;

public class LoginPageTest extends BaseTest
{
	LoginPage login;
	
	@BeforeMethod
	public void startTest(Method method) {
	    ExtentReportUtils.createTest(method.getName());  // Initializes the ExtentTest
	}
	@BeforeMethod
    public void setUp() {
       
		login = new LoginPage(driver); // ✅ safe to use here
    }
	
	@Test
	public void loginToApplication() throws IOException
	{		
		
		
		//login.loginWithValidUserNamePassword("Admin","admin123");
		
		login.loginWithValidUserNamePassword(PropertiesUtility.getData("username"),PropertiesUtility.getData("password"));
	}

}
