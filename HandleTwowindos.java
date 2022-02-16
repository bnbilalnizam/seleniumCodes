package automation;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTwowindos {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// maximizing the window size
		driver.get("https://dev.fashionpass.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='https://www.instagram.com/fashionpass/']")).click();
		Set<String> ids =driver.getWindowHandles();
		java.util.Iterator<String> it= ids.iterator();
		String parentID= it.next();
		String childID= it.next();
		driver.switchTo().window(parentID);
		driver.switchTo().window(childID);
		
	}

}
