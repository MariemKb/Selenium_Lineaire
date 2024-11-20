package testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class YoutubeFluentWait {

	public static void main(String[] args) {
	
 //WebDriver driver = new ChromeDriver();

		            // Open YouTube
	//	            driver.get("https://www.youtube.com");

		            // Search for a music title
		//            WebElement searchBox = driver.findElement(By.name("search_query"));
		  //          searchBox.sendKeys("ludovico einaudi - experience");

		            // Click the search button
		    //       WebElement searchButton = driver.findElement(By.id("search-icon-legacy"));
	//	           searchButton.click();
//
		            // Define a FluentWait
		//           FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
		  //                .withTimeout(Duration.ofSeconds(40))  // Max 30 seconds wait
		    //              .pollingEvery(Duration.ofSeconds(5))  // Poll every 5 seconds
		      //             .ignoring(NoSuchElementException.class);  // Ignore NoSuchElementException

		        //    Wait for the music title to appear and click on it
		          // WebElement musicTitle = fluentWait.until(new Function<WebDriver, WebElement>() {
		            //    public WebElement apply(WebDriver driver) {
		              //    return driver.findElement(By.xpath("//a[@title='Ludovico Einaudi - Experience (Live At Fabric, London/2013)']"));
		              // }
		         //  });

		            // Click the music link
		           //WebElement musicTitle = driver.findElement(By.xpath("//a[@title='Ludovico Einaudi - Experience (Live At Fabric, London/2013)']"));
		            
		          // musicTitle.click();

		            // Wait for the video page to load and the play button to be visible (optional)
		          //  fluentWait.until(new Function<WebDriver, WebElement>() {
		                //public WebElement apply(WebDriver driver) {
		                  //  return driver.findElement(By.cssSelector("button.ytp-play-button"));
		              }
		           // });

		           // System.out.println("Video clicked and playing!");

		       
}
	




