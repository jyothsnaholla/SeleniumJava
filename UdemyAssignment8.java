package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UdemyAssignment8 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//auto suggesting dropdown
		driver.findElement(By.id("autocomplete")).sendKeys("Ind");
Thread.sleep(2000);
driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);
System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));	
	}
}
