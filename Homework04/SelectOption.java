package Homework04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SelectOption {
    public static void main(String[] args) throws InterruptedException {
    /* Goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
    1. u need to write down the code that can select  1 check box out of 4 mentioned,
       e.g option1 , option2 , option 3, option 4
    Note write down the logic in dynamic way
     i.e one change in if else condition can change ur selection */

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        List<WebElement> demoBoxes = driver.findElements(By.cssSelector("input[class='cb1-element']"));
        for (WebElement demobox:demoBoxes) {
        String box=demobox.getAttribute("value");
        if (box.equals("Option-3"))
        demobox.click();
        Thread.sleep(2000);
        driver.quit();

            }

        }}
