package SearchContext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.whatsapp.com");
	driver.manage().window().maximize();
	driver.findElements(By.tagName("div"));
	System.out.println("element identified");

}
}
