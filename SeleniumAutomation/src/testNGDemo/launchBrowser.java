package testNGDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class launchBrowser {
	
	@Test
	public void launchdriver()
	{
		WebDriver driver=new ChromeDriver();
		
		/*	//Navigate to desire URL
			driver.get("https://www.selenium.dev/selenium/web/mouseOver.html");
			
			//Maximixe the browser window
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			Actions action=new Actions(driver);
			
			WebElement element= driver.findElement(By.id("greenbox"));
			
			action.moveToElement(element).perform();
			*/

	    //This code if for double click

	     driver.get("https://www.google.com");
	     String title =driver.getTitle();
	      
	     driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Assert.assertTrue(titled);
					

		
	}

}
