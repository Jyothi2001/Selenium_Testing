package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_PageSource {
	public static void main(String[] args) {
		
		//Method 6-> getPageSource()
		//public string getPageSource()
		//to fetch html source code of a webpage
		//Syntax -> driver.getPageSource();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//fetch html code
		String ps = driver.getPageSource();
		System.out.println(ps);
		
		driver.quit();
		
	}

}
