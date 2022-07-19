package myPackage;



import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
		System.out.printf("ALl frames", + allFrames.size());
		
		for(int i = 0;i< allFrames.size();i++) { 
			driver.switchTo().frame(i);
			
			if (driver.findElement(By.id("draggable")).isDisplayed() && driver.findElement(By.id("droppable")).isDisplayed()) {
				Actions act = new Actions(driver);
				act.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
				System.out.println("element found in " + (i+1) + "frame");
				act.dragAndDropBy(driver.findElement(By.id("draggable")),30,30).build().perform();
				
			}
		}
		
		
	}

}
