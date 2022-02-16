package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// maximizing the window size
		driver.get("https://dev.fashionpass.com/");
		driver.manage().window().maximize();

		// Making object a of action class to perform multiple actions
		Actions a = new Actions(driver);
		
		// this will take us to clothing and hover
//		a.moveToElement(driver.findElement(By.xpath("//a[@href='/clothing']/label"))).build().perform();
		
		// You can also write above by making a WebElement
		// for e.g
		WebElement clothingpath = driver.findElement(By.xpath("//a[@href='/clothing']/label"));

//		a.moveToElement(clothingpath).build().perform();
//		a.moveToElement(driver.findElement(By.xpath("//div[@id='__next']/header/div[5]/nav/ul/li[2]"))).build().perform();

		a.moveToElement(driver.findElement(By.xpath("//div[@class='searchResultBox']/input"))).click()
		.keyDown(Keys.SHIFT).sendKeys("alica moto jacket").build().perform();
		
		// for right click
		a.moveToElement(clothingpath).contextClick().build().perform();
	}

}
