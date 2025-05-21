package com.oranghrm.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.pages.AdminPage;
import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LeavePage;
import com.orangehrm.pages.LoginPage;

public class LeavePageTest extends BaseTest{
	@Test
    public void loginClickAdminAndLogout() throws IOException {
        // Step 1: Login
        LoginPage login = new LoginPage(driver);
        login.loginWithValidUserNamePassword("Admin", "admin123");

        // Step 2: Click on Leave link
        LeavePage leavePage = new LeavePage(driver);
        leavePage.ClickOnLeaveLink();

        // Step 3: Assert Admin Page loaded
       
        Assert.assertTrue(leavePage.isLeavePageDisplayed(), "Admin page is not displayed");
        HomePage homepage=new HomePage(driver);
        // Step 4: Logout
        homepage.ClickonLogoutButton();

        // Step 5: Assert you're back on login page
        Assert.assertTrue(driver.getCurrentUrl().contains("auth/login"), "Logout failed!");
    }

}
