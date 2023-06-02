package FindElementPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdPractice {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		driver.findElement(By .id("email"));
		 System.out.println("element identified");
		 
		 driver.get("https://www.netflix.com");
		 driver.findElement(By .id("appMountPoint"));
		 System.out.println("element identified");
		 
			 driver.get("https://www.amazon.com");
				driver.findElement(By .id("a-page"));
				 System.out.println("element identified");
			
				 driver.get("https://www.flipkart.com");
					driver.findElement(By .id("container"));
					 System.out.println("element identified");
					 
					 driver.get("https://www.lenskart.com");
						driver.findElement(By .id("banner-0"));
						 System.out.println("element identified");
						 
						 driver.get("https://www.jiomart.com");
							driver.findElement(By .id("egift_url"));
							 System.out.println("element identified");
							 
							driver.get("https://www.spicejet.com");
								driver.findElement(By .id("react-root"));
								 System.out.println("element identified");
								
									driver.get("https://www.gmail.com");
									driver.findElement(By .id("base-js"));
									 System.out.println("element identified");
									
										driver.get("https://www.dominos.com");
										driver.findElement(By .id("moe-push-div"));
										 System.out.println("element identified");	}
}
