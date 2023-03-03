package Homework02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
      /*  HW2
        navigate to fb.com
        click on create new account
        fill up all the TextBoxes
        click on sign up button
        close the pop-up
        close the browser*/


        System.setProperty("webdriver.chrome.driver","driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("John");
        Thread.sleep(1000);
        driver.findElement(By.name("lastname")).sendKeys("Snow");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_email__")).sendKeys("kingofthenorth@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("kingofthenorth@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("password_step_input")).sendKeys("12345");
        Thread.sleep(1000);
        driver.findElement(By.name("websubmit")).click();
        driver.quit();

    }
}
