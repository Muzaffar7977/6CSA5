package FindElementPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement7 {
	public static void main(String[] args) {
		  WebDriver driver=new ChromeDriver();
			driver.get("https://www.sony.com");
			driver.manage().window().maximize();
			driver.findElements(By.tagName("picture"));
			System.out.println("element identified");
	}

}
