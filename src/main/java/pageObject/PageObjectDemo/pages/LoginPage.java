package pageObject.PageObjectDemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pageObject.PageObjectDemo.abstractComponents.AbstractComponent;

public class LoginPage extends AbstractComponent{
	
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy(id="userEmail")
	private WebElement userName;
	
	@FindBy(id="userPassword")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement loginBtn;
	
	public void userLogin(String user, String pass)
	{
		userName.sendKeys(user);
		password.sendKeys(pass);
		loginBtn.click();
	}

}
