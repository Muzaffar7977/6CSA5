package Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCookie {
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.twitter.com");
	Cookie temp=new Cookie("Simple Cookie","123456" );
	System.out.println(temp);    /*to see cookie print in console*/
	driver.manage().addCookie(temp);
	
}
}
