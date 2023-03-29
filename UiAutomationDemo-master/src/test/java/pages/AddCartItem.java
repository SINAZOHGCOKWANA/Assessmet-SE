package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

  public class AddCartItem {
		WebDriver driver;
		public AddCartItem(WebDriver driver) 
		{
			 this.driver = driver;
		}
		
		By jacketBtn     = By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']");
		By backpackBtn   = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	    By cartBtn       = By.xpath("//a[@class='shopping_cart_link']");
	    
		

		public void addItem1() throws Exception{
			driver.findElement(jacketBtn).click();
			Thread.sleep(3000);
			
			
		}
		
		public void addItem2() throws Exception{
			driver.findElement(backpackBtn).click();
			Thread.sleep(3000);
			
			
		}
		
		public void viewCart() throws Exception {
			driver.findElement(cartBtn).click();
			Thread.sleep(3000);
			
		}
		
		public void validateCartPage() {
			String strUrl = driver.getCurrentUrl();
			String expected = "https://www.saucedemo.com/cart.html";
			Assert.assertEquals(expected, strUrl);
		}
		

	}
   

