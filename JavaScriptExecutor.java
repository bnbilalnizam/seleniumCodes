package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		driver.findElement(By.xpath("//input[@name='fromPlaceName']")).sendKeys("beng");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='fromPlaceName']")).sendKeys(Keys.DOWN);
//		driver.findElement(By.xpath("//input[@name='fromPlaceName']")).sendKeys(Keys.DOWN);		
//		This doesn't works in selenium since the element is hidden
		//		String a= driver.findElement(By.xpath("//input[@name='fromPlaceName']")).getText();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script="return document.getElementById(\"fromPlaceName\").value;";
		String text= (String) js.executeScript(script);
		System.out.println(text);
		
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
		{	
		driver.findElement(By.xpath("//input[@name='fromPlaceName']")).sendKeys(Keys.DOWN);
		text= (String) js.executeScript(script);
		System.out.println(text);
		}
		
		
	
	
	}

	

}
