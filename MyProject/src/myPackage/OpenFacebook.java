package myPackage;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFacebook {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.twitter.com");
		File ScrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//	FileUtils.copyFile(ScrFile, new File("E:\\Screenshots\\Test.jpg"));
		FileHandler.copy(ScrFile, new File("E:\\Screenshots\\Test.png"));

	}

}
