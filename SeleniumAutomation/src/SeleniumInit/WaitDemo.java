package SeleniumInit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class WaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
		//Navigate to desire URL
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		
		//Maximixe the browser window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String Title=driver.getTitle();
		
		System.out.println(Title);
		
		
		driver.findElement(By.cssSelector("input[id=adder]")).click();
		WebElement ele2=driver.findElement((By.cssSelector("div[id=box0]")));
		
	
	}
}

