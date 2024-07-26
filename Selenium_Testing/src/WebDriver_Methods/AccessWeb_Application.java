package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessWeb_Application {
	
	//Method 1-> get(String url)
	//public void get (String url)
	//which is used to access the web application
	
	//Syntax -> driver.get("url of the application");
	public static void main(String[] args) throws InterruptedException {
		
		//launch browser
		WebDriver driver = new ChromeDriver();
		
		//access facebook
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
		
	}

}
