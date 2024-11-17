package automationproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Allbuttonworking {
	ChromeDriver driver;

    @Before 
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://allmaintenance.in/"); 
    }

    @Test
    public void test() {
        
    	driver.findElement(By.xpath("//*[@id=\"page\"]/div[1]/div/section[1]/div/div[1]/div/div/div/ul/li/a")).click(); 
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"page\"]/div[1]/div/section[1]/div/div[2]/div/div/div/ul/li/a")).click(); 
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"menu-item-36\"]/a")).click(); 
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"menu-item-35\"]/a")).click(); 
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"menu-item-34\"]/a")).click(); 
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"menu-item-33\"]/a")).click(); 
        driver.navigate().back();
        
        
       
    	
    }

}
