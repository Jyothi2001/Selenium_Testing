package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script_7_MouseActions {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		
//validate the flipkart home page
	if(driver.getTitle().contains("Online"))
	{
    	System.out.println("Navigated to flipkart homepage");
	}
		else
	{
	    System.out.println("Navigation failed");
	}
	
//mouse hover on electronics
	WebElement electronics = driver.findElement(By.xpath
					("//span[text()='Electronics']"));
	Actions act=new Actions(driver);
	act.moveToElement(electronics).perform();
	
//click on gaming
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Gaming']")).click();
	Thread.sleep(10000);
	
//fetch the current price of first product
	WebElement price = driver.findElement(By.xpath
			("(//a[@class='wjcEIp'])[1]/../a[3]/div[1]/div[1]"));
	System.out.println(price.getText());
	Thread.sleep(2000);
	
	driver.quit();
	}
}
