package automation;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Randomselectingproducts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// maximizing the window size
		driver.get("https://dev.fashionpass.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		getLogin(driver);
//		getProducts(driver);
		getRandomProduct(driver);

	}

	// Defining a method that will take the user to clothing page
	public static void getLogin(WebDriver driver) {
		driver.findElement(By.xpath("//span[contains(text(),'log in')]")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testuser-1@yopmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("testing");
		driver.findElement(By.xpath("//span[@id='login-text']")).click();
		driver.findElement(By.xpath("//img[@class='desktop-header-img']")).click();
	}

	public static void getProducts(WebDriver driver) {
		String[] productsNeeded = { "WAYF" };
		List<WebElement> allProducts = driver.findElements(By.xpath("//div[@class='product-info-inner']/a/h2/span"));

		for (int i = 0; i < allProducts.size(); i++) {
			String checkproductname = allProducts.get(i).getText();
			System.out.println(checkproductname);

			List productList = Arrays.asList(productsNeeded);

			if (productList.contains(checkproductname)) {
				driver.findElements(By.xpath("//div[@class='hoverimageArea']/div")).get(i).click();
				break;
//				New line added 13/2/2022
			}
		}
	}

	public static void getRandomProduct(WebDriver driver) {
		

		WebElement productdriver = driver.findElement(By.xpath("//div[@class='product-grid']/div[2]"));
		int productcount = productdriver.findElements(By.tagName("a")).size();
		for (int i = 0; i < productcount; i++) {
			Random rn = new Random();
			int uniqueproduct = rn.nextInt(productcount);
			productdriver.findElements(By.tagName("a")).get(uniqueproduct).click();
			
		}
//		WebElement productsizes = driver.findElement(By.xpath("//div[@class='swatch mb-md-4 mb-3']"));
//		int productsizecount=productsizes.findElements(By.tagName("span")).size();
//		for (int j = 0; j < productsizecount; j++) {
//			System.out.println(productsizecount);
//		}

	}

}
