package Find_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_CssSelector {
	
	public static void main(String[] args) throws InterruptedException {
	
//Method 5 -> by.cssSelector(attribute value)
//choose male radio button in fb signup page
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		
		//click on male radio button
		driver.findElement(By.cssSelector("input[value='2']")).click();
		
	}

}
