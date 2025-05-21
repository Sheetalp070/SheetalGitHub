package SeleniumInit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class WindowHandle {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Maximixe the browser window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 // Instantiate JavascriptExecutor by casting WebDriver
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
       WebElement ele=driver.findElement(By.name("username"));
       WebElement ele1=driver.findElement(By.name("password"));
     //  WebElement ele2=driver.findElement(By.cssSelector(".orangehrm-login-button"));
       
      
       
        js.executeScript("arguments[0].value='Admin'", ele);
        
        js.executeScript("arguments[0].value='admin123'", ele1);
        driver.findElement(By.cssSelector(".orangehrm-login-button")).click();
        
  //      js.executeScript("arguments[0].scrollInToView(true)", args)
        
		
		
		
		
	}

}
