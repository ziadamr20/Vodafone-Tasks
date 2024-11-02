package org.pages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.*;

public class GetDriver extends Setup {

    @BeforeMethod
    public void setup() throws IOException {
        setup_browser();
    }
    @Test
    public void openurl(){
        driver.get(config_ksrtc.getProperty("url"));
    }

    @AfterMethod
    public void close(){
        driver.quit();
    }
}