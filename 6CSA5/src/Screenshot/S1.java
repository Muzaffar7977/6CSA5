package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class S1 {
  public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.fb.com/");
	File file=new File("./screenshot.png");
	WebElement username=driver.findElement(By.id("email"));
	File screenshot=username.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(screenshot, file);
}
}
