package com.kodilla.testing2.crudappp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CrudAppTestingApp {

    public static final String XPATH_INPUT = "//html/body/main/section/form/fieldset/input";
    public static final String XPATH_TEXTAREA = "//html/body/main/section/form/fieldset/textarea";
    public static final String XPATH_SELECT = "//select[1]";
    private static final String XPATH_SELECT_2 = "//div[contains(@class, \"tasks-container\")]/form/div/fieldset/select[2]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://cholewa.pro");

        WebElement searchField = driver.findElement(By.xpath(XPATH_INPUT));
        searchField.sendKeys("New robotic Task");

        WebElement textAreaField = driver.findElement(By.xpath(XPATH_TEXTAREA));
        textAreaField.sendKeys("The robotic content");

        //because page use AJAX we have to wait until page is fully loaded
        while (!driver.findElement(By.xpath(XPATH_SELECT)).isDisplayed());
//        final WebDriverWait driverWait = new WebDriverWait(driver, 10L);
//        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[4]")));

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_SELECT));
        Select selectBoard = new Select(selectCombo);
        selectBoard.selectByIndex(1);

        WebElement selectCombo2 = driver.findElement(By.xpath(XPATH_SELECT_2));
        Select selectBoard2 = new Select(selectCombo2);
        selectBoard2.selectByIndex(1);
    }
}
