package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {
	
	//Method 4-> clear()
	//can get multiple data
public static void main(String[] args) throws InterruptedException {

	//to verify email textfield is accepting different email
	//-->abc@gmail.com
	//-->abc@abc.com
	//-->jyothi@cricket.in
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//identify email
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("abc@gmail.com");
	Thread.sleep(1000);
	email.clear();
	email.sendKeys("acb@abc.com");
	Thread.sleep(1000);
	email.clear();
	email.sendKeys("jyothi@cricket.in");
	
	driver.quit();
	
}
}
