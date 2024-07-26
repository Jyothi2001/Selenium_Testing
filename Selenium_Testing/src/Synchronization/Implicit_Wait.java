package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {
public static void main(String[] args) throws InterruptedException {

	
	WebDriver driver=new ChromeDriver();
	
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
Thread.sleep(2000);
	
	//click on gift cards link
	driver.findElement(By.xpath
			("(//a[contains(text(),'Gift Cards')])[3]")).click();
	
	//click on add to cart
	driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
	Thread.sleep(2000);
	
	//enter name
	driver.findElement(By.id("giftcard_1_RecipientName")).sendKeys("ROCKY");
	Thread.sleep(2000);
	
	driver.quit();
													
}
}
