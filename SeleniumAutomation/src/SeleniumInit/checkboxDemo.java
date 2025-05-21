package SeleniumInit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.WebDriverWait;

public class checkboxDemo {

	public static void main(String[] args) throws InterruptedException {
       
		 WebDriver driver=new ChromeDriver();
		
		//Navigate to desire URL
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Maximixe the browser window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement elementSelect=driver.findElement(By.name("additionalField_employees"));
		
		Select selectValue=new Select(elementSelect);
		selectValue.selectByIndex(1);
		Thread.sleep(5000);
		
		
		WebDriverWait  wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement elem=driver.findElement(By.cssSelector("form#checkboxes>input:nth-child(1)"));
		Thread.sleep(3000);
		
		WebElement elem1=driver.findElement(By.cssSelector("form#checkboxes>input:nth-child(2)"));
		wait.until(ExpectedConditions.visibilityOf((elem)));
		
		if(elem.isEnabled())
		{
			elem.click();
			
		}
		
		
		
		
		driver.close();
		}
		
	
		
		
	

}
