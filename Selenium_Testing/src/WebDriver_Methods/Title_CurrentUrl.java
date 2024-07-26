package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_CurrentUrl {
	public static void main(String[] args) {
		
		//Method 2 -> getTitle()
		//public String getTitle()
		//used to fetch title of current webpage
		//Syntax -> driver.getTitle();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//fetch title
		 String title = driver.getTitle();
		 System.out.println("Title: "+title);
		
		//Method 3 -> getCurrentUrl()
		//public String getCurrentUrl()
		//used to fetch url of current webpage
		//Syntax -> driver.getCurrentUrl();
		 
		 //fetch curl
		 String curl = driver.getCurrentUrl();
		 System.out.println("CurrentUrl:"+curl);
	}

}
