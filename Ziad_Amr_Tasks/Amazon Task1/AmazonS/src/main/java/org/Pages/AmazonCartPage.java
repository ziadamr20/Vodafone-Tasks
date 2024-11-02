package org.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonCartPage {
    private WebDriver driver;
    private WebDriverWait wait;

    By cartButton = By.xpath("//*[@id=\"add-to-cart-button\"]");
    By closeButton = By.xpath("//*[@id=\"abb-intl-pop-cta\"]/span[3]");
    By GO_TO_Cart_Button = By.xpath("//*[@id=\"sw-gtc\"]/span/a");

    public AmazonCartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(25));
    }
    public void addToCart() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(cartButton));
        driver.findElement(cartButton).click();
        wait.until(ExpectedConditions.elementToBeClickable(closeButton));
        driver.findElement(closeButton).click();

    }
    public void scrolldown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(50, 150);");
    }
    public void checkCart(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(GO_TO_Cart_Button));
        driver.findElement(GO_TO_Cart_Button).click();
    }



}
