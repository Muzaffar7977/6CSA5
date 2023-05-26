package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://open.spotify.com/genre/0JQ5DAqbMKFHCxg5H5PtqW");
	System.out.println(driver.getCurrentUrl());
}
}
