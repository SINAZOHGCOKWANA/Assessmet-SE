package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class TC01_E2E_Test {
	
static WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(option);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
	}

	@Test(priority = 1)
	public void loginTest() throws Exception {
		LoginPage page = new LoginPage(driver);
		page.enterUn();
		page.enterPw();
		page.clickBtn();
		page.validateHomePage();
		
	}
	
	@Test(priority = 2)
	public void AddToCartTest() throws Exception {
		AddCartItem page2 = new AddCartItem(driver);
		page2.addToCartItem1();
		page2.addToCartItem2();
		page2.viewCart();
		page2.validateCartPage();
		
	}
	@Test(priority = 3)
	public void tearDown() {
		driver.quit();
		
	}
}
