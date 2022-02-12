package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
//		System.out.println(driver.getTitle());
		
//		System.out.println(driver.getCurrentUrl()); // to check the url and print it in the console
//		System.out.println(driver.getPageSource()); // to print the page source in the console
	
//		driver.navigate().to("yahoo.com");
//		System.out.println(driver.getTitle());
//		driver.navigate().back();
//		System.out.println(driver.getTitle());
//		driver.close();
//		driver.findElement(By.id("email")).sendKeys("This is my first code");
//		driver.findElement(By.name("pass")).sendKeys("12345");
//		driver.findElement(By.linkText("Forgotten password?")).click();
	
//		Xpath:
//		//tagname[@attribute='value']
//		//*[@attribute='value']
//		
//		CSS SELECTOR:
//		tagname[@attribute='value']
//		[@attribute='value']
//		tagname#id
//		tagname.classname		
//		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("Bilal Nizam");
//		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input")).click();
	
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//div[@data-testid='round-trip-radio-button']")).click();
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).sendKeys("mum");
		driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']")).sendKeys("kol");
		
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']/div/div")).click();
		int i=1;
		while(i<3)
		{
		driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		i++;
		}
////		Assert.assertEquals(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']/div[2]")).getText(),"5 Adults");
////		System.out.println(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']/div[2]")).getText());
//		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();
//		if(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']/div[2]")).getText().contains("5"))
//		{
//			System.out.println("OK TO GO");
//		}
//		else{
//			System.out.println("SToP");
//		}

		//		

//		driver.get("https://www.makemytrip.com/");
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
//		driver.findElement(By.xpath("//div[@class='fsw_inner']")).clear();
//		driver.findElement(By.xpath("//div[@class='fsw_inner']")).sendKeys("mum");
//		driver.findElement(By.xpath("//div[@class='fsw_inner']")).sendKeys(Keys.ARROW_DOWN);
//		driver.findElement(By.xpath("//div[@class='fsw_inner']")).sendKeys(Keys.ENTER);
		
		
	
	
	
	}

	

}
