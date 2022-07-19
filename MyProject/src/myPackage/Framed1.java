package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framed1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.paytm.com");
		driver.findElement(By.xpath("//span[normalize-space()='Sign In']")).click();
		driver.manage().window().maximize();
		int framesize = driver.findElements(By.xpath("//iframe[@scrolling='no']")).size();
		
		for(int i=0; i< framesize; i++)
			driver.switchTo().frame(i);
			driver.findElement(By.xpath("//a[1]//img[1]")).click();
			
		
		

	}

}
