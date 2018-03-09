package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    private static final String XPATH_DAY = "//div[contains(@class, \"5k_5\")]/span/span/select[1]";
    private static final String XPATH_MONTH = "//div[contains(@class, \"5k_5\")]/span/span/select[2]";
    private static final String XPATH_YEAR = "//div[contains(@class, \"5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");

        WebElement comboDay = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(comboDay);
        selectDay.selectByIndex(7);

        WebElement comboMonth = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(comboMonth);
        selectMonth.selectByIndex(12);

        WebElement comboYear = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(comboYear);
        selectYear.selectByIndex(37);
    }
}
