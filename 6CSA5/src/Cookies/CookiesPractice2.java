package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesPractice2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		Set<Cookie> allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		for(Cookie singleCookie:allCookies)
		System.out.println(singleCookie.getName());	
		Cookie temp=new Cookie("Selenium", "6");
		Cookie temp2=new Cookie("manual", "5");
		Cookie temp3=new Cookie("java", "4");
		driver.manage().addCookie(temp);
		driver.manage().addCookie(temp2);
		driver.manage().addCookie(temp3);
		allCookies=driver.manage().getCookies();
		System.out.println(allCookies.size());
		for(Cookie singleCookie:allCookies)
			System.out.println(singleCookie.getName());
		driver.manage().deleteCookieNamed("selenium");
		allCookies=driver.manage().getCookies();
		System.out.println(allCookies.size());
		for(Cookie singlecookie:allCookies)
			System.out.println(singlecookie.getName());
		driver.manage().deleteAllCookies();
		allCookies=driver.manage().getCookies();
		System.out.println(allCookies.size());
		for(Cookie singlecookie:allCookies)
			System.out.println(singlecookie.getName());
		
			
    }
}
