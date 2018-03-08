package com.kodilla.testing2.google;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApp {
    public static final String SEARCHFIELD = "lst-ib";

    public static void main(String[] args) throws Exception {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        //driver.manage().window().fullscreen();
        driver.get("https://www.google.com");

        WebElement searchField = driver.findElement(By.id(SEARCHFIELD));
        searchField.sendKeys("Kodilla");
        searchField.submit();

//        Thread.sleep(5000);
//        driver.close();
    }
}
