package Homework04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) {

        /*goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
        check if the checkbox    "click on this check box" is Selected
        if no  Select the checkbox
        check gain if the checkbox is Selected or not
        */


        System.setProperty("webdriver.chrome.driver","driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        WebElement checkbox = driver.findElement(By.cssSelector("input[type='checkbox']"));
        checkbox.click();

        boolean isSelectedcheckbox = checkbox.isSelected();
        if (!isSelectedcheckbox){
            checkbox.click();
        }

       isSelectedcheckbox=checkbox.isSelected();
        System.out.println("The status of box is "+ isSelectedcheckbox);

        driver.quit();
    }
}
