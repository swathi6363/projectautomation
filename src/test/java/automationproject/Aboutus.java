package automationproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aboutus {
    ChromeDriver driver;

    @Before
    public void setup() {
        // Set up ChromeDriver (ensure the path is set correctly if needed)
        driver = new ChromeDriver();
        driver.manage().window().maximize(); // Optional: maximize the browser window
        driver.get("https://allmaintenance.in/");
    }

    @Test
    public void test() {
        // Navigate to the "About Us" section
        driver.findElement(By.xpath("//*[@id=\"menu-item-35\"]/a")).click();
        
        // Scroll to a specific element
        WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section[2]/div/div[1]/div/div[3]/div/div/a")); 
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        
       
        element.click();
        driver.switchTo().alert().dismiss();
    }

    @After
    public void tearDown() {
        // Close the browser after the test
        if (driver != null) {
            driver.quit();
        }
    }
}
