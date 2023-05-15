package SeleniumMamla;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles_WithTitle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parent=driver.getTitle();
		driver.findElement(By.id("newWindowBtn")).click();
		driver.findElement(By.id("newWindowsBtn")).click();
		Set<String> wind = driver.getWindowHandles();
		for (String wh : wind) {
			String allWind = driver.switchTo().window(wh).getTitle();
			if(allWind.contains(parent)) {
				
			}
			else {
				driver.close();
			}
		}

	}

}
