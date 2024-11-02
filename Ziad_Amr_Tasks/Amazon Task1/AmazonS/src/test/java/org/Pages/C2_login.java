package org.Pages;

import org.testng.annotations.*;

import java.io.IOException;

public class C2_login extends Setup{


    @BeforeMethod
    public void setup() throws IOException {
        setup_browser();
    }
                    /*<!-- Please provide valid username and password -->*/
/*<!-- Reference: {resources/configAmazon.properties} - Use the fields 'username' and 'password' -->*/

    @Test
    public void login_page(){
        driver.get(configAmazon.getProperty("Amazon_url"));
        loginPage.login(configAmazon.getProperty("username"), configAmazon.getProperty("password"));
    }
    @AfterMethod
    public void Quit(){
        driver.quit();
    }

}
