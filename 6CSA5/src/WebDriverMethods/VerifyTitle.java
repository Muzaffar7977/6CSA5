package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com");
	String ActualTitle=driver.getTitle();
	String ExpectedTitle="Amazon.com. Spend less. Smile more.";
	if(ActualTitle.equals(ExpectedTitle)) {
	System.out.println("PASS");	
	}
	else
	System.out.println("FAIL");
	

}
}