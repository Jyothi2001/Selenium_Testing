package JavaScript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Into_View {
	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * arguments[0].scrollIntoView(boolean)
		 * -->it will perform scrolling with respect to a webelement
		 * -->if we pass true-->until the webelement comes into top of the webpage
		 * -->if we pass false-->until the webelement comes into bottom of the webpage
		 * syntax:-
		 * js.executeScript("js code",webelement-ref);
		 */	
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		
		Thread.sleep(2000);
		
		
		//identify a webelement
		WebElement cart = driver.findElement(By.xpath
				("(//input[@value='Add to cart'])[1]"));
		
		
		//step 1
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		Thread.sleep(2000);
		//step 2
		js.executeScript("arguments[0].scrollIntoView(true)",cart);
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
