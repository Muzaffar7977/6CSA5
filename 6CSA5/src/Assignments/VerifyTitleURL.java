package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleURL {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver. get("https:www.facebook.com");
	String ActualTitle=driver.getTitle();
	String ExpectedTitle="Facebook – log in or sign up";
	if(ActualTitle.equals(ExpectedTitle)) {
	System.out.println("PASS");	
	}
	else
	System.out.println("FAIL");
	
driver.get("https:www.facebook.com");
String actualURL= driver.getCurrentUrl();
String ExpectedURL= "https://www.facebook.com/";
if(actualURL.equals(ExpectedURL))
	System.out.println("PASS");
else
	System.out.println("FAIL");
}
}
