package org.Pages;

import org.testng.annotations.*;

import java.io.IOException;

public class C6_Cart_Check extends Setup{
    @BeforeMethod
    public void setup() throws IOException {
        setup_browser();
    }
    @Test
    public void addtocart(){
        driver.get(configAmazon.getProperty("Amazon_url"));
        loginPage.login(configAmazon.getProperty("username"), configAmazon.getProperty("password"));
        searchPage.searchForItem(configAmazon.getProperty("search_box"));
        cartPage.scrolldown();
        searchPage.selectFirstItem();
        cartPage.scrolldown();
        cartPage.addToCart();
        cartPage.scrolldown();
        cartPage.checkCart();
    }
    @AfterMethod
    public void Quit(){
        driver.quit();
    }

}
