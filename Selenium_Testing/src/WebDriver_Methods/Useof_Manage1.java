package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Useof_Manage1 {
	
	public static void main(String[] args) throws InterruptedException {
		
//Method 7 ->manage()
// also has 7 different actions
//a) maximize() b)minimize() c) fullscreen()
		
		WebDriver driver = new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//minimize
		driver.manage().window().minimize();
		Thread.sleep(2000);
		
		//fullscreen
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		//quit 
		 driver.quit();
		
		
	}

}
