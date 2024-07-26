package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_TagName {
	
//Method 10 -> getTagName()
	
	public static void main(String[] args) {
		
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		//getAttribute()
		WebElement login = driver.findElement(By.name("login"));
		String tag = login.getTagName();
		System.out.println(tag);
	
	
	//quit
	driver.quit();
	}

}