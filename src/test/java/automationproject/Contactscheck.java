package automationproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contactscheck {
	ChromeDriver driver;

	 @Before 
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.get("https://allmaintenance.in/"); 
	    }

	    @Test
	    public void test() {
	    	WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section[2]/div/div/div/section/div/div[1]/div/div/div/div/a")); 
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", element);
	        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section[2]/div/div/div/section/div/div[1]/div/div/div/div/a")).click(); 
	        driver.navigate().back();
	        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section[2]/div/div/div/section/div/div[2]/div/div/div/div/a")).click(); 
	        driver.navigate().back();
	        


}
	    }
