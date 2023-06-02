package SearchContext;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class FindElements {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		List<WebElement> element = driver.findElements(By.tagName("div"));
		System.out.println(element.size());
		System.out.println("element identified");
	}
}
