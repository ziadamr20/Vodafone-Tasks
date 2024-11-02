package org.Pages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class C7_TodayDeals extends Setup{

    @BeforeMethod
    public void setup() throws IOException {
        setup_browser();
    }
    @Test
    public void DealsPage(){
        driver.get(configAmazon.getProperty("Amazon_url"));
        DealsPage.Deals();
    }
    @AfterMethod
    public void Quit(){
        driver.quit();
    }

}
