package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElement_SS {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		
		//web element ss
		//step 1==>identify the webelement
		WebElement link = driver.findElement(By.linkText("Register"));
		
		File temp = link.getScreenshotAs(OutputType.FILE);
		File perm=new File("./Screenshot/register.png");
		FileHandler.copy(temp, perm);
		
		Thread.sleep(2000);
		
		//quit
		driver.quit();
	}

}
