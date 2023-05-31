package SearchContext;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.whatsapp.com");
	driver.manage().window().maximize();
	System.out.println("element identified");

}
}
