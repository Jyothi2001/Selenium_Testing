package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popups3 {
	public static void main(String[] args) throws InterruptedException {
		
/* Method 3 -> Alert /  JavaScript Popup
 * c) Prompt alert() -> have more than 2 options and a text-field too
 */
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		
//By handling the Alert
		//click on the prompt alert button
		driver.findElement(By.xpath
				("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		
		//handle alert
		Alert at = driver.switchTo().alert();
		
		//sendkeys
		at.sendKeys("mobiles");
		Thread.sleep(3000);
		
		//fetch the message
		System.out.println(at.getText());
		Thread.sleep(2000);
		
		//accept
		at.accept();
		Thread.sleep(3000);

	driver.quit();

	}

}
