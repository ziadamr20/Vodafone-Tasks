package org.pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Setup {
    protected WebDriver driver;
    protected Properties config_ksrtc;


    public void setup_browser() throws IOException {
        FileInputStream fis = new FileInputStream("src/main/resources/config_ksrtc.properties");
        config_ksrtc = new Properties();
        config_ksrtc.load(fis);
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1024, 768));
    }
}
