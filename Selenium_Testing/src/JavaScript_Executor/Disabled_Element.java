package JavaScript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabled_Element {
	public static void main(String[] args) throws InterruptedException {
	
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/");
	
	
	Thread.sleep(4000);
	
	//identify the disabled element
	WebElement disabled = driver.findElement(By.xpath
			("//input[@class='form-control']"));
	Thread.sleep(2000);
	
	System.out.println(disabled.isEnabled());//false
	
	Thread.sleep(2000);
	
	//disabled.sendKeys("MOBILES");ElementNotInteractableException
	
	
	//step 1
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	//step 2
	js.executeScript("arguments[0].value='MOBILES'", disabled);
	
	Thread.sleep(4000);
	
	driver.quit();
	}

}
