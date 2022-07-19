package myPackage;

import java.io.File;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURL {

	private static Object FileUtils;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.facebook.com");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		// driver.getCurrentUrl();
		// driver.navigate().to("https://www.google.co.in");
		// driver.navigate().back();
		String title1 = driver.getTitle();
		String CURL = driver.getCurrentUrl();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc.123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Password123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		File ScrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(ScrFile, new File("E:\\Screenshots\\Test.jpg"));

		Thread.sleep(1000);
		System.out.println(title1);
		System.out.println(CURL);
		
		// driver.close();

	}

}
