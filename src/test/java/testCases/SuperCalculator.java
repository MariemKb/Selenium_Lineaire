package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SuperCalculator {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		
		       
		        


		            driver.get("https://juliemr.github.io/protractor-demo/");

		           
		            WebElement firstValueField = driver.findElement(By.xpath("//input[@ng-model='first']"));
		            WebElement secondValueField = driver.findElement(By.xpath("//input[@ng-model='second']"));
		            WebElement goValueField = driver.findElement(By.xpath("//button[@id='gobutton']"));
		            firstValueField.sendKeys("10");
		            secondValueField.sendKeys("20");
		            goValueField.click();

		            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		            WebElement sumElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='ng-binding']")));
		            
		            String sumText;
		            do {
		                sumText = sumElement.getText().trim();
		                Thread.sleep(500); // Attendre 500ms avant de vérifier à nouveau
		            } while (!sumText.matches("\\d+"));

		            // Afficher la somme réelle
		            int sum = Integer.parseInt(sumText);
		            System.out.println("La somme est : " + sum);
}
		      //  } catch (InterruptedException e) {
		           // e.printStackTrace();
		      //  } finally {
		            // Fermer le navigateur
		        //    driver.quit();
		       // }

	}



		         
		            //JavascriptExecutor js = (JavascriptExecutor) driver;
		            //String sumText = ((String) js.executeScript("return arguments[0].innerText;", sumElement)).trim();
		            //WebElement sumElement = driver.findElement(By.xpath("//h2[@class='ng-binding']"));
		            //String sumText = sumElement.getText().trim();
		            //System.out.println("texte brut récupéré : "+ sumText);
		            
		            //if (sumText.matches("\\d+")) {

		       //int sum = Integer.parseInt(sumText);
		       //System.out.println("La somme est : " + sum);
		            //}else {
		          
		
			//System.out.println("le texte récupéré n'est pas un nombre valide : " + sumText);
		            

	
	//} finally {
		//driver.quit();
	//}
	//}

		    

	//}


