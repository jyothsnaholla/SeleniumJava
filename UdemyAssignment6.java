package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class UdemyAssignment6 {
	
	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//checkbox
		driver.findElement(By.xpath("//*[@id='checkBoxOption2']")).click();
		String checkboxLabel = driver.findElement(By.xpath("//label[@for='benz']")).getText();

//dropdown
WebElement dropdown = driver.findElement(By.xpath("//*[@id='dropdown-class-example']"));
Select select = new Select(dropdown);
select.selectByVisibleText(checkboxLabel);
//Alerts
driver.findElement(By.xpath("//*[@id='name']")).sendKeys(checkboxLabel);
driver.findElement(By.xpath("//*[@id='alertbtn']")).click();
String AlertMsg = driver.switchTo().alert().getText();
if(AlertMsg.contains(checkboxLabel))
{
	System.out.println(checkboxLabel +" is present in the alert message");
}
	}

}
