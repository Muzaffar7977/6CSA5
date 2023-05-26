package Manage;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setPosition {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		Point p=new Point(60000,100000);
	    driver.manage().window().setPosition(p);
	    System.out.println(driver.manage().window().getPosition());
		
		
		
	}
}
