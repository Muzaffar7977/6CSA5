package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleURL3 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver. get("https:www.hotstar.com");
	String ActualTitle=driver.getTitle();
	String ExpectedTitle="Disney+ Hotstar - Watch TV Shows, Movies, Specials, Live Cricket & Football";
	if(ActualTitle.equals(ExpectedTitle)) {
	System.out.println("PASS");	
	}
	else
	System.out.println("FAIL");
	
driver.get("https:www.marvel.com");
String actualURL= driver.getCurrentUrl();
String ExpectedURL= "https://www.hotstar.com/in/home?ref=%2Fin";
if(actualURL.equals(ExpectedURL))
	System.out.println("PASS");
else
	System.out.println("FAIL");
}
}






