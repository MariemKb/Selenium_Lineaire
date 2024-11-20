package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) {

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("");

WebElement sourceElement = driver.findElement(By.id("draggable"));
WebElement tragetElement = driver.findElement(By.id("droppable"));

Actions actions = new Actions(driver);
actions.dragAndDrop(sourceElement, tragetElement).perform();

	}

}
