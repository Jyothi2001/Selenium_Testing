package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	public static void main(String[] args) throws InterruptedException {
		
//Method 9 -> getWindowHandle()
//getWindowHandle()-->public String getWindowHandle()
//it is used to fetch window id-->only one window id-->parent id
//syntax-->driver.getWindowHandle()
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(2000);
		
		//fetch parent id
		String wid = driver.getWindowHandle();
		System.out.println(wid);
		
		Thread.sleep(2000);
		
		
		driver.quit();
		
	}

}
