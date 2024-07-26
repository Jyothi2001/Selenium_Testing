package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Useof_Navigation {
	
	public static void main(String[] args) throws InterruptedException {

//Method 8 -> navigate
//there are 5 actions in this
//a) back() b)forward() c) refresh()
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
		
		//back
		driver.navigate().back();
		Thread.sleep(2000);
		
		//forward
		driver.navigate().forward();
		Thread.sleep(2000);
		
		//refresh
		driver.navigate().refresh();
		
		driver.quit();
		
	}

}
