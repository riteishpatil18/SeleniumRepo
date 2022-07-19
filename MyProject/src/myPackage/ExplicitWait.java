package myPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();

		List<WebElement> birthmonth = driver.findElements(By.xpath("//select[@name=\"birthday_month\"]/option"));

		System.out.println("total months for birth " + birthmonth.size());
		birthmonth.get(9).click();
	}

}
