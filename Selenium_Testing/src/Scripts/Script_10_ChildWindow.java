package Scripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_10_ChildWindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/14");
		Thread.sleep(20000);
		
		
		// click on compare button
		driver.findElement(By.xpath(
"//*[name()='svg' and @class='MuiSvgIcon-root MuiSvgIcon-colorPrimary MuiSvgIcon-fontSizeMedium css-2c7buj']"))
				.click();
// fetch p-wid
		String pwid = driver.getWindowHandle();
		
// fetch all-wids
		Set<String> allWids = driver.getWindowHandles();
		
// switch the control to e-bay window
		for (String wid : allWids) {
			driver.switchTo().window(wid);
			String cUrl = driver.getCurrentUrl();
			if (cUrl.equals("ebay")) {
				driver.manage().window().maximize();
			}
		}
		
// identify the search field and pass iphone
		driver.findElement(By.xpath
		("//input[@class='gh-tb ui-autocomplete-input']"))
		.sendKeys("iphone 15 pro max",Keys.ENTER);
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
