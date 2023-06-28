package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBy {
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.actimind.com/");
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	for(int i=0; i<= 1000;i++) {
		jse.executeScript("window.scrollBy(0,5)");
	}
	for(int i=0; i<=1000; i++) {
		jse.executeScript("window.scrollBy(0,-5)");
	}
}
}
