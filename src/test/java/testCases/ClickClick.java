package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open a web page
        driver.get("https://www.marjanemall.ma/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement sliderLink = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.overlay-link")));

        // Use JavaScript to click the element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", sliderLink);

        // Close the driver
        driver.quit();

	}

}
