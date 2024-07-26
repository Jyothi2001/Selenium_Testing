package WebDriver_Methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

//Method 10 - > getWindowHandles()
//getWindowHandles()-->public Set<String> getWindowHandles();
//it is used to fetch all the window ids-->parent+all child ids
//syntax-->driver.getWindowHandles();
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		Thread.sleep(2000);
		
		//click on open new window button
		driver.findElement(By.id("newWindowBtn")).click();
				
		Thread.sleep(2000);
		
		//fetch all window ids
		Set<String> allIds = driver.getWindowHandles();
		for (String id : allIds) {
		System.out.println(id);
	}
		driver.quit();

}
}
