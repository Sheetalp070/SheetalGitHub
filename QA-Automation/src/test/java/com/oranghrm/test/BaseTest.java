package com.oranghrm.test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import com.report.ExtentReportUtils;
import java.time.Duration;
import org.openqa.selenium.WebDriver;


public class BaseTest {

    public  static WebDriver driver;
    
    @BeforeSuite
    public void setUpSuite() {
        ExtentReportUtils.setUpReport();  // Ensures ExtentReports is created
    }

    @BeforeClass
    public void initDriver() {
        // Optional: Use WebDriverManager if you don't want to manually manage drivers
       //  WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown()
    {
        if (driver != null) {
            driver.quit();
        }        
        
    }
    public WebDriver getDriver() {
        return driver;
    }
}

