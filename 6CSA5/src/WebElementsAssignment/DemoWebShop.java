package WebElementsAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Muzaffar");
		driver.findElement(By.id("LastName")).sendKeys("Khan");
		driver.findElement(By.id("Email")).sendKeys("muzaffarkhan3098@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Khan@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Khan@123");
		driver.findElement(By.id("register-button")).click();
		driver.close();
		
	}
}
