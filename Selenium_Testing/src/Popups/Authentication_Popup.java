package Popups;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_Popup {
	public static void main(String[] args) throws InterruptedException {
/*
 * Method 2-> Authentication Popup
 * We can handle this only by passing the user-name and password with the original web-app link
 * ACTUAL URL: https://the-internet.herokuapp.com/basic_auth
 * Syntax -> as modifies url.
 * MODIFIED URL: https://admin:admin@the-internet.herokuapp.com/basic_auth
 */		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://the-internet.herokuapp.com/basic_auth");
	
		Thread.sleep(2000);
		driver.get
	("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		Thread.sleep(5000);
		driver.quit();
	}

}
