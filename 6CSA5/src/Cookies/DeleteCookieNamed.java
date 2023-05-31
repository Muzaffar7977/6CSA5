package Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookieNamed {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		Cookie temp=new Cookie("Selenium", "6");
		driver.manage().addCookie(temp);
		driver.manage().deleteCookieNamed("selenium");
		
        
	}
}
