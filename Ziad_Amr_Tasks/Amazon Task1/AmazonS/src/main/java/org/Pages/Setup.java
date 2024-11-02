package org.Pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Setup {
    protected WebDriver driver;
    protected Properties configAmazon;
    protected AmazonLoginPage loginPage;
    protected AmazonSearchPage searchPage;
    protected AmazonCartPage cartPage;
    protected AmazonDealsPage DealsPage;

    public void setup_browser() throws IOException {
        FileInputStream fis = new FileInputStream("src/main/resources/configAmazon.properties");
        configAmazon = new Properties();
        configAmazon.load(fis);
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1024, 768));
//        driver.manage().window().maximize();
        loginPage = new AmazonLoginPage(driver);
        searchPage = new AmazonSearchPage(driver);
        cartPage = new AmazonCartPage(driver);
        DealsPage = new AmazonDealsPage(driver);
    }
}
