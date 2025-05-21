package SeleniumInit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardMouseEvent {

	public static void main(String[] args) {
		
      WebDriver driver=new ChromeDriver();
		
		//Navigate to desire URL
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement element=driver.findElement(By.cssSelector(".demo-frame"));
		
		driver.switchTo().frame(element);
		
		
		WebElement dragoption=driver.findElement(By.id("draggable"));
		
		WebElement dropoption=driver.findElement(By.id("droppable"));
		
		Actions action =new Actions(driver);
		
		action.dragAndDrop(dragoption, dropoption).build().perform();
		driver.close();
		
		
	}

}
