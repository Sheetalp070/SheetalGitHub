package testNGDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class TimeSheetTest {
	
	public static WebDriver driver=new ChromeDriver();
	
	
	
	
	@Test(priority=1)
	
	public void loginApplication()
	{
 
	

	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	} 
	

	@Test(priority=2)
	//@Parameters({"userName","password"})
	  public void logintoApplication(String userName,String password)
	  {
		  driver.findElement(By.name("username")).sendKeys(userName);
		  driver.findElement(By.name("password")).sendKeys(password);
		  driver.findElement(By.cssSelector(".orangehrm-login-button")).click();			 
		  
	  }

	@Test(enabled=false)
	  public void clickOnLeaveLink()
	  {
		  driver.findElement(By.linkText("Leave")).click();
		  String title=driver.getTitle();	
		  
		  
	  }
	  @Test(enabled=false)
	  public void clickOnTimeLink()
	  {
		  driver.findElement(By.linkText("Time")).click();
		 
		  
		  
	  }
	
	  @Test(enabled=false)
	  public void teardown()
	  {
	  driver.close();
	  }
		
		
	}


