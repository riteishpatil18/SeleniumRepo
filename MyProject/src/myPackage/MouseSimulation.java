package myPackage;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		WebElement elc = driver.findElement(By.xpath("//div[contains(text(),'Electronics')]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(elc).build().perform();
		act.contextClick(elc).build().perform();
	} 

}
