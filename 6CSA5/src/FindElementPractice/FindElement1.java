package FindElementPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement1 {
  public static void main(String[] args) {
	  WebDriver driver=new ChromeDriver();
		driver.get("https://www.hp.com");
		driver.manage().window().maximize();
		driver.findElements(By.tagName("ul"));
		System.out.println("element identified");
}
}
