package FindElementPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements6 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airtel.com");
		List<WebElement> element = driver.findElements(By.tagName("script"));
		System.out.println(element.size());
		System.out.println("element identified");
	}
}
