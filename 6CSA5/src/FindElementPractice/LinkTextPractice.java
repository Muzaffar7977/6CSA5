package FindElementPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextPractice {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		driver.findElement(By.linkText("Forgotten password?"));
		System.out.println("element identified");
		
		driver.get("https://www.flipkart.com");
		driver.findElement(By.linkText("Appliances"));
		System.out.println("element 2 identified");
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Shopping cart"));
		System.out.println("element 3 identified");
		
		driver.get("https://www.lenskart.com");
		driver.findElement(By.linkText("Aqualens"));
		System.out.println("element 4 identified");
		
		driver.get("https://www.Ajio.com");
		driver.findElement(By.linkText("HOME AND KITCHEN"));
		System.out.println("element 5 identified");
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("Login"));
		System.out.println("element 6 identified");
		
    	driver.get("https://www.titan.com");
		driver.findElement(By.linkText("Research & Trade Updates"));
		System.out.println("element 7 identified");
		
		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("Images"));
		System.out.println("element 8 identified");
		
		driver.get("https://www.adidas.com");
		driver.findElement(By.linkText("running shoes"));
		System.out.println("element 9 identified");
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.linkText("Login"));
		System.out.println("element 10 identified");
		
	}
}
