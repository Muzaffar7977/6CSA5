package Manage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setSize {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		Dimension p=new Dimension(600,600);
		driver.manage().window().setSize(p);
		System.out.println(driver.manage().window().getSize());
	}
}