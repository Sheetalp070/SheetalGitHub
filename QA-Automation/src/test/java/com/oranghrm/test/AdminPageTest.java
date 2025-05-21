package com.oranghrm.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.pages.AdminPage;
import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage;

public class AdminPageTest extends BaseTest
{
	@Test
    public void loginClickAdminAndLogout() throws IOException {
        // Step 1: Login
        LoginPage login = new LoginPage(driver);
        login.loginWithValidUserNamePassword("Admin", "admin123");

        // Step 2: Click on Admin link
        HomePage homePage = new HomePage(driver);
        homePage.ClickOnAdminLink();

        // Step 3: Assert Admin Page loaded
        AdminPage adminPage = new AdminPage(driver);
        Assert.assertTrue(adminPage.isAdminPageDisplayed(), "Admin page is not displayed");

        // Step 4: Logout
        homePage.ClickonLogoutButton();

        // Step 5: Assert you're back on login page
        Assert.assertTrue(driver.getCurrentUrl().contains("auth/login"), "Logout failed!");
    }


}
