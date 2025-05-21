package SeleniumInit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeDemo {

	public static void main(String[] args) throws InterruptedException {
	//Navigate to desire URL
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/dialog/");
		
		//Maximixe the browser window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement element=driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(element);
		
		driver.findElement(By.cssSelector(".ui-button")).click();
		
		Thread.sleep(5000);
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.linkText("Demos")).click();
		driver.close();
		
		
		
	}

}
