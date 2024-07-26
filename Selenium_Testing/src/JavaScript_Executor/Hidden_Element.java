package JavaScript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Element {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		
		Thread.sleep(2000);
		
		// identify the hidden element
		WebElement hidden = driver.findElement(By.name("custom_gender"));
		
		Thread.sleep(2000);
		
		// step 1
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		// step 2
		js.executeScript("arguments[0].value='@@@@@@@@@'", hidden);
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
