package Homework06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class InternetHerokuApp {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame(0);
        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
        WebElement  content = driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
        content.clear();
        content.sendKeys("Hello World");
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame(0);
    }
}
