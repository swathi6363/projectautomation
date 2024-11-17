package automationproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aboutus2 {
	ChromeDriver driver;

    @Before
    public void setup() {
        
        driver = new ChromeDriver();
        driver.manage().window().maximize(); 
        driver.get("https://allmaintenance.in/");
    }

    @Test
    public void test() {
    	WebElement element = driver.findElement(By.xpath("//*[@id=\"page\"]/div[3]/div/section[2]/div/div[2]/div/div[3]/div/ul/li[7]/a")); 
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        driver.findElement(By.xpath("//*[@id=\"page\"]/div[3]/div/section[2]/div/div[2]/div/div[3]/div/ul/li[1]/a")).click(); 
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"page\"]/div[3]/div/section[2]/div/div[2]/div/div[3]/div/ul/li[2]/a")).click(); 
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"page\"]/div[3]/div/section[2]/div/div[2]/div/div[3]/div/ul/li[3]/a")).click(); 
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"page\"]/div[3]/div/section[2]/div/div[2]/div/div[3]/div/ul/li[4]/a")).click(); 
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"page\"]/div[3]/div/section[2]/div/div[2]/div/div[3]/div/ul/li[5]/a")).click(); 
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"page\"]/div[3]/div/section[2]/div/div[2]/div/div[3]/div/ul/li[6]/a")).click(); 
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"page\"]/div[3]/div/section[2]/div/div[2]/div/div[3]/div/ul/li[7]/a")).click(); 
        driver.navigate().back();

    }

}
