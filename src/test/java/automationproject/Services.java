package automationproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Services {
	ChromeDriver driver;

    @Before
    public void setup() {
        
        driver = new ChromeDriver();
        driver.manage().window().maximize(); 
        driver.get("https://allmaintenance.in/");
    }

    @Test
    public void test() {
    	driver.findElement(By.xpath("//*[@id=\"menu-item-34\"]/a")).click();
    	
    }

}
