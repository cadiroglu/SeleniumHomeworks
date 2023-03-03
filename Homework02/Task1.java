package Homework02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        /*navigate to
        https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        fill out the form
        click on register
        close the browser*/
        System.setProperty("webdriver.chrome.driver","driver/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.name("customer.firstName")).sendKeys("Tom");
        Thread.sleep(1000);
        driver.findElement(By.name("customer.lastName")).sendKeys("Brown");
        Thread.sleep(1000);
        driver.findElement(By.name("customer.address.street")).sendKeys("1122 Fisher road");
        Thread.sleep(1000);
        driver.findElement(By.name("customer.address.city")).sendKeys("Queens");
        Thread.sleep(1000);
        driver.findElement(By.name("customer.address.state")).sendKeys("NY");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("11005");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("2125432325");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.ssn")).sendKeys("123456785");
        Thread.sleep(1000);
        driver.findElement(By.name("customer.username")).sendKeys("Brown110");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.password")).sendKeys("TB12345$");
        Thread.sleep(1000);
        driver.findElement(By.name("repeatedPassword")).sendKeys("TB12345$");
        Thread.sleep(1000);
        driver.findElement(By.className("button")).click();
        Thread.sleep(2000);
        driver.close();


    }
}
