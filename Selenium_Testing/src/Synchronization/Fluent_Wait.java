package Synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class Fluent_Wait {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath
				("(//a[contains(text(),'Gift Cards')])[3]")).click();
		
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		Thread.sleep(2000);
		
		
//Fluent_Wait
	//create an object for fluent wait
	Wait<WebDriver> wait=new FluentWait<>(driver);;

	//specify wait time
		 ((FluentWait<WebDriver>) wait).withTimeout(Duration.ofSeconds(10));
		
	//speicfy polling time
		((FluentWait<WebDriver>) wait).pollingEvery(Duration.ofMillis(500));
		
	//ignoring the exception
		((FluentWait<WebDriver>) wait).ignoring(NoSuchElementException.class);
		
	//provide conditions
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("giftcard_1_RecipientName")));
		
		driver.findElement(By.id("giftcard_1_RecipientName")).sendKeys("ROCKY");
		Thread.sleep(2000);	
		
		driver.quit();
	}

}
