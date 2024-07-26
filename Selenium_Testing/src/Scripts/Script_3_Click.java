package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_3_Click {

	public static void main(String[] args) {
		/*test scenario
		*-->validate user can able to login with valid credentials
		
		*test-case
		*1-->go to chrome
		*2-->navigate to fb
		*3-->enter email--"abc@gamil.com"
		*4-->enter password-->"Abc@123"
		*5-->click on login button	
		*/	
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		//enter email
		driver.findElement(By.id("email")).sendKeys("abc@gamil.com");
		//enter password
		driver.findElement(By.name("pass")).sendKeys("Abc@123");
		//click on login button
		driver.findElement(By.name("login")).click();
		
		driver.quit();
	}
}
