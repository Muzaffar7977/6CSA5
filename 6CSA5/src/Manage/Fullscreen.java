package Manage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fullscreen {
	  public static void main(String[] args) throws InterruptedException {
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.supercell.com");
	   Thread.sleep(3000);
	   driver.manage().window().fullscreen();
		
	}
	}



