package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.voot.com");
	driver.get("https://www.zee5.com");
	driver.navigate().to("https://www.amazon.com");
	driver.navigate().to("https://www.flipkart.com");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
}
}
