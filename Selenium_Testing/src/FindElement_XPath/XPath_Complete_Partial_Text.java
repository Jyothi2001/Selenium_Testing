package FindElement_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Complete_Partial_Text {
	
	public static void main(String[] args) throws InterruptedException {
		
//xpath by complete text:
//tagname[text()='complete text']
		
//xpath by partial text:
//tagname[contains(text(),'visible text')]

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	
	//choose excellent
	driver.findElement(By.xpath("//label[text()='Excellent']")).click();
	Thread.sleep(2000);
	
	//choose good
	driver.findElement(By.xpath("//label[contains(text(),'Go')]")).click();
	Thread.sleep(2000);
	
	//choose poor
	driver.findElement(By.xpath("//label[contains(text(),'Poor')]")).click();
	Thread.sleep(2000);
	
	//choose bad
	driver.findElement(By.xpath("//label[text()='Very bad']")).click();
	Thread.sleep(2000);
	
	driver.quit();
	}

}
