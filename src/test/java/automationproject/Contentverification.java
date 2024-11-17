package automationproject;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Contentverification {

		
		    public static void main(String[] args) {
		        WebDriver driver = new ChromeDriver();
		        driver.get("https://allmaintenance.in/");

		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the expected content: ");
		        String expected = sc.nextLine(); 
		        String actual = driver.getPageSource();

		        if (actual.contains(expected)) {
		            System.out.println("pass");
		        } else {
		            System.out.println("fail");
		        }

		       
		        
		    }
		


	}


