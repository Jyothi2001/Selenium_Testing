package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_8_Navigate {
	public static void main(String[] args) throws InterruptedException {

		/*TEST SCENARIO
		*TO VERIFY USER CAN ABLE TO NAVIGATE FROM WELCOME PAGE TO MAJOR PAGES

		*TEST CASE
		*GO TO CHROME
		*NAVIGATE TO DWS
		*CLICK ON REGISTER LINK
		*NAVIGATE BACK TO HOME PAGE
		*CLICK ON LOGIN PAGE
		*NAVIGATE TO HOME PAGE
		*/
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		String t1 = driver.getTitle();
		String c1 = driver.getCurrentUrl();
		System.out.println("before clicking on register");
		System.out.println(t1);
		System.out.println(c1);
		Thread.sleep(2000);
		
//click on register link
		driver.findElement(By.linkText("Register")).click();
		String t2 = driver.getTitle();
		String c2 = driver.getCurrentUrl();
		System.out.println("after clicking register link");
		System.out.println(t2);
		System.out.println(c2);
		
		if(t2.contains("Register")&&c2.contains("register"))
		{
			System.out.println("navigated to register page successfully");
		}
		else
		{
			System.out.println("register page not displayed");
		}
		
//come back
		Thread.sleep(1000);
		driver.navigate().back();
				
//click on login
		Thread.sleep(1000);
		driver.findElement(By.linkText("Log in")).click();
				
//come back
		Thread.sleep(1000);
		driver.navigate().back();
		
		driver.quit();
	}

}
