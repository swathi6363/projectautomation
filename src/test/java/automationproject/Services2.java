package automationproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Services2 {
	ChromeDriver driver;

    @Before
    public void setup() {
        
        driver = new ChromeDriver();
        driver.manage().window().maximize(); 
        driver.get("https://allmaintenance.in/");
    }

    @Test
    public void test() {
    	WebElement d=driver.findElement(By.xpath("//*[@id=\"menu-item-34\"]/a/i"));
    	d.click();
    	driver.findElement(By.xpath("//*[@id=\"menu-item-757\"]/a")).click();
    	driver.navigate().back();
    	driver.findElement(By.xpath("//*[@id=\"menu-item-34\"]/a/i")).click();
    	
    	driver.findElement(By.xpath("//*[@id=\"menu-item-756\"]/a")).click();
    	driver.navigate().back();
    	driver.findElement(By.xpath("//*[@id=\"menu-item-34\"]/a/i")).click();
    
    	driver.findElement(By.xpath("//*[@id=\"menu-item-753\"]/a")).click();
    	driver.navigate().back();
    	driver.findElement(By.xpath("//*[@id=\"menu-item-34\"]/a/i")).click();

    	driver.findElement(By.xpath("//*[@id=\"menu-item-752\"]/a")).click();
    	driver.navigate().back();
    	driver.findElement(By.xpath("//*[@id=\"menu-item-34\"]/a/i")).click();

    	driver.findElement(By.xpath("//*[@id=\"menu-item-755\"]/a")).click();
    	driver.navigate().back();
    	driver.findElement(By.xpath("//*[@id=\"menu-item-34\"]/a/i")).click();

    	driver.findElement(By.xpath("//*[@id=\"menu-item-754\"]/a")).click();
    	driver.navigate().back();
    	driver.findElement(By.xpath("//*[@id=\"menu-item-34\"]/a/i")).click();

    	driver.findElement(By.xpath("//*[@id=\"menu-item-877\"]/a")).click();
    	driver.navigate().back();
    	
    	
    }

}
