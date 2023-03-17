package Homework08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.SQLOutput;
import java.util.List;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
        driver.findElement(By.xpath("//b[text()='PIM']")).click();

        List<WebElement> Rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
       for (int i = 0; i < Rows.size(); i++) {
           String Num=Rows.get(i).getText();
           if (Num.equalsIgnoreCase("52306A")){
               System.out.println(Num);
               System.out.println("Num is "+(i+2));

             WebElement checkbox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i+2)+"]/td[1]/input"));
             checkbox.click();

               System.out.println(checkbox.isSelected());
               driver.quit();




            }

        }
    }
}
