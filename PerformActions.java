package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// maximizing the window size
		driver.get("https://dev.fashionpass.com/");
		driver.manage().window().maximize();
		Actions a= new Actions(driver);
//		a.moveToElement(driver.findElement(By.xpath("//a[@href='/clothing']/label"))).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//div[@id='__next']/header/div[5]/nav/ul/li[2]"))).build().perform();

	}

}
