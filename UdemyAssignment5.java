package Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UdemyAssignment5 {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("//*[@id='content']/div/a")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		String parentWindowID= it.next();
		String childWindowID= it.next();
		driver.switchTo().window(childWindowID);
		
		String pgName = driver.findElement(By.xpath("/html/body/div/h3")).getText();
		System.out.println(pgName);
		driver.switchTo().window(parentWindowID);
		System.out.println(driver.findElement(By.xpath("//*[@id='content']/div/h3")).getText());
		driver.quit();
		
	}
	

}
