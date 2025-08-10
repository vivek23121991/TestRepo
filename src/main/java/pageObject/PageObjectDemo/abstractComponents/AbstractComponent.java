package pageObject.PageObjectDemo.abstractComponents;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponent {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public AbstractComponent(WebDriver driver)
	{
		this.driver= driver;
	}
	
	

	public void waitTillElementVisible(WebElement element)
	{
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitTillElementInvisible(WebElement element)
	{
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
	
	
	

}
