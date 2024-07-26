package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//Method 6 -> GetLocation()
//of specific web-element

public class Get_Location {
	
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//identify email
	WebElement email = driver.findElement(By.id("email"));
	
	//location
	Point loc = email.getLocation();
	System.out.println(loc);
	
	//quit
	driver.quit();
}

}
