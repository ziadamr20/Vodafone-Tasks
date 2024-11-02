package org.Pages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class C1_Driver extends Setup{

    @BeforeMethod
    public void setup() throws IOException {
        setup_browser();
    }
    @Test
    public void URL_OPEN(){
        driver.get(configAmazon.getProperty("Amazon_url"));

    }
    @AfterMethod
    public void Quit(){
        driver.quit();
    }

}
