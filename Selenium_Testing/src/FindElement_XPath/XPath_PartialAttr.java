package FindElement_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_PartialAttr {
	
	public static void main(String[] args)  {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("jyothi@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("jyothi");
		
		
		//identify element xpath by partial attribute
		//button
		driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();
	
		
		driver.quit();
	}

}
