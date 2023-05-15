package SeleniumMamla;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles_With_Iterator {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("newWindowBtn")).click();
		driver.findElement(By.id("newWindowsBtn")).click();
		Set<String> wind = driver.getWindowHandles();
		Iterator<String> it=wind.iterator();
		String parent=it.next();
		String child1=it.next();
		String child2=it.next();
		driver.switchTo().window(parent);
		driver.get("https://www.flipkart.com");
		driver.switchTo().window(child1);
		driver.get("https://www.myntra.com");
		driver.switchTo().window(child2);
		driver.get("https://www.amazon.com");
		
	}

}
