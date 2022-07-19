package myPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
		Thread.sleep(3000);
		List<WebElement> birthmonth = driver.findElements(By.xpath("//select[@name=\"birthday_month\"]/option"));
		Thread.sleep(3000);
		System.out.println("total months for birth " + birthmonth.size());
		birthmonth.get(9).click();
		Thread.sleep(3000);
		
		//Second recommended.
		
		WebElement bmonth = driver.findElement(By.xpath("//select[@id='month']"));
		Select bmonth11 = new Select(bmonth);
		Thread.sleep(3000);
		bmonth11.selectByIndex(3);
		System.out.println(bmonth11.getFirstSelectedOption().getText());
		bmonth11.selectByVisibleText("Dec");
		System.out.println(bmonth11.getFirstSelectedOption().getText());
		bmonth11.selectByValue("1");
		System.out.println(bmonth11.getFirstSelectedOption().getText());
		
		
		
	}

}
