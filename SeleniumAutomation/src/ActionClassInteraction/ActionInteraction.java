package ActionClassInteraction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class ActionInteraction {

	public static void main(String[] args) {

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

     driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");

//Maximixe the browser window
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
     WebElement element=driver.findElement(By.id("clickable"));
     Actions action=new Actions(driver);
     action.contextClick(element).perform();
     driver.close();
     
     
		
	}

}
