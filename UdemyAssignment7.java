package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UdemyAssignment7 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr"));
		int rowCount = rows.size() - 1;
		System.out.println("Number of rows " + rowCount);
		
		List<WebElement> cols=driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr/th"));
		int colCount = cols.size();
		System.out.println("Number of columns " + colCount);
		
		
		List<WebElement> secondRow = driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr[3]/td"));
		
		System.out.println("Second row Column 1 " + secondRow.get(0).getText());
		System.out.println("Second row Column 2 "+ secondRow.get(1).getText());
		System.out.println("Second row Column 3 "+ secondRow.get(2).getText());
	}

}
