package WebDriver_Methods;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Useof_Navigate_To { 
	
	public static void main(String[] args) throws MalformedURLException {
		
	//d) to(String url)
	//it is selenium implemented method
	//driver.navigate().to("url of the application");
	
	// e) to(URL url)
	// it is java implemented method
	// URL-->inbuilt class present in java.net package
	//Syntax-->URL u=new URL("url of the application");
	// driver.navigate().to(u);

	WebDriver driver =  new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.facebook.com");
	
	//to(Url url)
	URL u = new URL("https://www.amazon.in/");
	driver.navigate().to(u);
	
	driver.quit();
	}
}