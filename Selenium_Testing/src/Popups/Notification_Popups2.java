package Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_Popups2 {
	public static void main(String[] args) throws InterruptedException {
		
//Method 1-> Notification popup 
//b) Using ChromeOptions

		//step 1-->create an obj for ChromeOptions class
		ChromeOptions opt= new ChromeOptions();
		
		
		//step 2-->Use addArgument() and pass Chromium commands
		opt.addArguments("--disable-notifications");
		Thread.sleep(3000);
		
		//step 3-->pass the ChromeOptions ref
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
	
		Thread.sleep(3000);
		
		driver.quit();


	}

}
