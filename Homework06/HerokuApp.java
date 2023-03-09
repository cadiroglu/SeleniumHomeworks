package Homework06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HerokuApp {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button")).click();
        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@id='finish']")).click();
        driver.findElement(By.xpath("//h4[text()='Hello World!']"));
        driver.close();


        System.out.println("Hello World" +" is now displayed");
    }
}
