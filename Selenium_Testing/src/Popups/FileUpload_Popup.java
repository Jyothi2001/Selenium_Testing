package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_Popup {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(3000);
		
		//identify choose file
		WebElement fileUpload = driver.findElement(By.id("file-upload"));
		
		fileUpload.sendKeys
("C:\\Users\\User\\Desktop\\CSE\\PADAVALA JYOTHI RESUME.pdf");
		
		//click on upload button
		driver.findElement(By.id("file-submit")).click();
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
