package SeleniumInit;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDandNameLocators {

	public static void main(String[] args) {
      WebDriver driver=new ChromeDriver();
		
	/*	//Navigate to desire URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Maximixe the browser window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		 driver.findElement(By.name("password")).sendKeys("admin123");
		 driver.findElement(By.cssSelector(".oxd-button")).click();*/
		 
		 
      driver.get("https://facebook.com");
      driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
		
	  
      List<WebElement> allLinks=driver.findElements(By.tagName("a"));
      
      System.out.println("The numberof the links are "+ allLinks.size());
      
      for(int i=0;i<allLinks.size();i++)
      {
    	String  linksText =  allLinks.get(i).getText();
    	System.out.println("Link text is "+linksText);
    	
    	
    	if(linksText.toLowerCase().contains("sign up")) {
    		System.out.println("correct link");
    		break;
    	}
    		else
    			System.out.println("Incorrect link");
    	}
      driver.close();
      }   
	
		
		
	}


