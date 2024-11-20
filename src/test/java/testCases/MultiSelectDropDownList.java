package testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDownList {

	public static void main(String[] args) throws InterruptedException {


   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://demoqa.com/select-menu");
   
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0, 500)", "");
	
	WebElement fourthSelectMenu = driver.findElement(By.xpath("//b[contains(text(),'Multiselect drop down')]//following::input[1]"));

    // Create a Select object
	//Thread.sleep(3000);
    Select select = new Select(fourthSelectMenu);
    
    //select.selectByIndex(3);
    

    // Indices to select
    int[] indices = {1, 2, 3};

    // Loop through indices and select each one
    for (int index : indices) {
        select.selectByIndex(index);
        
   

    }
	}
}
	//WebElement firstSelectMenu = driver.findElement(By.cssSelector(".css-2b097c-container . css-yk16xz-control select"));


		        //Select select = new Select(firstSelectMenu);

		      
		        //if (select.isMultiple()) {
	
		            //int[] indices = {1, 2, 3};

		            
		            //for (int index : indices) {
		                //select.selectByIndex(index);
		           // }


		            
		        // Close the WebDriver
		        //driver.quit();

		        
		   
	 
	 


