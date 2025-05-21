package SeleniumInit;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptAlert {

	public static void main(String[] args) throws InterruptedException {
		//Navigate to desire URL
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/dialog/");
		
		//Maximixe the browser window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.alertIsPresent());
		
		
		
		//Thread.sleep(5000);
		Alert alert =driver.switchTo().alert();
		alert.dismiss();
		//String alertText=alert.getText();
		
		//System.out.println(alertText);
		
	
	}

}
