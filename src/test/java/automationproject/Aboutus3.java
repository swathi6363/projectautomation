package automationproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aboutus3 {
	 ChromeDriver driver;

	    @Before
	    public void setup() {
	       
	        driver = new ChromeDriver();
	        driver.manage().window().maximize(); 
	        driver.get("https://allmaintenance.in/");
	    }

	    @Test
	    public void test() {
	        
	        driver.findElement(By.xpath("//*[@id=\"menu-item-35\"]/a")).click();
	        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section[1]/div[2]/div[2]/div/div/div/h2/a")).click();
	        

}
}