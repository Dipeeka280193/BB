/**
 * 
 */
package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * 
 */
public class DranAndDrop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
             
	          
	          WebDriver driver = new ChromeDriver();
	          driver.manage().window().maximize();
	          driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	         
	          WebElement osloBox = driver.findElement(By.id("box1"));
	          WebElement norwayBox = driver.findElement(By.id("box101"));
	        
	          Actions actions = new Actions(driver);
	          actions.dragAndDrop(osloBox, norwayBox).build().perform();
	        
	       }

	

	}


