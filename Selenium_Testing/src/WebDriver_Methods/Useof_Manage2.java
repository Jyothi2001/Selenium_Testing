package WebDriver_Methods;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Useof_Manage2 {

//Method 7
//d) getSize() -> public Dimension(c) getSize()
//to fetch dimensions height and width
//Syntax -> driver.manage().window().getSize();

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//getSize()
		Dimension size = driver.manage().window().getSize();
		System.out.println("size:" +size);
		System.out.println(size.height);
		System.out.println(size.width);

//e)getPosition() -> public point(c) getPosition()
		//getPosition()
		Point position = driver.manage().window().getPosition();
		System.out.println("position:" +position);
		System.out.println(position.x);
		System.out.println(position.y);
		
		driver.quit();
	}

}
