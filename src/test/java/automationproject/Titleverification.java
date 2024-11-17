package automationproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titleverification {
public static void main(String[] args) {
        
       
        WebDriver driver= new ChromeDriver();

        
        driver.get("https://allmaintenance.in/");
        String expected="Professional Home Maintenance Services in Kerala";
        String actual=driver.getTitle();
        System.out.println(actual);
        if (actual.equals(expected)) {
        	System.out.println("pass");
        }
        else {
        	System.out.println("fail");
        }
        
       
      
    }

}
