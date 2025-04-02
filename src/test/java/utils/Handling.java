package utils;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handling {
	
	
	public static WebElement explicitWait(WebDriver driver, WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		return wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	
	
	public static String handleAlert(WebDriver driver,Alert alert)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent());
		alert = driver.switchTo().alert();
		String alertTxt = alert.getText();
		alert.accept();
		
		return alertTxt;

	}
		
		public static WebElement fluentWait(WebDriver driver, WebElement ele)
		{
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	                .withTimeout(Duration.ofSeconds(30))
	                .pollingEvery(Duration.ofSeconds(5));
	                
			return wait.until(ExpectedConditions.visibilityOf(ele));
		}
		
		
		
		
		
		
		
		
		
		
		
		

	

}
