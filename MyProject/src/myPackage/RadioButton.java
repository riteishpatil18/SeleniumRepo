package myPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.facebook.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
		Thread.sleep(3000);
		List<WebElement> radio1 = driver.findElements(By.xpath("//label[contains(@class,'mt')]"));
	
		System.out.println("total radio button " + radio1.size());
		String expResult = "Female";

		for (int i = 0; i < radio1.size(); i++) {
			if (radio1.get(i).getText().equalsIgnoreCase(expResult)) {
				radio1.get(i).click();
				System.out.println(expResult);
				break;
			}

		}

	}
}