package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cTitle {
	  public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hotstar.com");
		String title= driver.getTitle();
		System.out.println(title);
}
}