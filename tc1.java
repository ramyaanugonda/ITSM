

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class tc1 {

	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
		 driver.get("https://facebook.com");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("u_0_1")).sendKeys("abc");
		 driver.findElement(By.id("u_0_3")).sendKeys("def");
		 driver.findElement(By.id("u_0_6")).sendKeys("8019430336");
		 driver.findElement(By.id("u_0_9")).sendKeys("8019430336");
		 driver.findElement(By.id("u_0_b")).sendKeys("abc@123");
		 WebElement day = driver.findElement(By.id("day"));
		 Select d = new Select(day);
		 d.selectByVisibleText("21");
		 WebElement Month = driver.findElement(By.id("month"));
		 Select m = new Select(Month);
		 m.selectByVisibleText("Jun");
		 
		 WebElement Year = driver.findElement(By.id("year"));
		 Select y = new Select(Year);
		 y.selectByIndex(7);
		 driver.findElement(By.id("u_0_e")).click();
		 driver.findElement(By.id("u_0_j")).click();
		 
		
	}

}
