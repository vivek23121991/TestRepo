package pageObject.PageObjectDemo.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pageObject.PageObjectDemo.abstractComponents.AbstractComponent;

public class ProdtListPage extends AbstractComponent{
	
	WebDriver driver;
	
	public ProdtListPage(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='card-body']/h5/b")
	List<WebElement> products;
	
	@FindBy(xpath="//div[@class='card-body']/button[2]")
	List<WebElement> addToCartBtn;
	
	@FindBy(css = "div.ngx-spinner-overlay")
	WebElement spinner;
	
	@FindBy(xpath = "//div[@id='toast-container']")
	WebElement toast;
	
	@FindBy(xpath="//button[@routerlink='/dashboard/cart']")
	WebElement cartBtn;
	
	
	
	
	
	public void selectProduct(String productName)
	{
		for(int i=0; i<products.size(); i++)
		{
			if(products.get(i).getText().equalsIgnoreCase(productName))
			{
				addToCartBtn.get(i).click();
				break;
			}
	}
		
		waitTillElementVisible(spinner);
		waitTillElementInvisible(toast);

	}
	
	public void goToCartPage()
	{
		cartBtn.click();
	}
}