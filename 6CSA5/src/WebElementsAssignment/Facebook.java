package WebElementsAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Muzaffar");
		driver.findElement(By.name("lastname")).sendKeys("Khan");
		driver.findElement(By.name("reg_email__")).sendKeys("muzaffarkhan3098@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("muzaffarkhan3098@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Khan@123");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.close();
		
	}
}
