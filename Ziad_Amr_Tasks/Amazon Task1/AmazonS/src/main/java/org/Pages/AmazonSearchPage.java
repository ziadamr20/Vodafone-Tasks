package org.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonSearchPage {
    private WebDriver driver;
    private WebDriverWait wait;

    By searchBox = By.id("twotabsearchtextbox");
    By searchButton = By.id("nav-search-submit-text");
    By firstItem = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]");

    public AmazonSearchPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void searchForItem(String searchText) {
        wait.until(ExpectedConditions.elementToBeClickable(searchBox)).sendKeys(searchText);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
    }

    public void selectFirstItem() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstItem)).click();
    }
}
