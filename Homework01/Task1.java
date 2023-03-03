package Homework01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        //navigate to amazon web site
        driver.get("https://www.amazon.com/");

        //print out the title and the url

        String URL = driver.getCurrentUrl();

        System.out.println(URL);

        String title = driver.getTitle();
        System.out.println("The title of the page is " + title);

        driver.quit();
    }

}






