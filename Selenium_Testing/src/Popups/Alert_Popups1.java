package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popups1 {
	public static void main(String[] args) throws InterruptedException {
		
		
/* Method 3-> Alert/ Javascript Popups
 * Three types a) simple b)prompt c)confirmation
 * a) simple alert -> an alert having only one option 
 */

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(3000);
	
//If u want popup By handling the alert->
		
	//click on js alert button
		driver.findElement(By.xpath
				("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(2000);
		
		//handle an alert
		Alert at = driver.switchTo().alert();
		
		//fetch alert message
		System.out.println(at.getText());// to get text
		
		//accept
		at.accept();
		Thread.sleep(2000);
	
		
 //If u want a popup without handling the alert->
	driver.findElement(By.xpath
	("//button[text()='Click for JS Alert']")).click();	
		   
    String alt = driver.switchTo().alert().getText();
	System.out.println(alt);
	driver.switchTo().alert().accept();

		Thread.sleep(2000);
		
		driver.quit();
	
	}

}
