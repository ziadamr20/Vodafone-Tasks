package org.Pages;

import org.testng.annotations.*;

import java.io.IOException;

public class C4_item_Select extends Setup{


    @BeforeMethod
    public void setup() throws IOException {
        setup_browser();
    }
    @Test
    public void Item_select(){
        driver.get(configAmazon.getProperty("Amazon_url"));
        loginPage.login(configAmazon.getProperty("username"), configAmazon.getProperty("password"));
        searchPage.searchForItem(configAmazon.getProperty("search_box"));
        cartPage.scrolldown();
        searchPage.selectFirstItem();
    }
    @AfterMethod
    public void Quit(){
        driver.quit();
    }

}
