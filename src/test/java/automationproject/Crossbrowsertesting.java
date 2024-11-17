package automationproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowsertesting {
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void setup(String browser) {
		if(browser.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Chrome")) {
			driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
		}
	}
	@Test
	public void fb() {
		driver.get("https://allmaintenance.in/");
	}


}