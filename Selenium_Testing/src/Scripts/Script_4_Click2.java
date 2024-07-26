package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_4_Click2 {
	
	public static void main(String[] args) throws InterruptedException {
		//to verify user can able to choose radio buttons
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);	
		
	//click on female radio button
		driver.findElement(By.cssSelector("input[value='1']")).click();
		Thread.sleep(2000);
		
	//click on male radio button
		driver.findElement(By.cssSelector("input[value='2']")).click();
		Thread.sleep(2000);
		
	//click on custom radio button
		driver.findElement(By.cssSelector("input[value='-1']")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
