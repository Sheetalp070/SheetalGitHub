package SeleniumInit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DriverInstance {

	public static void main(String[] args) {
		
		//initialize the chromedriver
		WebDriver driver=new ChromeDriver();
		
		//Navigate to desire URL
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		
		//Maximixe the browser window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		/*driver.findElement(By.id("email")).sendKeys("Selenium");
		
		List<WebElement> radioButtons= driver.findElements(By.cssSelector("input[type=radio]"));
		
		int ButtonCount= radioButtons.size();
		System.out.println("The nu of button lacated on webpage is "+ ButtonCount);
		
		WebElement element= driver.findElement(By.name("id-name1"));
		String textOnTextbox= element.getText();
		element.clear();
		element.sendKeys("Sheetal");*/
		
		//Select from the dropdown menu
		
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(2));
		WebElement selectelement=driver.findElement(By.name("my-select"));
		wait.until(ExpectedConditions.visibilityOf(selectelement));
		
		Select select=new Select(driver.findElement(By.name("my-select")));
		select.selectByVisibleText("Three");
		
		//select.deselectByVisibleText("Three");
		//WebElement selectedoption=select.getFirstSelectedOption();
		
		
	   
		
		WebElement checkbox=driver.findElement(By.id("my-check-1"));
		Boolean isSlected= checkbox.isSelected();
		if (isSlected )
		{
			checkbox.click();
			
		}
		
		
		//Close the browser window
		//driver.quit();
		
		//upload a file
		
	/*	String filePath="/SeleniumAutomation/src/SeleniumInit/file.txt";
		
		WebElement uploadElement=driver.findElement(By.name("my-file"));
		uploadElement.sendKeys(filePath);*/
		
	}

}
