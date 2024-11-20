package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementDemo {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("");
Actions actions = new Actions(driver);
WebElement element = driver.findElement(By.id("elementId"));
actions.moveToElement(element).perform();
driver.quit();

	}

}
