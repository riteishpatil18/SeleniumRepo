package myPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;
import javax.swing.text.html.HTMLDocument.Iterator;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;

import com.google.j2objc.annotations.Property;

public class Popup {

	public static void main(String[] args) throws IOException {
		
		Logger logger = Logger.getLogger("Popup");
		PropertyConfigurator.configure("C:\\Users\\Ritesh\\eclipse-workspace\\MyProject\\Log4j.properties");
		
		File src = new File("C:\\Users\\Ritesh\\eclipse-workspace\\MyProject\\Repository\\object.properties"); //location of file
		FileInputStream fi = new FileInputStream(src);
		Properties pro = new Properties();
		pro.load(fi);
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://demoqa.com/browser-windows");
		driver.get(pro.getProperty("URL"));
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		driver.manage().window().maximize();
		logger.info("URL open and maximise");
	
		java.util.Set<String> PopupID = driver.getWindowHandles();
		System.out.println(PopupID);
		System.out.println(PopupID.size());
		logger.info("Popup");
		
		java.util.Iterator<String> abc = PopupID.iterator();
		
		String window1 = abc.next();
		//String window2 = abc.next();
		
		driver.switchTo().window(window1);
		System.out.println(window1);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
