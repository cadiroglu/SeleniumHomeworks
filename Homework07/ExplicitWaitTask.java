package Homework07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitTask {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        driver.findElement(By.xpath("//button[@id='alert']")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20) );
        wait.until(ExpectedConditions.alertIsPresent()).accept();

        driver.findElement(By.xpath("//button[@id='populate-text']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Selenium Webdriver']")));
        String text = driver.findElement(By.xpath(" //h2[text()='Selenium Webdriver']")).getText();
        System.out.println("Displayed text is " + text);

        driver.findElement(By.xpath("//button[@id='display-other-button']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='hidden']")));
        System.out.println("Button is enabled " + driver.findElement(By.xpath("//button[@id='hidden']")).isDisplayed());

        driver.findElement(By.xpath("//button[@id='enable-button']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='disable']")));
        System.out.println("Disabled button " + driver.findElement(By.xpath("//button[@id='disable']")));

        driver.findElement(By.xpath("//button[@id='checkbox']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='checkbox']")));
        System.out.println("Click checkbox " + driver.findElement(By.xpath("//input[@type='checkbox']")));

        driver.close();







    }
}
