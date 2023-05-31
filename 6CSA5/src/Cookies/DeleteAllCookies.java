package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DeleteAllCookies {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		Set<Cookie> allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		driver.manage().deleteAllCookies();
		
		
        
	}
}