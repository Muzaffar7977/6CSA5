package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrl {
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com");
	String actualURL= driver.getCurrentUrl();
	String ExpectedURL= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	if(actualURL.equals(ExpectedURL))
		System.out.println("PASS");
	else
		System.out.println("FAIL");
}
}
