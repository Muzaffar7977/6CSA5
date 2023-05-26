package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleURL2 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver. get("https:www.marvel.com");
	String ActualTitle=driver.getTitle();
	String ExpectedTitle="Marvel.com | The Official Site for Marvel Movies, Characters, Comics, TV";
	if(ActualTitle.equals(ExpectedTitle)) {
	System.out.println("PASS");	
	}
	else
	System.out.println("FAIL");
	
driver.get("https:www.marvel.com");
String actualURL= driver.getCurrentUrl();
String ExpectedURL= "https://www.marvel.com/";
if(actualURL.equals(ExpectedURL))
	System.out.println("PASS");
else
	System.out.println("FAIL");
}
}



