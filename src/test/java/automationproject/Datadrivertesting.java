package automationproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadrivertesting {
    ChromeDriver driver;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void url() {
        driver.get("https://allmaintenance.in/");
    }

    @Test
    public void test1() throws IOException {
    	driver.findElement(By.xpath("//*[@id=\"menu-item-33\"]/a")).click();
    	WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/section[8]/div/div[2]/div/div/div/div/form/div[2]/div/div/input")); 
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        File f = new File("C:\\Users\\Asus\\Documents\\autpro.xlsx");
        FileInputStream fi = new FileInputStream(f);
        XSSFWorkbook wb = new XSSFWorkbook(fi);
        XSSFSheet sh = wb.getSheet("Sheet1");

        System.out.println("Total rows: " + sh.getLastRowNum());

       
        for (int i = 1; i <= sh.getLastRowNum(); i++) {
            String yourname = sh.getRow(i).getCell(0).getStringCellValue();
            System.out.println("Username = " + yourname);
            String email = sh.getRow(i).getCell(1).getStringCellValue();
            System.out.println("Password = " + email);

            
            driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/section[8]/div/div[2]/div/div/div/div/form/div[2]/div/div/input")).clear();
            driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/section[8]/div/div[2]/div/div/div/div/form/div[2]/div/div/input")).sendKeys(yourname);
            driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/section[8]/div/div[2]/div/div/div/div/form/div[3]/div/div/input")).clear();
            driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/section[8]/div/div[2]/div/div/div/div/form/div[3]/div/div/input")).sendKeys(email);
            driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/section[8]/div/div[2]/div/div/div/div/form/div[3]/div/div/input")).sendKeys("swt@gmail.com");
            WebElement elet = driver.findElement(By.xpath("//*[@id=\"forminator-module-339\"]/div[6]/div/div/button")); 
            JavascriptExecutor j = (JavascriptExecutor) driver;
            j.executeScript("arguments[0].scrollIntoView(true);", elet);
            driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/section[8]/div/div[2]/div/div/div/div/form/div[6]/div/div/button")).click();
        }

        
    }
}

