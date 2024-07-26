package Find_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_PartialLinkText {
	public static void main(String[] args) {
		
//Method 6-> 
	//By.partialLinkText()-->we can pass complete linktext as well as
	//we can pass any portion of the link text		
			
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
					
					
			//click on login link
			driver.findElement(By.linkText("Log in")).click();
					
					

			
	}		

}
