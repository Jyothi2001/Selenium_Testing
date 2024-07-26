package FindElement_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_CompleteAttr {

public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	
	//identify element xpath by complete attribute
	//email
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("jyothi@gmail.com");

	//password
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("jyothi");
	
	Thread.sleep(2000);
	
	driver.quit();
}

}
