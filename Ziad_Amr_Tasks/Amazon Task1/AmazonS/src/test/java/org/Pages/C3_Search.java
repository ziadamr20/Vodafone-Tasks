package org.Pages;

import org.testng.annotations.*;

import java.io.IOException;

public class C3_Search extends Setup{


    @BeforeMethod
    public void setup() throws IOException {
        setup_browser();
    }
    @Test
    public void Search(){
        driver.get(configAmazon.getProperty("Amazon_url"));
        loginPage.login(configAmazon.getProperty("username"), configAmazon.getProperty("password"));
        searchPage.searchForItem(configAmazon.getProperty("search_box"));
    }
    @AfterMethod
    public void Quit(){
        driver.quit();
    }

}
