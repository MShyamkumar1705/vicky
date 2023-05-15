package SeleniumMamla;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindoHandles_withArrayList {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("newWindowBtn")).click();
		driver.findElement(By.id("newWindowsBtn")).click();
		Set<String> wind = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(wind);
		String parent=al.get(0);
		String child1=al.get(1);
		String child2=al.get(2);
		for (String wh : wind) {
			driver.switchTo().window(wh);
			if(wh.contains(child2)) {
				driver.switchTo().window(child2);
			}
			else {
				driver.close(); 
			}
		}

	}

}
