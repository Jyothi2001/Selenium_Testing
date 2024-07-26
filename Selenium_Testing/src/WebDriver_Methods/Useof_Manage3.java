package WebDriver_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Useof_Manage3 {
	public static void main(String[] args) throws InterruptedException {
		
//Method 7
//f)setSize() -> public void setSize()
//used to set the size of window
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//setSize()
		Dimension d = new Dimension(100, 100);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		
//g) setPosition() -> public void setPosition()
//to set the position
		
		//setPosition()
		Point p = new Point(20, 20);
		driver.manage().window().setPosition(p);
		
		driver.quit();
	}

}
