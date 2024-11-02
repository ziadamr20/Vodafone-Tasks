package org.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonDealsPage {
    private WebDriver driver;
    private WebDriverWait wait;

    By Dissmiss = By.xpath("//*[@id=\"nav-main\"]/div[1]/div/div/div[3]/span[1]/span/input");
    By Today_Deals_Button = By.xpath("//*[@id=\"nav-xshop\"]/a[1]");
    By see_more = By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[2]/div[1]/button");
    By Grocery_Button = By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[2]/div[1]/div/span[13]/div");
/*you can only choose one option Grocery Or Electronic (headphone) remove comment if you want to choose headphone*/
//  By Headphone_Button = By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[2]/div[1]/div/span[12]/div");
    By Discount_Button = By.xpath("//div[@data-csa-c-element-id="+ "'filter-departments-Grocery & Gourmet Food']");

    By itemSelect = By.className("ProductCard-module__card_uyr_Jh7WpSkPx4iEpn4w");

    public AmazonDealsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    public void Deals() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Dissmiss)).click();
        wait.until(ExpectedConditions.elementToBeClickable(Today_Deals_Button)).click();
        wait.until(ExpectedConditions.elementToBeClickable(see_more)).click();
        wait.until(ExpectedConditions.elementToBeClickable(Grocery_Button)).click();
 /*you can only choose one option Grocery Or Electronic (headphone) remove comment if you want to choose headphone*/
//      wait.until(ExpectedConditions.elementToBeClickable(Headphone_Button)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Discount_Button)).click();
        wait.until(ExpectedConditions.elementToBeClickable(itemSelect)).click();
    }

}
