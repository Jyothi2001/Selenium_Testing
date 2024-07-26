package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Quit_Browser {

	public static void main(String[] args) throws InterruptedException {
		//Method 4-> close();
		//public void close();
		//used to close the window in front-end
		//Syntax -> driver.close();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//close
		driver.close();
		
		//Method 5-> quit();
		//public void quit();
		//used to close the window in back-end
		//Syntax -> driver.quit();
		
		//quit
		driver.quit();
	}
}
