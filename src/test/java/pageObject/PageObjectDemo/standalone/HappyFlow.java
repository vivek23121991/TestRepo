package pageObject.PageObjectDemo.standalone;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.PageObjectDemo.pages.CartPage;
import pageObject.PageObjectDemo.pages.LoginPage;
import pageObject.PageObjectDemo.pages.ProdtListPage;

public class HappyFlow {

	WebDriver driver;
	@BeforeTest
	public void launchApplication()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@Test
	public void login() {
		

		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		String username = "vivekn@gmail.com";

		driver.get("https://rahulshettyacademy.com/client/#/auth/login");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.userLogin(username, "Vivek@123");
		String product = "ADIDAS ORIGINAL";

		ProdtListPage productListPage = new ProdtListPage(driver);
		productListPage.selectProduct(product);
		productListPage.goToCartPage();
		CartPage cartPage = new CartPage(driver);
		String productName = cartPage.getNameOfTheProduct();
		AssertJUnit.assertEquals(productName, product);



	}
	
	@AfterMethod
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
