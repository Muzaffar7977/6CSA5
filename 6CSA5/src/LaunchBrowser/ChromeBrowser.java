package LaunchBrowser;
 
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
  public static void main(String[] args) {
	System.setProperty("webdriver.chrome.Driver", "./chromedriver.exe");
	ChromeDriver d= new ChromeDriver();
	
}
}
