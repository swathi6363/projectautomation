package automationproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contact {
	ChromeDriver driver;

    @Before
    public void setup() {
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://allmaintenance.in/");
    }

    @Test
    public void test() {
    	driver.findElement(By.xpath("//*[@id=\"menu-item-33\"]/a")).click();
    	WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/section[8]/div/div[2]/div/div/div/div/form/div[2]/div/div/input")); 
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        element.sendKeys("swathi");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/section[8]/div/div[2]/div/div/div/div/form/div[3]/div/div/input")).sendKeys("swt@gmail.com");
        WebElement elet = driver.findElement(By.xpath("//*[@id=\"forminator-module-339\"]/div[6]/div/div/button")); 
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("arguments[0].scrollIntoView(true);", elet);
        elet.click();
    }

}
