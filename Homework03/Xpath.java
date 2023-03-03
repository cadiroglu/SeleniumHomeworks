package Homework03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {


   /*enter the message in the text box
    click on show message
    Enter value of a
    Enter value of B
    click on the button get total
    also please print the value of the attribute type of the button GET TOTAL*/

        System.setProperty("webdriver.chrome.driver","driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");

        WebElement text = driver.findElement(By.xpath("//input[@id='user-message']"));
        text.sendKeys("Selenium is fun");
        WebElement showmessage = driver.findElement(By.xpath("//button[@onclick='showInput();']"));
        showmessage.click();
        WebElement valueA = driver.findElement(By.xpath("//input[@id='sum1']"));
        valueA.sendKeys("5");
        WebElement valueB = driver.findElement(By.xpath("//input[@id='sum2']"));
        valueB.sendKeys("6");
        WebElement getTotal = driver.findElement(By.xpath("//button[@onclick='return total()']"));
        getTotal.click();

    }
}
