package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popups2 {
	public static void main(String[] args) throws InterruptedException {
		
/*
 * Method 3-> Alert/Javascript popups
 * b) Confirmation alert() -> this alert have 2 options 
 */
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		Thread.sleep(3000);
		
//By handling the Alert	
		
		//click on the confirmation alert button
		driver.findElement(By.xpath
				("//button[text()='Click for JS Confirm']")).click();
		
		
		//handle alert
		Alert at = driver.switchTo().alert();
		
		
		//fetch text
		System.out.println(at.getText());
		Thread.sleep(3000);
		
		//accept
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
			
//Without handling the Alert
		//click on the confirmation alert button
		driver.findElement(By.xpath
				("//button[text()='Click for JS Confirm']")).click();
		
		Thread.sleep(3000);
		
		String alt = driver.switchTo().alert().getText();
		System.out.println(alt);
		driver.switchTo().alert().dismiss();

		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
